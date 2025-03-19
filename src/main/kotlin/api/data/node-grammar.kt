package api.data

import api.data.ExprNode.*
import api.data.ExprTree.FaceValueTree
import api.data.ExprTree.NameTree
import api.data.TopNode.CallableNode.VariableNode
import api.tools.Either

sealed interface Node
data class ParserInfo(
    val line: Int,
    val row: Int,
    val fileName: String
){
    override fun toString() = "($fileName:$line,$row)"
}
sealed interface InnerNode : Node{
    val node : ParserInfo
    val fileName : String
        get() = node.fileName
    val line : Int
        get() = node.line
    val row : Int
        get() = node.row
}
data class ProjectNode(
    val name: String,
    val files: List<FileNode>
) : Node
data class FileNode(
    val name: String,
    val tops: List<TopNode>
) : Node
sealed interface StmtNode : InnerNode
sealed interface TopNode : StmtNode{
    val name : String
    val annotations : List<AnnNode>
    sealed interface CallableNode : TopNode{
        val receiver : TypeNode?
        val type : TypeNode?
        data class VariableNode(
            override val node : ParserInfo,
            override val name : String,
            override val receiver : TypeNode?,
            override val type : TypeNode?,
            val kind : VariableNodeKind,
            val value : ExprNode?,
            override val annotations : List<AnnNode>
        ) : CallableNode{
            enum class VariableNodeKind{
                VARIABLE,
                VALUE,
                CONSTANT
            }
        }
        data class FunctionNode(
            override val node : ParserInfo,
            override val name : String,
            override val receiver : TypeNode?,
            val params : List<VariableNode>,
            val body : BlockNode?,
            override val type : TypeNode?,
            override val annotations : List<AnnNode>
        ) : CallableNode
    }
    data class TraitNode(
        override val node : ParserInfo,
        override val name : String,
        val members : List<CallableNode>,
        override val annotations : List<AnnNode>,
        val parent : TypeNode?
    ) : TopNode
}
sealed interface ExprNode : StmtNode{
    sealed interface FaceValueNode<out T> : ExprNode{
        val value : T
        data class IntValueNode(
            override val node : ParserInfo,
            override val value : Int
        ) : FaceValueNode<Int>
        data class DecValueNode(
            override val node : ParserInfo,
            override val value : Double
        ) : FaceValueNode<Double>
        data class StringValueNode(
            override val node : ParserInfo,
            override val value : String
        ) : FaceValueNode<String>
        data class BoolValueNode(
            override val node : ParserInfo,
            override val value : Boolean
        ) : FaceValueNode<Boolean>
        data class UnitValueNode(
            override val node : ParserInfo,
            override val value : Unit = Unit
        ) : FaceValueNode<Unit>
        data class NullValueNode(
            override val node : ParserInfo,
            override val value : Nothing? = null
        ) : FaceValueNode<Nothing?>
    }
    data class NameNode(
        override val node : ParserInfo,
        val chain : List<String>
    ) : ExprNode
    data class TypeNode(
        override val node : ParserInfo,
        val name : String,
        val generic : Either<List<TypeNode>,Map<String,TypeNode>>
    ) : ExprNode
    data class IfNode(
        override val node : ParserInfo,
        val condition : ExprNode,
        val then : BlockNode,
        val `else` : BlockNode?
    ) : ExprNode
    data class WhenNode(
        override val node : ParserInfo,
        val value : ExprNode?,
        val cases : List<CaseNode>
    ) : ExprNode
    data class LambdaNode(
        override val node : ParserInfo,
        val params : List<VariableNode>,
        val body : BlockNode
    ) : ExprNode
    data class InvokeNode(
        override val node : ParserInfo,
        val invoker : ExprNode,
        val args : Either<List<ExprNode>,Map<String,ExprNode>>,
        val generic : Either<List<TypeNode>,Map<String,TypeNode>>,
        val outsideLambda : LambdaNode?
    ) : ExprNode
}
data class AnnNode(
    override val node : ParserInfo,
    val name : NameNode,
    val value : Either<ExprNode,ID>?
) : InnerNode
data class BlockNode(
    override val node : ParserInfo,
    val statements : List<StmtNode>
) : InnerNode,List<StmtNode> by statements
sealed interface CaseNode : InnerNode{
    data class ElseCaseNode(
        override val node : ParserInfo,
        val block : BlockNode
    ) : CaseNode
    data class ValueCaseNode(
        override val node : ParserInfo,
        val value : List<ExprNode>,
        val block : BlockNode
    ) : CaseNode
    data class AtCaseNode(
        override val node : ParserInfo,
        val bool : ExprNode,
        val block : BlockNode
    ) : CaseNode
    data class TypeCaseNode(
        override val node : ParserInfo,
        val matcher : TypeNode,
        val block : BlockNode
    ) : CaseNode
}