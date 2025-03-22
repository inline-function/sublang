package api.translators.kotlin

import api.data.Block
import api.data.ExprTree
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.ExprTree.WhenTree.CaseTree.*
import api.data.ID
import api.data.ModuleTree
import api.data.ProjectTree
import api.data.StmtTree
import api.data.TopTree
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.data.id
import api.translators.*
import api.tools.*
sealed interface KotlinApt
fun interface KTProjectApt : KotlinApt{
    fun ProjectTree.map() : ProjectTree
}
fun interface KTFunctionApt : KotlinApt{
    fun FunctionTree.map() : FunctionTree
}
fun interface KTVariableApt : KotlinApt{
    fun VariableTree.map() : VariableTree
}
fun interface KTTraitApt : KotlinApt{
    fun TraitTree.map() : TraitTree
}
@Suppress("NestedLambdaShadowedImplicitParameter","NAME_SHADOWING")
val idMapProcess = io2{getMapId:IO1<ID,ID>,it:ProjectTree->
    val getMapId = getMapId.func
    lateinit var processExprId : (ExprTree)->ExprTree
    lateinit var processTopId : (TopTree)->TopTree
    lateinit var processStmtId : (StmtTree)->StmtTree
    val processLambdaId = {it:LambdaTree->
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
            is ExprTree-> processExprId(it)
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
                `else` = it.`else`?.map { processStmtId(it) }?.let{Block(it)}
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
    val processVariableId = {it:VariableTree->
        it.copy(
            name = getMapId(it.name),
            type = it.type.map { it.copy(name = getMapId(it.name)) },
            receiver = it.receiver.map {  it.copy(name = getMapId(it.name)) },
            value = it.value.map { processExprId(it) }
        )
    }
    val processFunctionId = {it:FunctionTree->
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
    val processTraitId = {it:TraitTree->
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
            is TraitTree    -> processTraitId(it)
        }
    }
    it.copy(
        children = it.children.map {
            it.copy(
                children = it.children.map {
                    processTopId(it)
                }
            )
        }
    )
}
data class Apts(
    val functionApts : IO1<FunctionTree,FunctionTree> = io1{it},
    val variableApts : IO1<VariableTree,VariableTree> = io1{it},
    val traitApts    : IO1<TraitTree,TraitTree>       = io1{it},
    val idMap        : Map<ID,ID>                     = emptyMap(),
    val processId    : IO1<ID,ID>                     = io1{ idMap[it] ?: it },
    val projectApts  : IO1<ProjectTree,ProjectTree>   = idMapProcess(processId),
)
fun ProjectTree.toKotlinTree(apts : Apts = Apts()) : ProjectTree = translate {
    apts.apply {
        on<ProjectTree,ProjectTree> {
            projectApts(
                copy(
                    children = children.map(::call)
                ).test(1)
            ).runNow().test(2)
        }
        on<ModuleTree,ModuleTree> {
            copy(
                children = children.map(::call)
            )
        }
        on<TopTree,TopTree> {
            when (this) {
                is FunctionTree -> call(this)
                is VariableTree -> call(this)
                is TraitTree -> call(this)
            }
        }
        on<FunctionTree,FunctionTree> {
            functionApts(this).runNow()
        }
        on<VariableTree,VariableTree> {
            variableApts(this).runNow()
        }
        on<TraitTree,TraitTree> {
            traitApts(this).runNow()
        }
    }
}