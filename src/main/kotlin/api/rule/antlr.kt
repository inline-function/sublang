@file:Suppress("NestedLambdaShadowedImplicitParameter")

package api.rule

import api.antlr.SubLexer
import api.antlr.SubParser
import api.antlr.SubParser.*
import api.constant.funTypeName
import api.constant.tupleTypeName
import api.data.AnnNode
import api.data.BlockNode
import api.data.CaseNode.*
import api.data.ExprNode
import api.data.ExprNode.*
import api.data.ExprNode.FaceValueNode.*
import api.data.FileNode
import api.data.ParserInfo
import api.data.StmtNode
import api.data.TopNode.CallableNode.FunctionNode
import api.data.TopNode.CallableNode.VariableNode
import api.data.TopNode.CallableNode.VariableNode.VariableNodeKind.*
import api.data.TopNode.TraitNode
import api.tools.*
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.Trees.toStringTree
import subCodePath
import java.io.File

//不要动函数标签,你会发现把函数体折叠起来函数标签会很整齐
fun String. toAst   (                              ): FileNode              =
    root(SubParser(CommonTokenStream(SubLexer(ANTLRInputStream(
        String(File(subCodePath).inputStream().readAllBytes()).bracesStyle().test
    )))).run{
        root().apply {
            toStringTree(this@run).test
        }
    })
fun String. root    ( root    : RootContext        ): FileNode              =FileNode(
    name = this,
    tops = root.topStmt().map{
        when{
            it.function()!=null->function(it.function())
            it.variable()!=null->variable(it.variable())
            it.trait()!=null->trait(it.trait())
            else->never()
        }
    }
)
fun String. function( function: FunctionContext    ): FunctionNode          =FunctionNode(
    node = info(function),
    name = function.receiver().ID().text,
    receiver = function.receiver().type()?.let { type(it) },
    params = function.parameters().isNullThen(
        then = { emptyList() },
        or = { params(function.parameters()) }
    ),
    body = function.block()?.let { block(it) },
    type = function.type()?.run { type(function.type()) },
    annotations = function.annotation().map { ann(it) }
)
fun String. ann     ( ann     : AnnotationContext  ): AnnNode               =AnnNode(
    node = info(ann),
    name = name(ann.name(0)),
    value = (ann.name().size >= 2).either(
        left  = {expr(ann.expr())},
        right = {name(ann.name(1))}
    )
)
fun String. block   ( block   : BlockContext       ): BlockNode             =BlockNode(
    node = info(block),
    statements = block.stmt().map {
        it.topStmt().isNullThen(
            then = { expr(it.expr()) },
            or = {
                function()?.run { function(function()) }
                ?: variable()?.run { variable(variable()) }
                ?: trait(trait()) as StmtNode
            }
        )
    }
)
fun String. params  ( params  : ParametersContext  ): List<VariableNode>    =
    params.parameter().map {
      VariableNode(
          node = info(it),
          name = it.ID().text,
          receiver = it.type()?.let { type(it) },
          type = it.type()?.let { type(it) },
          kind = it.VAL()?.run { VALUE }
              ?: it.VAR()?.run { VARIABLE }
              ?: CONSTANT,
          value = it.expr()?.let { expr(it) },
          annotations = it.annotation().map { ann(it) }
      )
    }
fun String. type    ( type    : TypeContext        ): TypeNode              =
    type.ID()?.run {
        TypeNode(
            node = info(type),
            name = text,
            generic = type.generic()?.ID()?.isEmpty()?.either(
                {
                    type.generic().type().map { type(it) }
                },{
                    Pair(type.generic().ID(),type.generic().type()).merge(
                        { it.text },
                        { type(it) }
                    )
                }
            ) ?: listOf<TypeNode>().left
        )
    } ?: type.ARROW()?.run {
        TypeNode(
            node = info(type),
            name = funTypeName,
            generic = type.type().map { type(it) }.left
        )
    } ?: if (type.type().size >= 2)
        TypeNode(
            node = info(type),
            name = tupleTypeName,
            generic = type.type().map { type(it) }.left
        ) else type(type.type(0))
fun String. variable( variable: VariableContext    ): VariableNode          =VariableNode(
    node = info(variable),
    name = variable.receiver().ID().text,
    receiver = variable.receiver().type()?.let { type(it) },
    type = variable.type()?.let { type(it) },
    kind = variable.run {
        VAL()?.run { VALUE } ?: VAR()?.run { VARIABLE } ?: CONT().run { CONSTANT }
    },
    value = variable.expr()?.let { expr(it) },
    annotations = variable.annotation().map { ann(it) }
)
fun String. expr    ( expr    : ExprContext        ): ExprNode              =
    (expr.name()?.run {
       name(this)
    }
    ?: expr.NUMBER()?.run {
        if (expr.NUMBER().text.contains('.')) {
            DecValueNode(info(expr),expr.NUMBER().text.toDouble())
        } else {
            IntValueNode(info(expr),expr.NUMBER().text.toInt())
        }
    }
    ?: expr.STRING()?.run {
        StringValueNode(info(expr),expr.STRING().text.substring(1,expr.STRING().text.length - 1))
    }
    ?: expr.if_()?.run {
        `if`(this)
    }
    ?: expr.`when`()?.run {
        `when`(this)
    }
    ?: expr.lambda()?.run {
        lambda(this)
    }
    ?: expr.destructuring()?.run {
        TODO("解构")
    }
    ?: expr.expr().run {
        expr(this)
    }).run {
        if (expr.invoke() != null) invoke(expr.invoke())(this) else this
    }
fun String. invoke  ( invoke  : InvokeContext      ): (ExprNode)->InvokeNode={
    InvokeNode(
        node = info(invoke),
        invoker = it,
        args = invoke.ID().isEmpty().either(
            {invoke.expr().map{expr(it)}},
            {Pair(invoke.ID(),invoke.expr()).merge(
                {it.text},
                {expr(it)}
            )}
        ),
        generic = invoke.generic()?.ID()?.isEmpty()?.either(
            {invoke.generic().type().map{type(it)}},
            {Pair(invoke.generic().ID(),invoke.generic().type()).merge(
                {it.text},
                {type(it)}
            )}
        ) ?: listOf<TypeNode>().left,
        outsideLambda = invoke.kotlinLambda()?.run{ktLambda(invoke.kotlinLambda())},
    ).run{
        invoke.invoke().isNullThen(
            then = {this},
            or = {
                invoke(this)(this@run)
            }
        )
    }
}
fun String. lambda  ( lambda  : LambdaContext      ): LambdaNode            =lambda.kotlinLambda().isNullThen(
    then = {
        LambdaNode(
            node = info(lambda),
            params = lambda.javaLambda().parameters().parameter().map{
                VariableNode(
                    node = info(it),
                    name = it.ID().text,
                    receiver = null,
                    type = type(it.type()),
                    kind = it.VAL()?.run { VALUE }
                        ?: it.VAR()?.run { VARIABLE }
                        ?: CONSTANT,
                    value = expr(it.expr()),
                    annotations = it.annotation().map { ann(it) }
                )
            },
            body = block(lambda.javaLambda().block())
        )
    },
    or = { ktLambda(lambda.kotlinLambda()) }
)
fun String. ktLambda( lambda  : KotlinLambdaContext): LambdaNode            =LambdaNode(
    node = info(lambda),
    params = lambda.parameters().parameter().map {
        VariableNode(
            node = info(it),
            name = it.ID().text,
            receiver = null,
            type = type(it.type()),
            kind = it.VAL()?.run { VALUE }
                ?: it.VAR()?.run { VARIABLE }
                ?: CONSTANT,
            value = expr(it.expr()),
            annotations = it.annotation().map { ann(it) }
        )
    },
    body = BlockNode(
        node = info(lambda),
        statements = lambda.stmt().map {
            it.topStmt().isNullThen(
                then = { expr(it.expr()) },
                or = {
                    it.run {
                        function()?.run { function(function()) }
                     ?: variable()?.run { variable(variable()) }
                     ?: trait(trait())
                    }
                }
            )
        }
    )
)
fun String.`when`   (`when`   : WhenContext        ): WhenNode              =WhenNode(
    node = info(`when`),
    value = `when`.expr()?.run{expr(this)},
    cases = `when`.case_().map{
        fun ExprOrBlockContext.eob()=expr().isNullThen(
            or = {BlockNode(info(this),listOf(expr(expr())))},
            then = {block(block())}
        )
        it.exprCase()?.run {
            ValueCaseNode(
                node = info(this),
                value = expr().map{expr(it)},
                block = exprOrBlock().eob()
            )
        }?:it.typeCase()?.run {
            TypeCaseNode(
                node = info(this),
                matcher = type(type()),
                block = exprOrBlock().eob()
            )
        }?:it.boolCase()?.run {
            AtCaseNode(
                node = info(this),
                bool = expr(expr()),
                block = exprOrBlock().eob()
            )
        }?:it.elseCase().run {
            ElseCaseNode(
                node = info(this),
                block = exprOrBlock().eob()
            )
        }
    }
)
fun String.`if`     (`if`     : IfContext          ): IfNode                =IfNode(
    node = info(`if`),
    condition = expr(`if`.expr()),
    then = block(`if`.block(0)),
    `else` = (`if`.block().size==2) then { block(`if`.block(1)) }
)
fun String. name    ( name    : NameContext        ): NameNode              =NameNode(
    node = info(name),
    chain = name.ID().map{it.text}
)
fun String. trait   ( trait   : TraitContext       ): TraitNode             =TraitNode(
    node = info(trait),
    name = trait.ID().text,
    members = trait.variable().map {
        variable(it)
    } + trait.function().map {
        function(it)
    },
    annotations = trait.annotation().map { ann(it) },
    parent = TODO()
)
fun String. info    ( context : ParserRuleContext  ): ParserInfo            =ParserInfo(
    line = context.start.line,
    row = context.start.charPositionInLine,
    fileName = this
)