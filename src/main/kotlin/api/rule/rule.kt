@file:Suppress("RedundantLambdaOrAnonymousFunction","NestedLambdaShadowedImplicitParameter","LocalVariableName")

package api.rule

import api.classes.rule
import api.data.*
import api.data.ExprNode.*
import api.data.ExprNode.FaceValueNode.*
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.TopNode.*
import api.data.TopNode.CallableNode.FunctionNode
import api.data.TopNode.CallableNode.VariableNode
import api.data.TopNode.CallableNode.VariableNode.VariableNodeKind.*
import api.data.TopTree.*
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.CallableTree.VariableTree.VariableTreeType
import api.data.id
import api.tools.Either
import api.tools.None
import api.tools.Some
import api.tools.apply
import api.tools.flatMap
import api.tools.isNullThen
import api.tools.left
import api.tools.map
import api.tools.mayApply
import api.tools.not
import api.tools.right
import api.tools.some
import api.tools.such

fun ProjectNode.check() = rule{
    on<ProjectNode,ProjectTree>{
        ProjectTree(
            name = node.name.id,
            children = node.files.mapTask()
        )
    }
    on<FileNode,ModuleTree>{
        ModuleTree(
            name = node.name.id,
            children = node.tops.mapTask()
        )
    }
    on<TraitNode,TraitTree>{
        TraitTree(
            name = node.name.id,
            members = node.members.mapTask(),
            annotations = node.annotations.mapTask(),
            info = infor,
            parent = TODO()
        )
    }
    on<TopNode,TopTree> {
        when(node){
            is TraitNode    -> task(node)
            is CallableNode -> task(node)
        }
    }
    on<CallableNode,CallableTree> {
        when(node){
            is FunctionNode -> task(node)
            is VariableNode -> task(node)
        }
    }
    on<VariableNode,VariableTree> {
        VariableTree(
            name = node.name.id,
            receiver = node.receiver?.task<TypeNode,TypeTree>()?.some ?: None,
            type = node.type.isNullThen(
                then = { TODO() },
                or =   { Some(task(this)) }
            ),
            value = node.value?.run{task<ExprNode,ExprTree>(this).some} ?: None,
            kind = when(node.kind){
                VARIABLE -> VariableTreeType.VARIABLE
                VALUE    -> VariableTreeType.VALUE
                CONSTANT -> VariableTreeType.CONSTANT
            },
            annotations = node.annotations.mapTask(),
            info = infor,
        )
    }
    on<TypeNode,TypeTree>{
        TypeTree(
            name = node.name.id,
            info = infor,
            generic = node.generic.such(
                left = {
                    if(it.isNotEmpty())
                        error("当前版本不支持泛型")
                    emptyMap()
//                    onlyFindSymbol<TraitTree>{it.name.text == name}.such(
//                        error = {error("没有'${name}'这个特质类型")},
//                        some  = {
//                            error("没有'${name}'这个类型")
//                        }
//                    )
                },
                right = {
                    if(it.isNotEmpty())
                        error("当前版本不支持泛型")
                    emptyMap()
//                    it.map{(key,value)->
//                        key.id to task<TypeNode,TypeTree>(value)
//                    }.toMap()
                }
            )
        )
    }
    on<FunctionNode,FunctionTree> {
        FunctionTree(
            name = node.name.id,
            body = node.body?.let { lazy { it.task<BlockNode,Block>() } }?.some ?: None,
            type = node.type.isNullThen(
                then = { UnitValueTree(infor).type },
                or =   { Some(task(this)) }
            ),
            receiver = node.receiver?.task() ?: None,
            params = node.params.mapTask(),
            info = infor,
            annotations = node.annotations.mapTask()
        )
    }
    on<AnnNode,AnnTree>{
        AnnTree(
            info = infor,
            name = node.name.task<NameNode,NameTree>().first().id,
            value = node.value?.map(
                left = {it.task()},
                right = {
                    NameNode(
                        node = node.node,
                        chain = listOf(it.text)
                    ).task()
                }
            )
        )
    }
    on<BlockNode,Block>{
        node.map<StmtNode,StmtTree>{ it.task() }.block
    }
    on<StmtNode,StmtTree>{
        when(node){
            is VariableNode -> task(node)
            is ExprNode     -> task(node)
            is FunctionNode -> task(node)
            is TraitNode    -> task(node)
        }
    }
    on<ExprNode,ExprTree>{
        when(node){
            is BoolValueNode   -> BoolValueTree(
                value = node.value,
                info = infor,
            )
            is DecValueNode    -> DecValueTree(
                value = node.value,
                info = infor,
            )
            is IntValueNode    -> IntValueTree(
                value = node.value,
                info = infor,
            )
            is NullValueNode   -> NullValueTree(
                value = node.value,
                info = infor,
            )
            is UnitValueNode   -> UnitValueTree(
                value = node.value,
                info = infor,
            )
            is StringValueNode -> StrValueTree(
                value = node.value,
                info = infor,
            )
            is IfNode          -> task(node)
            is InvokeNode      -> task(node)
            is LambdaNode      -> task(node)
            is NameNode        -> task(node)
            is TypeNode        -> task(node)
            is WhenNode        -> task(node)
        }
    }
    on<InvokeNode,InvokeTree>{
        val invoker = node.invoker.task<_,ExprTree>().some
        InvokeTree(
            invoker = invoker,
            info = infor,
            args = node.args.such(
                left = {
                    it.mapTask<_,ExprTree>().left
                },
                right = {
                    it.entries.associate { (key,value) -> key.id to task<_,ExprTree>(value) }.right
                }
            ),
            generic = node.generic.run{
                //TODO不支持泛型
                emptyMap()
            },
            outsideLambda = node.outsideLambda?.task<_,LambdaTree>()?.some ?: None,
            type = onlyFindSymbol<TraitTree>{ (invoker.not()).type.not().name.text == it.name.text }.such(
                none = {error("没有在代码中找到该特质")},
                some = {
                    //TODO调用表达式的类型
                    None
                }
            )
        )
    }
    on<NameNode,NameTree>{
        NameTree(
            china = node.chain,
            info = infor,
            type = onlyFindSymbol<TopTree>{
                it.name.text == node.chain.first()
            } flatMap {
                when(it){
                    is TraitTree    -> TODO("特质的元类对象")
                    is FunctionTree -> it.type
                    is VariableTree -> it.type
                }
            }
        )
    }
} apply {
    first.children.forEach {
        it.children.forEach {
            it as? TraitTree mayApply {
                members.forEach {
                    if(it is FunctionTree && it.body is Some)
                        it.body.value.value
                }
            }
            it as? FunctionTree mayApply {
                if(body is Some)
                    body.value.value
            }
        }
    }
}
