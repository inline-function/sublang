package api.translators.kotlin

import api.data.ExpressionTree
import api.data.ExpressionTree.FaceTree.FaceValueTree
import api.data.ExpressionTree.FaceTree.NullValueTree
import api.data.ExpressionTree.LambdaTree
import api.data.ExpressionTree.NameTree
import api.data.ModuleTree
import api.data.ProjectTree
import api.data.SETree.InvokeTree
import api.data.StmtTree
import api.data.StmtTree.AssignTree
import api.data.TopTree
import api.data.TopTree.DataTree
import api.data.TopTree.StructTree
import api.data.TypeTree
import api.data.TypeTree.*
import api.data.TypeTree.CommonTypeTree.BasicTypeTree.*
import api.data.TypeTree.CommonTypeTree.StructTypeTree
import api.data.*
import api.tools.*
import api.translators.*

//kt翻译器
val ProjectTree.kotlinTree : KTProjectTree get() = translate{
    on<ProjectTree,KTProjectTree> {
        KTProjectTree(
            name = name,
            files = module.map { call(it) }
        )
    }
    on<ModuleTree,KTFileTree> {
        KTFileTree(
            name = name,
            packageName = name,
            tops = children.map { call(it) }
        )
    }
    on<TopTree,KTTopTree> {
        when(this) {
            is DataTree   -> call<DataTree,Either<*,*>>(this).value as KTTopTree
            is StructTree -> call(this)
        }
    }
    on<StructTree,KTClassTree>{
        KTClassTree(
            name = name,
            members = listOf(),
            generic = generic.map { call(it) },
            annotations = annotations.map { call(it) },
            metaData = mapOf("data" to null),
            constructorArgs = data.map { call<DataTree,Either<KTVariableTree,*>>(it).left.left }
        )
    }
    on<DataTree,Either<KTVariableTree,KTFunctionTree>> {
        if (type is FunctionTypeTree && annotations.find {
            it.struct.name=="mutable"&&it.struct.tree.moduleName=="sub_ann"
        } == null && value is LambdaTree)
            type.run {
                KTFunctionTree(
                    name = name,
                    params = value.param.associate { it.name to call(it.type) },
                    body = KTBlockTree(
                        statements = value.body.map { call(it) }
                    ),
                    receiver = annotations.find {
                        it.struct.name=="receiver"&&it.struct.tree.moduleName=="sub_ann"
                    }?.run{ value.toString() },
                    metaData = mutableMapOf<String,String?>().apply {
                        annotations.find {
                            it.struct.name=="JVMPrivate"&&it.struct.tree.moduleName=="sub_ann"
                        }?.apply { put("private",null) }
                    }
                )
            }.right
        else
            KTVariableTree(
                name = name,
                type = call(type),
                value = call(value),
                receiver = annotations.find {
                    it.struct.name=="receiver"&&it.struct.tree.moduleName=="sub_ann"
                }?.run{ KTTypeTree(
                    name = name
                ) },
                generic = listOf(),
                annotations = annotations.map { call(it) },
                metaData = mutableMapOf<String,String?>().apply {
                    annotations.find {
                        it.struct.name=="JVMPrivate"&&it.struct.tree.moduleName=="sub_ann"
                    }?.apply { put("private",null) }
                }
            ).left
    }
    on<StmtTree,KTStatementTree>{
        when(this){
            is AssignTree -> call(this)
            is DataTree -> call<DataTree,Either<*,*>>(this).value as KTStatementTree
            is InvokeTree -> call(this)
        }
    }
    on<AssignTree,KTAssignTree> {
        KTAssignTree(
            name = KTNameTree(name.name),
            value = call(value)
        )
    }
    on<ExpressionTree,KTExpressionTree>{
        when(this){
            is FaceValueTree<*> -> call<FaceValueTree<*>,KTFaceTree<Any>>(this)
            is NullValueTree -> KTNullTree
            is LambdaTree -> call(this)
            is NameTree -> call(this)
            is InvokeTree -> call(this)
        }
    }
    on<FaceValueTree<Any>,KTFaceTree<Any>>{
        KTFaceTree(
            value = value,
            metaData = mapOf()
        )
    }
    on<LambdaTree,KTLambdaTree>{
        KTLambdaTree(
            params = mutableMapOf<String,KTTypeTree>().apply {
                param.forEach {
                    put(it.name,call(it.type))
                }
            },
            body = body.map { call(it) },
            metaData = mapOf()
        )
    }
    on<NameTree,KTNameTree>{
        KTNameTree(
            chain = name
        )
    }
    on<InvokeTree,KTInvokeTree>{
        KTInvokeTree(
            name = KTNameTree(
                chain = name.name
            ),
            args = args.map { call(it) },
            metaData = mapOf()
        )
    }
    on<TypeTree,KTTypeTree> {
        KTTypeTree(
            name = when(this) {
                STR -> "kotlin.String"
                INT -> "kotlin.Long"
                DEC -> "kotlin.Double"
                BOOL -> "kotlin.Boolean"
                UNIT -> "kotlin.Unit"
                NOTHING -> "kotlin.Nothing"
                ANY -> "kotlin.Any"
                is StructTypeTree -> struct.moduleName.replace("_",".") + "." + struct.name
                is FailableTypeTree<*> -> "sub.lib.core.Result"
                is FunctionTypeTree -> "(" + (if(param.isNotEmpty())
                    param.drop(1).fold(call<TypeTree,KTTypeTree>(param.first()).toString()) { acc,it ->
                        acc + "," + call<TypeTree,KTTypeTree>(it).toString()
                    }
                else "") + ")->" + call<TypeTree,KTTypeTree>(returnType).toString()
                is GenericTypeTree -> generic
                is NullableTypeTree<*> -> call<TypeTree,KTTypeTree>(this).name + "?"
                is TupleTypeTree -> "sub.lib.core.Tuple" + elementType.size
            },
            generic = when(this){
                is FailableTypeTree<*> -> listOf(call<TypeTree,KTTypeTree>(trueType))
                is TupleTypeTree -> elementType.map { call<TypeTree,KTTypeTree>(it) }
                else -> listOf()
            },
            metaData = mapOf()
        )
    }
}