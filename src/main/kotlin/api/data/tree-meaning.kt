@file:Suppress("unused")

package api.data

import api.data.ExpressionTree.NameTree
import api.data.TopTree.DataTree
import api.data.TopTree.StructTree
import api.data.TypeTree.CommonTypeTree.BasicTypeTree.ANY
sealed interface Tree
sealed interface InnerTree : Tree {
    val line: Int
    val row: Int
    val moduleName: String
    val projectName: String
    data class LRMP(
        override val line: Int,
        override val row: Int,
        override val moduleName: String,
        override val projectName: String
    ) : InnerTree
    companion object {
        operator fun invoke(line: Int, row: Int, moduleName: String, projectName: String): InnerTree = LRMP(line, row, moduleName, projectName)
    }
}
data class ProjectTree(
    val name: String,
    val module: List<ModuleTree>
) : Tree
data class ModuleTree(
    val name: String,
    val children: List<TopTree>
) : Tree
sealed interface TypeTree : InnerTree {
    sealed interface CommonTypeTree : TypeTree {
        data class StructTypeTree(
            val tree: InnerTree,
            val struct: StructTree
        ) : CommonTypeTree, InnerTree by tree
        enum class BasicTypeTree : CommonTypeTree {
            STR,INT,DEC,BOOL,UNIT,NOTHING,ANY;
            override val line : Int = 1
            override val row : Int = 1
            override val moduleName : String = "sub_core"
            override val projectName : String = "Sublimation"
        }
    }
    data class NullableTypeTree<T : TypeTree>(
        val tree : InnerTree,
        val trueType : T
    ) : TypeTree, InnerTree by tree
    data class FailableTypeTree<T : TypeTree>(
        val tree : InnerTree,
        val trueType : T
    ) : TypeTree, InnerTree by tree
    data class GenericTypeTree(
        val innerTree: InnerTree,
        val generic: String
    ) : TypeTree, InnerTree by innerTree
    data class FunctionTypeTree(
        val innerTree: InnerTree,
        val param: List<TypeTree>,
        val returnType: TypeTree
    ) : TypeTree, InnerTree by innerTree
    data class TupleTypeTree(
        val innerTree: InnerTree,
        val elementType: List<TypeTree>
    ) : TypeTree, InnerTree by innerTree
}

sealed interface TopTree : InnerTree {
    val name: String
    val annotations: List<AnnotationTree<Any>>
    data class DataTree(
        val tree: InnerTree,
        override val name: String,
        val type: TypeTree,
        val value: ExpressionTree,
        override val annotations: List<AnnotationTree<Any>> = listOf()
    ) : TopTree,StmtTree,DataOrAssign,InnerTree by tree
    data class StructTree(
        val tree: InnerTree,
        override val name: String,
        val data: List<DataTree>,
        val generic: List<TypeTree> = listOf(),
        override val annotations: List<AnnotationTree<Any>> = listOf()
    ) : TopTree, InnerTree by tree
}
data class AnnotationTree<T : Any>(
    val tree: InnerTree,
    val struct: StructTree,
    val value: T?
) : InnerTree by tree
sealed interface ExpressionTree : InnerTree {
    val type: TypeTree
    sealed interface FaceTree : ExpressionTree{
        data class FaceValueTree<T>(
            val tree: InnerTree,
            val value: T,
            override val type: TypeTree
        ) : FaceTree, InnerTree by tree
        data class NullValueTree(
            val tree: InnerTree,
            override val type: TypeTree = ANY
        ) : FaceTree, InnerTree by tree
    }
    data class NameTree(
        val tree : InnerTree,
        val name : List<String>,
        override val type : TypeTree
    ) : ExpressionTree, InnerTree by tree
    data class LambdaTree(
        val tree : InnerTree,
        val param : List<DataTree>,
        val body : List<StmtTree>,
        override val type : TypeTree
    ) : ExpressionTree, InnerTree by tree
}
val NameTree.text : String get() =
    if(name.isNotEmpty())name.drop(1)
    .fold(name.first()){acc,it-> "$acc.$it" } else ""
sealed interface StmtTree : InnerTree{
    data class AssignTree(
        val tree : InnerTree,
        val name : NameTree,
        val value : ExpressionTree
    ) : StmtTree,DataOrAssign,InnerTree by tree
}
sealed interface DataOrAssign : StmtTree
sealed interface SETree : ExpressionTree,StmtTree{
    data class InvokeTree(
        val tree : InnerTree,
        override val type : TypeTree,
        val name : NameTree,
        val args : List<ExpressionTree>
    ) : SETree,InnerTree by tree
}