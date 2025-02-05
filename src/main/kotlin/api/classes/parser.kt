@file:Suppress("RedundantLambdaOrAnonymousFunction")

package api.classes

import api.data.FileNode
import api.data.Token
import api.data.TokenType
import api.tools.print
import api.tools.then
import java.util.Stack
/**
 * 语法分析仪
 * Parser
 * @property tokens 词法分析生成的标记列表
 * @property debug 是否启用调试模式
 * @constructor 创建语法分析仪实例
 * @author Redemption
 */
class Parser(
    val tokens: List<Token>,
    val debug: Boolean
) {
    /**
     * 产生式
     * Production
     * @constructor 创建产生式实例
     * @author Redemption
     */
    inner class Production {
        /**
         * 文本数据
         * String data
         */
        val stringData by lazy { mutableMapOf<String, String>() }
        
        /**
         * 整数数据
         * Integer data
         */
        val integerData by lazy { mutableMapOf<String, Int>() }
        
        /**
         * 浮点数数据
         * Float data
         */
        val floatData by lazy { mutableMapOf<String, Double>() }
        
        /**
         * 任意数据
         * Any data
         */
        val data by lazy { mutableMapOf<String, Any>() }
        
        /**
         * 终结或者继续
         * Finish or continue
         * @param code 成功或失败时的代码对
         * @return 成功时执行第一个代码块，失败时执行第二个代码块
         */
        infix fun <T> Boolean.finishWith(code: Pair<() -> T, () -> T>): T =
            if (this) {
                code.first()
            } else {
                code.second()
            }
        
        /**
         * 调用代码块
         * Invoke code block
         * @param code 要调用的代码块
         * @return 成功和失败的代码对
         */
        operator fun <T> (()->T).invoke(code: ()->T): Pair<()->T,()->T> = this to code
        
        /**
         * 将信息存入缓存数据
         * Store information in cache data
         * @param name 数据名称
         */
        infix fun Token.name(name: String) {
            stringData[name] = this.text
            debug then {
                "将标记的文本置入'${name}'".print("语法分析日志[${justNow.last()}]")
            }
        }
    }
    /**
     * 产生式映射
     * Production map
     * 用于存储产生式名称及其对应的代码块
     * @property ps 产生式名称到代码块的映射
     */
    val ps = mutableMapOf<String, () -> Any?>()
    /**
     * 当前处理的产生式栈
     * Current production stack
     * 用于记录当前处理的产生式名称
     * @property justNow 产生式名称的栈
     */
    private var justNow = Stack<String>().apply { push("root") }
    
    /**
     * 调用一个产生式
     * Invoke a production
     * @return 产生式的结果
     */
    val data = mutableMapOf<String,Any?>()
    operator fun <T> String.invoke(): T {
        debug then {
            "调用产生式'${this}'".print("语法分析日志[${justNow.last()}]")
        }
        justNow.push(this)
        val obj = ps[this]!!().apply { data[this@invoke] = this } as T
        justNow.pop()
        debug then {
            "产生式'${this}'结束,上升至产生式${justNow.last()}".print("语法分析日志[${justNow.last()}]")
        }
        return obj
    }
    fun <T> String.get():T = data[this] as T
    /**
     * 取当前标记
     * Get current token
     */
    val now: Token get() = tokens[index].apply {
        debug then {
            "获取当前标记'${this.text}'<${this.type}>".print("语法分析日志[${justNow.last()}]")
        }
    }
    /**
     * 根方法
     * Root method
     */
    lateinit var root: () -> FileNode
    
    /**
     * root节点返回模块树
     * Root node returns module node
     * @param code 产生式的代码块
     */
    fun root(code: Production.() -> FileNode) {
        root = {
            debug then {
                "开始语法分析".print("语法分析日志[${justNow.last()}]")
            }
            Production().code()
        }
    }
    
    /**
     * 定义一个产生式
     * Define a production
     * @param code 产生式的代码块
     */
    operator fun <T> String.invoke(code: Production.() -> T) {
        ps[this] = {
            Production().code()
        }
    }
    
    /**
     * 匹配标记类型,不符合则报错,并且会调用next
     * Match token type, throw an error if it doesn't match, and call next
     * @param type 期望的标记类型
     * @return 匹配的标记
     * @throws Exception 如果标记类型不匹配
     */
    infix fun Token.match(type: TokenType): Token {
        if (this.type != type) {
            throw Exception("语法分析错误:期望'$type',实际'${this.type}'")
        }
        return now.apply { next() }
    }
    
    /**
     * 符合某条件则返回值,反正执行匿名函数
     * Return value if condition is true, otherwise execute anonymous function
     * @param code 要执行的代码
     */
    inline infix fun <reified T> Boolean.finishWith(code: T) {
        if (this) {
            code
        }
    }
    
    /**
     * 是该类型则返回真
     * Return true if the token is of the specified type
     * @param type 标记类型
     * @return 是否匹配
     */
    infix fun Token.isOf(type: TokenType): Boolean {
        return (this.type == type).apply {
            debug then {
                "检查'${this@isOf.text}'<${this@isOf.type}>的类型为<${type}>,结果为$this".print("语法分析日志[${justNow.last()}]")
            }
        }
    }
    
    /**
     * 反之
     * Return true if the token is not of the specified type
     * @param type 标记类型
     * @return 是否不匹配
     */
    infix fun Token.isNotOf(type: TokenType): Boolean {
        return (this.type != type).apply {
            debug then {
                "检查'${this@isNotOf.text}'<${this@isNotOf.type}>的类型不为<${type}>,结果为$this".print("语法分析日志[${justNow.last()}]")
            }
        }
    }
    
    /**
     * 下一个标记
     * Next token
     */
    fun next() = ++index
    
    /**
     * 给所有符号重载!以表示next
     * Overload ! for next
     * @return 当前对象
     */
    operator fun <T> T.not(): T = this.apply { next() }
    
    /**
     * 索引
     * Index
     */
    var index: Int = 0
    
    /**
     * 向前看
     * Peek next token
     */
    val peek: Token get() = tokens[index + 1]
    
    /**
     * 有数字的向前看
     * Peek token with offset
     * @return 偏移后的标记
     */
    val Int.peek: Token get() = tokens[index + 1 + this]
    
    /**
     * 开始分析
     * Start parsing
     */
    val ast: FileNode get() = root()
}

/**
 * 解析标记列表为模块树
 * Parse token list to module node
 * @param show 是否显示调试信息
 * @param code 语法分析器配置函数
 * @return 模块树
 */
fun List<Token>.parse(show: Boolean = false, code: Parser.() -> Unit): FileNode = Parser(this, show).run {
    code()
    ast
}
