package api.data
import api.data.ExprNode.AccessChainNode
import api.data.InnerNode.LRM
import api.data.TopNode.DataNode

interface Node
interface InnerNode : Node {
    val line: Int
    val row: Int
    val moduleName: String
    data class LRM(
        override val line: Int,
        override val row: Int,
        override val moduleName: String
    ) : InnerNode
    companion object {
        operator fun invoke(line: Int, row: Int, moduleName: String): InnerNode = LRM(line, row, moduleName)
    }
}
data class ProjectNode(
    val name: String = "",
    val files: List<FileNode> = listOf()
) : Node
data class FileNode(
    val name: String,
    val tops: List<TopNode> = listOf()
) : Node
infix fun Token.nodeAt(moduleName: String) = LRM(line, row, moduleName)
sealed interface TopNode : InnerNode {
    val annotations: List<AnnotationNode>
    val name: String
    data class DataNode(
        val innerNode: InnerNode,
        override val name: String,
        val type: TypeNode? = null,
        val value: ExprNode? = null,
        override val annotations: List<AnnotationNode> = listOf(),
    ) : TopNode, StmtNode, InnerNode by innerNode
    data class StructNode(
        val innerNode: InnerNode,
        override val name: String,
        val data: List<DataNode>,
        override val annotations: List<AnnotationNode> = listOf()
    ) : TopNode, InnerNode by innerNode
}
sealed interface TypeNode : InnerNode {
    data class CommonTypeNode(
        val innerNode: InnerNode,
        val name: List<String>,
        val typeArgs: List<TypeNode>?
    ) : TypeNode, InnerNode by innerNode
    data class TupleTypeNode(
        val innerNode: InnerNode,
        val element: List<TypeNode>
    ) : TypeNode, InnerNode by innerNode
    data class FunctionTypeNode(
        val innerNode: InnerNode,
        val params: List<TypeNode>,
        val returnType: TypeNode
    ) : TypeNode, InnerNode by innerNode
}
sealed interface ExprNode : InnerNode {
    data class AccessChainNode(
        val innerNode: InnerNode,
        val chain: List<String>
    ) : ExprNode,InnerNode by innerNode
    data class FaceValueNode<out T : Any>(
        val innerNode: InnerNode,
        val value: T
    ) : ExprNode, InnerNode by innerNode
    data class LambdaNode(
        val innerNode: InnerNode,
        val params: List<DataNode>,
        val block : BlockNode
    ) : ExprNode, InnerNode by innerNode
}
sealed interface StmtNode : InnerNode
data class BlockNode(
    val innerNode: InnerNode,
    val stmts: List<StmtNode>
) : StmtNode, InnerNode by innerNode
sealed interface SENode : ExprNode,StmtNode{
    data class InvokeNode(
        val innerNode: InnerNode,
        val name: AccessChainNode,
        val args: List<ExprNode>
    ) : SENode, InnerNode by innerNode
    data class PrefixInvokeNode(
        val innerNode: InnerNode,
        val name: AccessChainNode,
        val args: ExprNode
    ) : SENode, InnerNode by innerNode
    data class InfixInvokeNode(
        val innerNode: InnerNode,
        val name: AccessChainNode,
        val args: Pair<ExprNode, ExprNode>
    ) : SENode, InnerNode by innerNode
}
data class AnnotationNode(
    val innerNode: InnerNode,
    val name: AccessChainNode,
    val value: String?
) : InnerNode by innerNode
