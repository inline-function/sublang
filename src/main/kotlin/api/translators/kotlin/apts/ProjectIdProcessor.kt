@file:Suppress("NestedLambdaShadowedImplicitParameter","FunctionName")

package api.translators.kotlin.apts

import api.data.Block
import api.data.ExprTree
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.ExprTree.WhenTree.CaseTree.*
import api.data.ID
import api.data.StmtTree
import api.data.TopTree
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.data.id
import api.tools.apply
import api.tools.let
import api.tools.map
import api.translators.kotlin.KTProjectApt
fun IdMapClosure(idMap : MutableMap<ID,ID> = mutableMapOf()) = run {
    var i = 1
    {it:ID->
        if (idMap.containsKey(it))
            idMap[it]!!
        else
            "subid$${i++}".id.apply { idMap[it] = this }
    }
}
fun ProjectIdProcessor(getMapId : (ID)->ID = IdMapClosure()) = KTProjectApt {
    lateinit var processExprId : (ExprTree)->ExprTree
    lateinit var processTopId : (TopTree)->TopTree
    lateinit var processStmtId : (StmtTree)->StmtTree
    val processLambdaId = {it: LambdaTree ->
        it.copy(
            params = it.params.map {
                it.copy(
                    name = getMapId(it.name),
                    type = it.type.map {
                        it.copy(name = getMapId(it.name))
                    }
                )
            },
            body = Block(it.body.map {
                processStmtId(it)
            })
        )
    }
    processStmtId = {
        when(it){
            is ExprTree -> processExprId(it)
            is TopTree -> processTopId(it)
        }
    }
    processExprId = {
        when(it){
            is BoolValueTree,is DecValueTree,is IntValueTree,
            is NullValueTree,is StrValueTree,is UnitValueTree -> it
            is IfTree -> it.copy(
                condition = it.condition.map { processExprId(it) },
                then = Block(it.then.map { processStmtId(it) }),
                `else` = it.`else`?.map { processStmtId(it) }?.let{ Block(it) }
            )
            is InvokeTree -> it.copy(
                invoker = it.invoker.map { processExprId(it) },
                args = it.args.map(
                    left  = { it.map{ processExprId(it) } },
                    right = {
                        it.entries.associate { (key,value) ->
                            getMapId(key) to processExprId(value)
                        }
                    }
                ),
                //TODO泛型
                generic = emptyMap(),
                type = it.type.map { it.copy(name = getMapId(it.name)) },
                outsideLambda = it.outsideLambda.map { processLambdaId(it) }
            )
            is LambdaTree -> processLambdaId(it)
            is NameTree -> it.copy(china = it.china.map {
                getMapId(it.id).text
            })
            is WhenTree -> it.copy(
                type = it.type.map { it.copy(name = getMapId(it.name)) },
                value = it.value.map { processExprId(it) },
                cases = it.cases.map {
                    when(it){
                        is AtCaseTree -> it.copy(
                            condition = it.condition.map { processExprId(it) },
                            block = Block(it.block.map { processStmtId(it) })
                        )
                        is ElseCaseTree -> it.copy(
                            block = Block(it.block.map { processStmtId(it) })
                        )
                        is TypeCaseTree -> it.copy(
                            matcher = it.matcher.copy(
                                name = getMapId(it.matcher.name)
                            )
                        )
                        is ValueCaseTree -> it.copy(
                            value = it.value.map { processExprId(it) },
                            block = Block(it.block.map { processStmtId(it) })
                        )
                    }
                }
            )
        }
    }
    val processVariableId = {it: VariableTree ->
        it.copy(
            name = getMapId(it.name),
            type = it.type.map { it.copy(name = getMapId(it.name)) },
            receiver = it.receiver.map {  it.copy(name = getMapId(it.name)) },
            value = it.value.map { processExprId(it) }
        )
    }
    val processFunctionId = {it: FunctionTree ->
        it.copy(
            name = getMapId(it.name),
            params = it.params.map { processVariableId(it) },
            type = it.type.map { it.copy(name = getMapId(it.name)) },
            receiver = it.receiver.map { it.copy(name = getMapId(it.name)) },
            body = it.body.map {
                lazy{
                    Block(it.value.map {
                        processStmtId(it)
                    })
                }
            }
        )
    }
    val processTraitId = {it: TraitTree ->
        it.copy(
            name = getMapId(it.name),
            members = it.members.map {
                when(it){
                    is FunctionTree -> processFunctionId(it)
                    is VariableTree -> processVariableId(it)
                }
            },
            parent = it.parent?.copy(name = getMapId(it.parent.name))
        )
    }
    processTopId = {
        when(it){
            is FunctionTree -> processFunctionId(it)
            is VariableTree -> processVariableId(it)
            is TraitTree -> processTraitId(it)
        }
    }
    copy(
        children = children.map {
            it.copy(
                children = it.children.map {
                    processTopId(it)
                }
            )
        }
    )
}