@file:Suppress("NestedLambdaShadowedImplicitParameter")

package api.translators.kotlin

import api.data.Block
import api.data.ExprTree
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.ExprTree.WhenTree.CaseTree.*
import api.data.ID
import api.data.ProjectTree
import api.data.StmtTree
import api.data.TopTree
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.data.id
import api.tools.*
sealed interface KotlinApt
fun interface KTProjectApt : KotlinApt,(ProjectTree)->ProjectTree{
    fun ProjectTree.map() : ProjectTree
    override fun invoke(p1 : ProjectTree) = p1.map()
}
fun interface KTFunctionApt : KotlinApt,(FunctionTree)->FunctionTree?{
    fun FunctionTree.map() : FunctionTree?
    override fun invoke(p1 : FunctionTree) = p1.map()
}
fun interface KTVariableApt : KotlinApt,(VariableTree)->VariableTree?{
    fun VariableTree.map() : VariableTree?
    override fun invoke(p1 : VariableTree) = p1.map()
}
fun interface KTTraitApt : KotlinApt,(TraitTree)->TraitTree?{
    fun TraitTree.map() : TraitTree?
    override fun invoke(p1 : TraitTree) = p1.map()
}
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
@Suppress("NOTHING_TO_INLINE")
inline fun ProjectTree.toKotlinTree(vararg apts : KotlinApt) = toKotlinTree(apts.toList())
tailrec fun ProjectTree.toKotlinTree(
    apts : List<KotlinApt> = emptyList()
) : ProjectTree{
    if (apts.isEmpty()) return this
    val copyProjectOnlyByTopTreeApt : ProjectTree.((TopTree)->TopTree?)->ProjectTree = {
        copy(
            children = children.map {
                it.copy(
                    children = it.children.mapNotNull {
                        it(it)
                    }
                )
            }
        )
    }
   val resultTree = when(val apt = apts.first()){
        is KTFunctionApt -> copyProjectOnlyByTopTreeApt {
            if (it is FunctionTree) apt(it) else it
        }
        is KTTraitApt -> copyProjectOnlyByTopTreeApt {
            if (it is TraitTree) apt(it) else it
        }
        is KTVariableApt -> copyProjectOnlyByTopTreeApt {
            if (it is VariableTree) apt(it) else it
        }
        is KTProjectApt -> apt(this)
    }
    return resultTree.toKotlinTree(apts.drop(1))
}