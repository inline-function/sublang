package api.translators.kotlin

import api.data.*
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.CallableTree.VariableTree.VariableTreeType
import api.data.TopTree.CallableTree.VariableTree.VariableTreeType.CONSTANT
import api.data.TopTree.CallableTree.VariableTree.VariableTreeType.VARIABLE
import api.data.TopTree.TraitTree
import api.tools.*
import api.translators.*
val ProjectTree.kotlinTree : KTProjectTree
    get() = translate{
    on<ProjectTree,KTProjectTree>{
        KTProjectTree(
            name = name.text,
            files = children.map(::call)
        )
    }
    on<ModuleTree,KTFileTree>{
        KTFileTree(
            name = name.text,
            packageName = name.text,
            tops = children.map(::call),
        )
    }
    on<TopTree,KTTopTree>{
        when(this){
            is FunctionTree -> call(this)
            is VariableTree -> call(this)
            is TraitTree    -> call(this)
        }
    }
    on<VariableTree,KTVariableTree>{
        KTVariableTree(
            name = name.text,
            type = call(!type),
            value = (value map { call<ExprTree,KTExpressionTree>(it) }).toNullable,
            receiver = receiver.toNullable?.run(::call),
            //TODO没有泛型
            generic = listOf(),
            annotations = annotations.map(::call),
            mutable = kind == VARIABLE,
            modifiers = buildList{
                if(kind == CONSTANT)
                    add("const")
            },
        )
    }
    on<FunctionTree,KTFunctionTree>{
        KTFunctionTree(
            name = name.text,
            params = params.associate{ it.name.text to call(!it.type) },
            body = body.toNullable?.let { call(it.value) } ?: KTBlockTree(listOf()),
            receiver = receiver.toNullable?.let(::call),
            //TODO不支持泛型
            generic = listOf(),
            annotations = annotations.map(::call),
            modifiers = listOf(),
        )
    }
    on<TypeTree,KTTypeTree>{
        KTTypeTree(
            name = name.text,
            //TODO不支持泛型
            generic = listOf()
        )
    }
    on<AnnTree,KTAnnotationTree>{
        KTAnnotationTree(
            name = name.text,
            args = value?.such(
                left = {
                    listOf(KTFaceTree(it.toString()))
                },
                right = {
                    listOf(KTFaceTree(it.china.first()))
                }
            ) ?: listOf(),
        )
    }
    on<Block,KTBlockTree>{
        KTBlockTree(
            statements = map(::call)
        )
    }
    on<StmtTree,KTStatementTree>{
        when(this){
            is BoolValueTree -> KTFaceTree(value)
            is DecValueTree -> KTFaceTree(value)
            is IntValueTree -> KTFaceTree(value)
            is NullValueTree -> KTFaceTree(value)
            is StrValueTree -> KTFaceTree(value)
            is UnitValueTree -> KTFaceTree(value)
            is IfTree -> KTIFTree(
                condition = call(!condition),
                body = call(then),
                elseBody = `else`?.let(::call)
            )
            is InvokeTree -> KTInvokeTree(
                name = call(!invoker),
                args = args.such(
                    left = {
                        it.map<_,KTExpressionTree>(::call).left
                    },
                    right = {
                        it.entries.associate<_,_,KTExpressionTree>{
                            (k,v) -> k.text to call(v)
                        }.right
                    }
                ),
            )
            is LambdaTree -> TODO()
            is NameTree -> KTNameTree(this)
            is WhenTree -> TODO()
            is FunctionTree -> TODO()
            is VariableTree -> TODO()
            is TraitTree -> TODO()
        }
    }
    on<ExprTree,KTExpressionTree>{
        when(this){
            is BoolValueTree -> KTFaceTree(value)
            is DecValueTree -> KTFaceTree(value)
            is IntValueTree -> KTFaceTree(value)
            is NullValueTree -> KTFaceTree(value)
            is StrValueTree -> KTFaceTree(value)
            is UnitValueTree -> KTFaceTree(value)
            is IfTree -> TODO()
            is InvokeTree -> TODO()
            is LambdaTree -> TODO()
            is NameTree -> call(this)
            is WhenTree -> TODO()
        }
    }
    on<NameTree,KTNameTree>{
        KTNameTree(
            chain = china
        )
    }
}