package api.data

import api.data.ExprTree.*
import api.data.TopTree.CallableTree.VariableTree
import api.tools.Either
import api.tools.Optional
import api.tools.some

sealed interface Tree
sealed interface InnerTree : Tree{
    val line : Int
    val row : Int
    val module : String
}
data class CheckedInfo(
    val line : Int,
    val row : Int,
    val module : String
)
sealed interface ITree : InnerTree{
    val info : CheckedInfo
    override val line : Int
        get() = info.line
    override val row : Int
        get() = info.line
    override val module : String
        get() = info.module
}
val InnerNode.information get() = CheckedInfo(line,row,fileName)
data class ProjectTree(
    val name: ID,
    val children: List<ModuleTree>
) : Tree
data class ModuleTree(
    val name: ID,
    val children: List<TopTree>
) : Tree
sealed interface StmtTree : ITree
sealed interface TopTree : StmtTree{
    val annotations : List<AnnTree>
    val name : ID
    //TODO没有泛型是因为这个是一个预览版特性
    sealed interface CallableTree : TopTree{
        val receiver : Optional<TypeTree>
        val type : Optional<TypeTree>
        data class FunctionTree(
            override val info : CheckedInfo,
            override val name : ID,
            val body : Optional<Lazy<Block>>,
            override val type : Optional<TypeTree>,
            override val receiver : Optional<TypeTree>,
            val params : List<VariableTree>,
            override val annotations : List<AnnTree>
        ) : CallableTree
        data class VariableTree(
            override val info : CheckedInfo,
            override val receiver : Optional<TypeTree>,
            override val type : Optional<TypeTree>,
            override val name : ID,
            val kind : VariableTreeType,
            val value : Optional<ExprTree>,
            override val annotations : List<AnnTree>
        ) : CallableTree{
            enum class VariableTreeType{
                VARIABLE,VALUE,CONSTANT
            }
        }
    }
    data class TraitTree(
        override val info : CheckedInfo,
        override val name : ID,
        val members : List<CallableTree>,
        override val annotations : List<AnnTree>,
        val parent : TypeTree?
    ) : TopTree
}
@JvmInline value class Block(private val stmts : List<StmtTree>) : List<StmtTree> by stmts,Tree
val List<StmtTree>.block get() = Block(this)
fun blocking(vararg stmts : StmtTree) = Block(stmts.toList())
@JvmInline value class ID(val text : String) : Comparable<String> by text, CharSequence by text,Tree
val String.id : ID get() = ID(this)
data class AnnTree(
    override val info : CheckedInfo,
    val name : NameTree,
    val value : Either<FaceValueTree<Any>,NameTree>?
) : ITree
sealed interface ExprTree : StmtTree{
    val type : Optional<TypeTree>
    data class NameTree(
        override val info : CheckedInfo,
        val china : List<String>,
        override val type : Optional<TypeTree>
    ) : ExprTree,List<String> by china
    data class InvokeTree(
        override val info : CheckedInfo,
        val invoker : Optional<ExprTree>,
        val args : Either<List<ExprTree>,Map<ID,ExprTree>>,
        val generic : Map<ID,TypeTree>,
        val outsideLambda : Optional<LambdaTree>,
        override val type : Optional<TypeTree>
    ) : ExprTree
    data class LambdaTree(
        override val info : CheckedInfo,
        val params : List<VariableTree>,
        val body : Block,
        override val type : Optional<TypeTree>
    ) : ExprTree
    sealed class FaceValueTree<out T>(
        private val typeName : String
    ) : ExprTree{
        abstract val value : T
        override val type : Optional<TypeTree> get() = TypeTree(
            info = info,
            name = typeName,
            generic = mapOf()
        ).some
        data class DecValueTree(
            override val info : CheckedInfo,
            override val value : Double
        ) : FaceValueTree<Double>("小数")
        data class BoolValueTree(
            override val info : CheckedInfo,
            override val value : Boolean
        ) : FaceValueTree<Boolean>("逻辑")
        data class IntValueTree(
            override val info : CheckedInfo,
            override val value : Int
        ) : FaceValueTree<Int>("整数")
        data class StrValueTree(
            override val info : CheckedInfo,
            override val value : String
        ) : FaceValueTree<String>("文本")
        data class UnitValueTree(
            override val info : CheckedInfo,
            override val value : Unit = Unit
        ) : FaceValueTree<Unit>("空")
        data class NullValueTree(
            override val info : CheckedInfo,
            override val value : Nothing? = null
        ) : FaceValueTree<Nothing?>("真空")
    }
    data class IfTree(
        override val info : CheckedInfo,
        val condition : Optional<ExprTree>,
        val then : Block,
        val `else` : Block?,
        override val type : Optional<TypeTree>
    ) : ExprTree
    data class WhenTree(
        override val info : CheckedInfo,
        override val type : Optional<TypeTree>,
        val value : Optional<ExprTree>,
        val cases : List<CaseTree>
    ) : ExprTree{
        sealed interface CaseTree : ITree{
            data class AtCaseTree(
                override val info : CheckedInfo,
                val condition : Optional<ExprTree>,
                val block : Block
            ) : CaseTree
            data class ValueCaseTree(
                override val info : CheckedInfo,
                val value : List<ExprTree>,
                val block : Block
            ) : CaseTree
            data class TypeCaseTree(
                override val info : CheckedInfo,
                val matcher : TypeTree,
                val block : Block
            ) : CaseTree
            data class ElseCaseTree(
                override val info : CheckedInfo,
                val block : Block
            ) : CaseTree
        }
    }
}
//类型并不是一等公民,而是等效替换成包含着类型信息的凝华类型对象常量名
data class TypeTree(
    override val info : CheckedInfo,
    val name : String,
    val generic : Map<ID,TypeTree>
) : ITree