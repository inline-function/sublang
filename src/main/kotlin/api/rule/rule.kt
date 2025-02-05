@file:Suppress("RedundantLambdaOrAnonymousFunction","NestedLambdaShadowedImplicitParameter")

package api.rule

import api.classes.Checker.Information
import api.classes.rule
import api.data.AnnotationNode
import api.data.AnnotationTree
import api.data.BlockNode
import api.data.DataOrAssign
import api.data.ExprNode
import api.data.ExprNode.*
import api.data.ExpressionTree
import api.data.ExpressionTree.FaceTree.FaceValueTree
import api.data.ExpressionTree.FaceTree.NullValueTree
import api.data.ExpressionTree.LambdaTree
import api.data.ExpressionTree.NameTree
import api.data.FileNode
import api.data.InnerNode
import api.data.InnerTree
import api.data.ModuleTree
import api.data.Node
import api.data.ProjectNode
import api.data.ProjectTree
import api.data.SENode
import api.data.SENode.*
import api.data.SETree
import api.data.SETree.InvokeTree
import api.data.StmtNode
import api.data.StmtTree
import api.data.StmtTree.AssignTree
import api.data.TopNode
import api.data.TopNode.DataNode
import api.data.TopNode.StructNode
import api.data.TopTree
import api.data.TopTree.DataTree
import api.data.TopTree.StructTree
import api.data.Tree
import api.data.TypeNode
import api.data.TypeNode.*
import api.data.TypeTree
import api.data.TypeTree.CommonTypeTree
import api.data.TypeTree.CommonTypeTree.BasicTypeTree
import api.data.TypeTree.CommonTypeTree.BasicTypeTree.*
import api.data.TypeTree.CommonTypeTree.StructTypeTree
import api.data.TypeTree.FunctionTypeTree
import api.tools.*
import api.translators.kotlin.KTAnnotationTree
import javaslang.control.Either

val ProjectNode.check : Pair<ProjectTree,Information> get() = rule{
    on<ProjectNode,ProjectTree>{
        //判断是否有重名的模块
        node.files log {"重复的'${it.name}'模块定义"} duplicate FileNode::name
        //遍历复制自己的树并且分配子语义任务
        node.files.forEach {
            it taskOf "files"
        }
        //将自己的树复制成被语义过的树
        tree = ProjectTree(
            name = node.name,
            module = node.files.map {
                task(it)
            }
        )
   }
    on<FileNode,ModuleTree>{
        //判断是否有重名的数据
        node.tops log {"重复的'${it.name}'数据定义"} duplicate TopNode::name
        //遍历复制自己的树并且分配子语义任务
        node.tops.forEach {
            it taskOf "tops"
        }
        //将自己的树复制成被语义过的树
        tree = ModuleTree(
            name = node.name,
            children = node.tops.map {
                task(it)
            }
        )
    }
    on<TopNode,TopTree>{
        tree = when(node){
            is DataNode   -> task(node)
            is StructNode -> task(node)
        }
    }
    on<StructNode,StructTree>{
        tree = !StructTree(
            tree = node lrmp this@check.name,
            name = node.name,
            data = node.data.map{ goInto(it) },
            annotations = node.annotations.map { task(it) }
        )
        !DataTree(
            tree = node lrmp this@check.name,
            name = node.name,
            type = FunctionTypeTree(
                innerTree = node lrmp this@check.name,
                param = tree!!.data.map { it.type },
                returnType = StructTypeTree(
                    tree = node lrmp this@check.name,
                    struct = tree!!
                )
            ).apply{this name "ftt"},
            value = LambdaTree(
                tree = node lrmp this@check.name,
                param = tree!!.data,
                body = listOf(),
                type = "ftt".get()
            )
        )
    }
    on<DataNode,DataOrAssign>{
        when{
            node.type != null -> {
                true name "typed"
                node.type taskName "type"
                if(node.value!=null)
                    node.type taskName "value"
                else
                    NullValueTree(node lrmp this@check.name) name "value"
            }
            node.value != null -> {
                false name "typed"
                node.value taskName "value"
                "value".get<ExpressionTree>().type name "type"
                if("value".get<ExpressionTree>() is FaceValueTree<*>)
                    when("value".get<FaceValueTree<Any>>().value){
                        is Boolean -> BOOL
                        is String -> STR
                        is Long -> INT
                        is Double -> DEC
                        else -> TODO("这不可能")
                    } name "type"
            }
            else -> TODO("不能同时缺失类型与赋值声明")
        }
        tree = when{
            //理应添加:是常量/赋值类型不同
            parent!!.node is TopNode || "typed".get() ||
            node.onlyFindSymbol<DataTree>(node.name){
                it is DataTree && it.name == node.name
            }.error -> !DataTree(
                tree = node lrmp this@check.name,
                name = node.name,
                type = "type".get(),
                value = "value".get(),
                annotations = node.annotations.map{ task(it) }
            )
            else -> AssignTree(
                tree = node lrmp this@check.name,
                name = NameTree(
                    tree = node lrmp this@check.name,
                    name = listOf(node.name),
                    type = node.findSymbol<DataTree>(node.name){
                        it is DataTree && it.name == node.name
                    }.value.type
                ),
                value = "value".get()
            )
        }
    }
    on<AnnotationNode,AnnotationTree<String>>{
        tree = AnnotationTree(
            tree = node lrmp this@check.name,
            struct = node.onlyFindSymbol<StructTree>(node.name.chain.first()){
                it is StructTree && it.name == node.name.chain.first()
            } such {TODO("处理没有该结构体的情况")}{
                it
            },
            value = node.value,
        )
    }
    on<TypeNode,TypeTree> {
        tree = when(node){
            is CommonTypeNode -> task(node)
            is FunctionTypeNode -> task(node)
            is TupleTypeNode -> task(node)
        }
    }
    on<CommonTypeNode,CommonTypeTree> {
        tree = when(node.name){
            listOf("Int"),listOf("sub_core","Int")->INT
            listOf("Dec"),listOf("sub_core","Dec")->DEC
            listOf("Str"),listOf("sub_core","Str")->STR
            listOf("Bool"),listOf("sub_core","Bool")->BOOL
            listOf("Unit"),listOf("sub_core","Unit")->UNIT
            listOf("Nothing"),listOf("sub_core","Nothing")->NOTHING
            listOf("Any"),listOf("sub_core","Any")->ANY
            else -> StructTypeTree(
                tree = node lrmp this@check.name,
                struct = node.onlyFindSymbol<StructTree>(node.name.first()){
                    it is StructTree && it.name == node.name.first()
                } such {TODO("处理没有该结构体的情况")}{
                    it
                }
            )
        }
    }
    on<FunctionTypeNode,FunctionTypeTree> {
        node.params.forEach { it taskName "param" }
        node.returnType taskName "returnType"
        tree = FunctionTypeTree(
            innerTree = node lrmp this@check.name,
            param = "param".get(),
            returnType = "returnType".get()
        )
    }
    on<ExprNode,ExpressionTree>{
        tree = when(node){
            is AccessChainNode  -> task(node)
            is FaceValueNode<*> -> task(node)
            is LambdaNode       -> goInto(node)
            is SENode           -> task(node)
        }
    }
    on<LambdaNode,LambdaTree>{
        tree = LambdaTree(
            tree = node lrmp this@check.name,
            param = node.params.map<DataNode,DataTree> { task(it) }.apply { name("param") },
            body = node.block.stmts.map<StmtNode,StmtTree> {
                when(it){
                    is BlockNode        -> task(it)
                    is InfixInvokeNode  -> task(it)
                    is InvokeNode       -> task(it)
                    is PrefixInvokeNode -> task(it)
                    is DataNode         -> task(it)
                }
            }.apply{this name "body"},
            type = FunctionTypeTree(
                innerTree = node lrmp this@check.name,
                param = "param".get<List<DataTree>>().map { it.type },
                returnType = "body".get<List<StmtTree>>().lastOrNull()?.run {
                    if(this !is SETree) UNIT else this.type
                } ?: UNIT
            )
        )
    }
    on<InvokeNode,InvokeTree>{
        tree = InvokeTree(
            tree = node lrmp this@check.name,
            type = node.findSymbol<DataTree>(node.name.chain.toString()){
                it is DataTree && it.name == node.name.chain[0]
            } such {TODO("处理没有该成员的情况")}{
                (node.name.chain.drop(1).fold(it.type) { typeTree,name ->
                    when(typeTree){
                        is StructTypeTree -> typeTree.struct.data.find { it.name == name }?.type ?: TODO("处理调用成员属性但是找不到的情况")
                        is CommonTypeTree -> TODO("处理调用成员属性但是为基本类型的情况")
                        else -> TODO("处理调用成员属性但是不为正常类型的情况")
                    }
                } as? FunctionTypeTree)?.returnType ?: TODO("处理调用不为函数类型的情况")
            },
            name = task(node.name),
            args = node.args.map{ task(it) }
        )
    }
    on<SENode,SETree>{
        tree = when(node){
            is InfixInvokeNode  -> task(node)
            is InvokeNode       -> task(node)
            is PrefixInvokeNode -> task(node)
        }
    }
    on<AccessChainNode,NameTree>{
        tree = NameTree(
            tree = node lrmp this@check.name,
            name = node.chain,
            type = node.findSymbol<DataTree>(node.chain.toString()){
                it is DataTree && it.name == node.chain[0]
            } such {TODO("处理没有找到该数据的情况")}{
                node.chain.drop(1).fold(it.type){ type,name ->
                    when(type){
                        is StructTypeTree -> type.struct.data.find { it.name == name }?.type ?: TODO("处理调用成员属性但是找不到的情况")
                        is CommonTypeTree -> TODO("处理调用成员属性但是为基本类型的情况")
                        else -> TODO("处理调用成员属性但是不为正常类型的情况")
                    }
                }
            }
        )
    }
    on<FaceValueNode<*>,FaceValueTree<*>> {
        val name = when(node.value){
            is Boolean -> "Bool"
            is String  -> "Str"
            is Long    -> "Int"
            is Double  -> "Dec"
            else       -> TODO()
        }
        val ctt = StructTypeTree(
            tree = node lrmp this@check.name,
            struct = StructTree(
                tree = InnerTree(
                    line = -1,
                    row = -1,
                    moduleName = "sub_core",
                    projectName = this@check.name
                ),
                name = name,
                data = listOf()
            )
        )
        tree = FaceValueTree(
            tree = node lrmp this@check.name,
            value = node.value,
            type = ctt
        )
    }
}
private infix fun InnerNode.lrmp(name : String) = InnerTree(
    line = line,
    row = row,
    moduleName = moduleName,
    projectName = name
)