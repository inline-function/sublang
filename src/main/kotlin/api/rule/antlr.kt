package api.rule

import api.antlr.SublimationLexer
import api.antlr.SublimationParser
import api.antlr.SublimationParser.*
import api.data.AnnotationNode
import api.data.BlockNode
import api.data.ExprNode
import api.data.ExprNode.*
import api.data.FileNode
import api.data.InnerNode
import api.data.SENode.*
import api.data.StmtNode
import api.data.TopNode
import api.data.TopNode.DataNode
import api.data.TopNode.StructNode
import api.data.TypeNode
import api.data.TypeNode.*
import api.tools.notNull
import api.tools.print
import api.tools.then
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext

val String.ast : (String)->FileNode get() = {
    //通过antlr转换语法树
    val tree = this.antlr
    //暂时存储顶层数据
    val list = mutableListOf<TopNode>()
    //判断顶层语句类型
    tree.top().forEach {it1->
        if(it1.data()!=null){
            //是数据分支
            list.add(it.data(it1.data()))
        }else{
            //是结构体分支
            list.add(it.struct(it1.struct()))
        }
    }
    //返回文件节点
    FileNode(
        name = it,
        tops = list
    )
}
private fun String.struct(struct : StructContext) : StructNode{
    return StructNode(
        innerNode = struct.lrm(this),
        name = struct.ID().text,
        data = mutableListOf<DataNode>().apply{
            struct.data().forEach {it1->
                data(it1).apply {
                    notNull {
                        add(this)
                    }
                }
            }
        },
        annotations = mutableListOf<AnnotationNode>().apply {
            struct.anns().ann().forEach {
                add(this@struct.annotation(it))
            }
        },
    )
}
private fun String.annotation(annotation : AnnContext) : AnnotationNode{
    val name = annotation.name(0)
    var value : String? = null
    annotation.NUMBER() notNull {
        value = annotation.NUMBER().text
    }
    annotation.STRING() notNull {
        value = annotation.STRING().text.run { substring(1,this.length-1) }
    }
    (annotation.name().size == 2) then {
        value = annotation.name(1).text
    }
    return AnnotationNode(
        innerNode = annotation.lrm(this),
        name = AccessChainNode(
            innerNode = annotation.lrm(this),
            chain = mutableListOf<String>().apply {
                name.ID().forEach { add(it.text) }
            }
        ),
        value = value
    )
}
private fun String.data(data : DataContext) = DataNode(
    innerNode = InnerNode(
        line = data.start.line,
        row = data.start.charPositionInLine,
        moduleName = this
    ),
    annotations = mutableListOf<AnnotationNode>().apply {
        data.anns().ann().forEach {
            add(this@data.annotation(it))
        }
    },
    name = data.ID().text,
    type = data.type()?.run{ this@data.type(this) },
    value = data.expr()?.run{ this@data.expr(this)}
)
private fun String.expr(expr : ExprContext) : ExprNode{
    val left = expr.expr__()?.run {
        when{
            expr()!=null -> {
                this@expr.expr(expr())
            }
            NUMBER()!=null -> {
                fun <T : Any> fvn(func : String.()->T)
                    = FaceValueNode(
                        innerNode = lrm(this@expr),
                        value = NUMBER().text.func()
                    )
                fvn(if (NUMBER().text.contains("."))
                    String::toDouble
                else
                    String::toLong
                )
            }
            STRING()!=null -> FaceValueNode(
                innerNode = lrm(this@expr),
                value = STRING().text.run { substring(1,this.length-1) }
            )
            lambda()!=null -> LambdaNode(
                innerNode = lrm(this@expr),
                params = mutableListOf<DataNode>().apply{
                    if(lambda().data().isNotEmpty()){
                        lambda().data().forEach {
                            add(this@expr.data(it))
                        }
                    }else{
                        lambda().name().forEachIndexed { index, nameContext ->
                            add(
                                DataNode(
                                    innerNode = lrm(this@expr),
                                    annotations = mutableListOf<AnnotationNode>().apply {
                                        lambda().anns(index).ann().forEach {
                                            add(this@expr.annotation(it))
                                        }
                                    },
                                    name = nameContext.text,
                                    type = null
                                )
                            )
                        }
                    }
                },
                block = BlockNode(
                    innerNode = lrm(this@expr),
                    stmts = mutableListOf<StmtNode>().apply {
                        lambda().block().stmt().forEach { it1 ->
                            stmt(it1).apply {
                                add(this)
                            }
                        }
                    }
                )
            )
            invoke()!=null -> InvokeNode(
                innerNode = lrm(this@expr),
                name = AccessChainNode(
                    innerNode = lrm(this@expr),
                    chain = mutableListOf<String>().apply {
                        invoke().name().ID().forEach { add(it.text) }
                    }
                ),
                args = mutableListOf<ExprNode>().apply {
                    invoke().expr().forEach { it1 ->
                        add(expr(it1))
                    }
                }
            )
            name()!=null -> AccessChainNode(
                innerNode = lrm(this@expr),
                chain = mutableListOf<String>().apply {
                    name().ID().forEach { add(it.text) }
                }
            )
            else -> null.print()
        }
    } ?: PrefixInvokeNode(
        innerNode = expr.prefixInvoke().lrm(this@expr),
        name = AccessChainNode(
            innerNode = expr.prefixInvoke().lrm(this@expr),
            chain = mutableListOf<String>().apply {
                expr.prefixInvoke().name().ID().forEach { add(it.text) }
            }
        ),
        args = expr(expr.prefixInvoke().expr())
    )
    @Suppress("FunctionName")
    fun expr_lambda(left : ExprNode) : ExprNode{
        return expr.expr__().expr_().run{
            try {
                when{
                    infixInvoke()!=null -> InfixInvokeNode(
                        innerNode = expr.lrm(this@expr),
                        name = AccessChainNode(
                            innerNode = expr.lrm(this@expr),
                            chain = mutableListOf<String>().apply {
                                infixInvoke().name().ID().forEach { add(it.text) }
                            }
                        ),
                        args = left to expr(infixInvoke().expr())
                    )
                    else -> left
                }
            } catch (e:Exception) {
                left
            }
        }
    }
    return expr_lambda(left)
}
private fun String.stmt(stmt : StmtContext) : StmtNode
= stmt.run{
    when{
        /*assign()!=null -> AssignNode(
            innerNode = this.lrm(this@stmt),
            name = AccessChainNode(
                innerNode = this.lrm(this@stmt),
                chain = mutableListOf<String>().apply {
                    this@run.assign().name().ID().forEach{
                        add(it.text)
                    }
                }
            ),
            value = this@stmt.expr(assign().expr())
        )*/
        data()!=null -> DataNode(
            innerNode = this.lrm(this@stmt),
            name = data().ID().text,
            type = data().type()?.run { type(this) },
            value = data().expr()?.run { expr(this) },
            annotations = data().anns().ann().map{ annotation(it) }
        )
        invoke()!=null -> InvokeNode(
            innerNode = this.lrm(this@stmt),
            name = AccessChainNode(
                innerNode = this.lrm(this@stmt),
                chain = mutableListOf<String>().apply {
                    this@run.invoke().name().ID().forEach{
                        add(it.text)
                    }
                }
            ),
            args = mutableListOf<ExprNode>().apply {
                invoke().expr().forEach {
                    add(this@stmt.expr(it))
                }
            }
        )
        prefixInvoke()!=null -> PrefixInvokeNode(
            innerNode = this.lrm(this@stmt),
            name = AccessChainNode(
                innerNode = this.lrm(this@stmt),
                chain = prefixInvoke().name().ID().map{ it.text }
            ),
            args = this@stmt.expr(prefixInvoke().expr())
        )
        infixInvoke()!=null -> InfixInvokeNode(
            innerNode = this.lrm(this@stmt),
            name = AccessChainNode(
                innerNode = this.lrm(this@stmt),
                chain = infixInvoke().name().ID().map{ it.text }
            ),
            args = this@stmt.expr(expr()) to this@stmt.expr(infixInvoke().expr())
        )
        else -> TODO()
    }
}
private fun String.type(type : TypeContext) : TypeNode{
    //如果有箭头,说明是函数类型
    if (type.ARROW()!=null){
        val types = mutableListOf<TypeNode>().apply {
            type.type().forEach {it1->
                type(it1).apply {
                    notNull {
                        add(this!!)
                    }
                }
            }
        }
        return FunctionTypeNode(
            innerNode = InnerNode(
                line = type.start.line,
                row = type.start.charPositionInLine,
                moduleName = this@type
            ),
            params = types.dropLast(1),
            returnType = types.last()
        )
    }else{//如果没有,判断ID数量,非0则正常类型
        if (type.ID().size<=0){
            //判断有没有两个以上的类型,有则为元组,没有则为类型因子
            if (type.type().size<=1){
                return type(type.type(0))
            }else{
                return TupleTypeNode(
                    innerNode = InnerNode(
                        line = type.start.line,
                        row = type.start.charPositionInLine,
                        moduleName = this@type
                    ),
                    element = mutableListOf<TypeNode>().apply {
                        type.type().forEach {it1->
                            type(it1).apply {
                                notNull {
                                    add(this!!)
                                }
                            }
                        }
                    }
                )
            }
        }else{
            return CommonTypeNode(
                innerNode = InnerNode(
                    line = type.start.line,
                    row = type.start.charPositionInLine,
                    moduleName = this@type
                ),
                name = mutableListOf<String>().apply {
                    type.ID().forEach { it1->
                        add(it1.text)
                    }
                },
                typeArgs = mutableListOf<TypeNode>().apply{
                    type.type().forEach {it1->
                        type(it1).apply {
                            notNull {
                                add(this!!)
                            }
                        }
                    }
                }
            )
        }
    }
}
private val String.antlr get() = SublimationParser(CommonTokenStream(SublimationLexer(ANTLRInputStream(this)))).root()
private fun ParserRuleContext.lrm(name : String) = InnerNode(
    line = start.line,
    row = start.charPositionInLine,
    moduleName = name
)