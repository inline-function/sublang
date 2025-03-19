package api.classes

import api.classes.Checker.Information
import api.classes.Checker.Message
import api.data.CheckedInfo
import api.data.InnerNode
import api.data.Node
import api.data.ProjectNode
import api.data.ProjectTree
import api.data.TopTree
import api.data.Tree
import api.tools.None
import api.tools.Some
import api.tools.some

//从LRM获取Message
infix fun InnerNode.toLog(log : String) = Message(line,row,fileName,log)
//语义分析器
class Checker(
    val theTree : ProjectNode
) {
    //一条信息
    data class Message(
        //信息行
        val line : Int,
        //信息列
        val row : Int,
        //信息模块
        val module : String?,
        //信息内容
        val log : String
    )
    //检查信息
    data class Information(
        //提示级别信息
        val tips : List<Message> = listOf(),
        //警告级别内容
        val warnings : List<Message> = listOf(),
        //错误级别内容
        val errors : List<Message> = listOf()
    ){
        override fun toString() : String = StringBuilder().apply {
            {it:List<Message>,level:String ->
                it.forEach {
                    append("$level:${it.log}${if(it.module != null) "(${it.module}:${it.line},${it.row})" else ""}")
                    append("\n")
                }
            }.apply {
                this(tips,"提示")
                this(warnings,"警告")
                this(errors,"错误")
            }
        }.toString()
    }
    //环境
    inner class Env<out T : Node,U : Tree>(
        //当前树
        val node : T,
        //父环境
        val parent : Env<*,*>? = null,
        //当前环境的符号
        val symbols : MutableList<TopTree> = mutableListOf()
    ){
        //添加符号
        @Deprecated("建议替换为!运算符",ReplaceWith("!this"))
        val <T:TopTree> T.put : T get() = this.apply{symbols.add(this@put)}
        //添加符号
        operator fun <T:TopTree> T.not() = this.apply{symbols.add(this@not)}
        //查找符号
        @Suppress("UNCHECKED_CAST")
        fun <T : TopTree> findSymbol(need: String,code: (TopTree) -> Boolean)
            =generateSequence(this@Env as Env<*,*>){ it.parent }
            .flatMap { it.symbols.asSequence() }
            .firstOrNull(code)
            .run{
                if (this != null)
                    (this as T).some
                else
                    None.apply { error("未在本作用域及父作用域内找到该标识符:'$need'") }
            }
        //仅查找符号
        @Suppress("UNCHECKED_CAST")
        fun <T : TopTree> onlyFindSymbol(code: (TopTree) -> Boolean)
            =generateSequence(this@Env as Env<*,*>){it.parent}
            .flatMap{it.symbols.asSequence()}
            .firstOrNull(code)
            ?.run{Some(this as T)}
            ?:None
        //散数据
        val someData by lazy{ mutableMapOf<String,Any?>() }
        //数据存储
        val data by lazy{ mutableMapOf<String,MutableList<Any?>>() }
        //存放到数据组
        infix fun Any?.of(name : String){
            if (!data.containsKey(name)){
                data[name] = mutableListOf()
            }
            data[name]!!.add(this)
        }
        //获取数据组
        @Suppress("UNCHECKED_CAST")
        @JvmName("getData")
        fun <T> get(name : String) : MutableList<T> = data[name] as MutableList<T>
        //从数据组中获取数据
        @Suppress("UNCHECKED_CAST")
        infix fun <T> Int.from(list : String) : T? = data[list]!![this] as T
        //获取数据
        @Suppress("UNCHECKED_CAST")
        fun <T> String.get() : T = someData[this] as T
        //存放到数据
        infix fun <T : Any> T.nameof(name : String) = this.apply{
            someData[name] = this
        }
        //返回外部类
        val outer : Checker get() = this@Checker
        //进入任务并且创建伪子环境
        @JvmName("thisTask")
        inline fun <reified TT : Node,reified UU : Tree> TT.task() : UU = task(this)
        inline fun <reified TT : Node,reified UU : Tree> task(node : TT) : UU = call(Env(node,this,symbols))
        inline infix fun <reified TT : Node> TT.taskOf(name : String) = task<TT,Tree>(this) of name
        inline infix fun <reified TT : Node> TT.taskName(name : String) = task<TT,Tree>(this) nameof name
        //对列表进行依次任务
        inline fun <reified T : Node,reified R : Tree> List<T>.mapTask() : List<R> = map{task(it)}
        //进入任务并且创建真子环境
        inline fun <reified TT : Node,reified UU : Tree> goInto(node : TT) : UU = call(Env(node,this))
        inline infix fun <reified TT : Node> TT.intoOf(name : String) = task<TT,Tree>(this) of name
        inline infix fun <reified TT : Node> TT.intoName(name : String) = task<TT,Tree>(this) nameof name
        //对列表进行环境依次任务
        inline fun <reified TT : Node,reified UU : Tree> List<TT>.mapInto() : List<UU> = map{goInto(it)}
    }
    //字符串与匿名函数的联合
    infix fun <T> List<T>.log(code : (T)->String) = Pair(this,code)
    //遍历检查重名,如果返回两个相同值则累加进错误信息中
    infix fun <T:Node> Pair<List<T>,(T)->String>.duplicate(code : (T)->Any) {
        val (mods,log) = this
        val map = mutableMapOf<Any,T>()
        var fst = true
        mods.forEach {
            code(it).apply {
                if (map.containsKey(this)) {
                    if (fst) {
                        map[this]!! error log(map[this]!!)
                        fst = false
                    }
                    it error log(it)
                }
                map[this] = it
            }
        }
    }
    //信息
    //private val tips = mutableListOf<Message>()
    private val check : MutableList<Message>.(Message)->Boolean = {
        if(!contains(it)) {
            add(it)
        }
        true
    }
    private val tips = mutableListOf<Message>()
    //警告
    private val warnings = mutableListOf<Message>()
    //错误
    private val errors = mutableListOf<Message>()
    //提示信息
    infix fun Node.tip(log : String) = None.also {
        when (this) {
            is InnerNode -> tips.check(this toLog log)
            else -> tips.check(Message(-1,-1,null,log))
        }
    }
    //警告信息
    infix fun Node.warn(log : String) = None.also {
        when (this) {
            is InnerNode -> warnings.check(this toLog log)
            else -> warnings.check(Message(-1,-1,null,log))
        }
    }
    //错误信息
    infix fun Node.error(log : String) = None.also {
        when (this) {
            is InnerNode -> errors.check(this toLog log)
            else -> errors.check(Message(-1,-1,null,log))
        }
    }
    //获取信息
    val information : Information get() = Information(tips,warnings,errors)
    //存储行为
    val actions = mutableMapOf<Any?,Any?>()
    //调用相应的行为
    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Node,reified U : Tree> call(env : Env<T,U>) : U{
        return if(actions.contains(T::class)){
            (actions[T::class] as Env<T,U>.()->U).invoke(env)
        }else{
            throw Exception("语义分析错误:行为'${T::class.simpleName}'不存在")
        }
    }
    //在树内的行为
    inline fun <reified T : Node,reified U : Tree> on(noinline code : Env<T,U>.()->U){
        actions[T::class] = code
    }
    //从节点信息上获取检查信息
    val Env<InnerNode,*>.infor get() = CheckedInfo(this.node.line,this.node.row,this.node.fileName)
}
//开始制定规则
fun ProjectNode.rule(show : Boolean = false,code : Checker.()->Unit) : Pair<ProjectTree,Information>{
    val checker = Checker(this)
    checker.code()
    val p = checker.call(checker.Env(this)).run { this as ProjectTree to checker.information }
    return p
}
