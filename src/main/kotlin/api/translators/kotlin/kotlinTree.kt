@file:Suppress("NestedLambdaShadowedImplicitParameter","NullableBooleanElvis")

package api.translators.kotlin

import api.tools.Either
import api.tools.left
import api.tools.such
import org.jetbrains.annotations.TestOnly

sealed interface KTTree
sealed interface KTInnerTree : KTTree
data class KTProjectTree(
    val name: String,
    val files: List<KTFileTree>,
) : KTInnerTree{
    override fun toString() : String =
        "/* kotlin_project_name:$name */\n" + files.fold(""){acc,it->
            acc+"//${it.name}.kt\n$it"
        }
}
data class KTFileTree(
    val name: String,
    val packageName: String,
    val tops: List<KTTopTree>,
    val annotation : List<KTAnnotationTree> = listOf(),
) : KTInnerTree{
    override fun toString() : String =
        "package $packageName\n" +
        annotation.fold(""){acc,it->
            acc+"@file:${it.name}(${it.args.joinToString()})\n"
        } + tops.fold(""){acc,it->
            acc+"$it\n"
        }
}
sealed interface KTTopTree : KTInnerTree{
    val name: String
    val generic : List<KTTypeTree>
    val annotations : List<KTAnnotationTree>
}
data class KTAnnotationTree(
    val name : String,
    val args : List<KTExpressionTree>,
) : KTInnerTree{
    override fun toString() : String =
        "@${name}(${args.joinToString()})"
}
data class KTClassTree(
    override val name: String,
    val members: List<KTTopTree>,
    val constructorArgs: List<Either<
        KTVariableTree,
        Triple<
            List<KTAnnotationTree>,
            String,
            KTTypeTree
        >
    >> = listOf(),
    override val generic : List<KTTypeTree>,
    override val annotations : List<KTAnnotationTree>,
    val modifiers : List<String>,
    val parents : List<KTTypeTree>,
) : KTTopTree,KTStatementTree {
    override fun toString() : String =
        annotations.fold(""){acc,it->"$acc$it\n"}+
        modifiers.fold(""){acc,it->"$acc$it "}+
        " class "+if(generic.isEmpty()) "" else "<${generic.joinToString(",")}>"+
        name+if(constructorArgs.isEmpty()) " " else "(${constructorArgs.fold(""){acc,it->
            acc+it.such(KTVariableTree::toString){
                it.let{(anns,name,type)->
                    anns.fold(""){acc,it->"$acc$it\n"}+name+" : "+type
                }
            }+","
        }})"+if(parents.isEmpty()) "" else " : "+parents.joinToString(",")+
        "{\n"+members.joinToString("\n")+"}\n"
}
data class KTVariableTree(
    override val name: String,
    val type: KTTypeTree,
    val value: KTExpressionTree?,
    val receiver: KTTypeTree? = null,
    val mutable : Boolean,
    override val generic: List<KTTypeTree>,
    override val annotations: List<KTAnnotationTree>,
    val modifiers: List<String>,
) : KTTopTree, KTStatementTree {
    override fun toString(): String =
        annotations.fold("") { acc, it -> "$acc$it\n" } +
        modifiers.fold("") { acc, it -> "$acc$it " } +
        if (mutable) "var" else "val" +
        (receiver?.let { "$it." } ?: "") + name +
        if (generic.isEmpty()) "" else "<${generic.joinToString(", ")}>" +
        ": $type" + (value?.let { " = $it" } ?: "") + "\n"
}
data class KTFunctionTree(
    override val name: String,
    val params: Map<String, KTTypeTree>,
    val body: KTBlockTree,
    val receiver: String? = null,
    override val generic: List<KTTypeTree>,
    override val annotations: List<KTAnnotationTree>,
    val modifiers: List<String>,
) : KTTopTree, KTStatementTree {
    override fun toString(): String =
        annotations.fold("") { acc, it -> "$acc$it\n" } +
        modifiers.fold("") { acc, it -> "$acc$it " } +
        "fun " +
        (if (generic.isNotEmpty()) "<${generic.joinToString(", ")}> " else "") +
        (receiver?.let { "$it." } ?: "") +
        name +
        "(${params.entries.joinToString(", ") { "${it.key}: ${it.value}" }})" +
        " $body\n"
}
sealed interface KTStatementTree : KTInnerTree
sealed interface KTExpressionTree : KTStatementTree
data class KTAssignTree(
    val name: KTNameTree,
    val value: KTExpressionTree,
) : KTStatementTree{
    override fun toString() : String =
        "$name = $value"
}
data class KTReturnTree(
    val value: KTExpressionTree,
) : KTStatementTree{
    override fun toString() : String =
        "return $value"
}
data object KTNullTree : KTExpressionTree {
    override fun toString() : String = "null"
}
data class KTThrowTree(
    val value: KTExpressionTree,
) : KTStatementTree{
    override fun toString() : String =
        "throw $value"
}
data class KTIFTree(
    val condition: KTExpressionTree,
    val body: KTBlockTree,
    val elseBody: KTBlockTree? = null,
) : KTExpressionTree{
    override fun toString() : String =
        "if($condition) $body" +
        if (elseBody==null) "" else " else $elseBody"
}
data class KTWhenTree(
    val condition: KTExpressionTree?,
    val cases : List<KTCaseTree> = listOf(),
    val `else` : KTBlockTree? = null,
) : KTExpressionTree{
    override fun toString() : String =
        if (condition==null) "" else "($condition)" + KTBlockTree(
            statements = `else`?.run {
                cases + KTConstCaseTree(
                    value = KTNameTree(
                        chain = listOf("else")
                    ),
                    body = `else`
                )
            } ?: cases
        )
}
data class KTFaceTree<T>(
    val value : T,
) : KTExpressionTree{
    override fun toString() : String = when(value){
        is String -> "\"$value\""
        is Char -> "\'$value\'"
        else -> value?.toString()?:"null"
    }
}
data class KTInvokeTree(
    val name : KTExpressionTree,
    val args : Either<List<KTExpressionTree>,Map<String,KTExpressionTree>>,
) : KTExpressionTree{
    override fun toString() : String =
        "$name(${args.such(List<KTExpressionTree>::joinToString){
                it.entries.fold(""){
                    acc,(key,value)->"$acc$key = $value,"
                }
            }
        })"
}
data class KTNameTree(
    val chain : List<String>,
) : KTExpressionTree{
    override fun toString() : String =
        chain.joinToString(".")
}
data class KTLambdaTree(
    val params : Map<String,KTTypeTree?>,
    val body : List<KTStatementTree>,
) : KTExpressionTree{
    override fun toString() : String =
        "{${params.map { "${it.key}${it.value?.let{":$it"} ?: ""}" }.joinToString()
        } -> ${body.fold(""){acc,it-> "$acc$it\n" }}"
}
sealed interface KTCaseTree : KTStatementTree
data class KTConstCaseTree(
    val value : KTExpressionTree,
    val body : KTBlockTree,
) : KTCaseTree{
    override fun toString() : String =
        "$value -> $body"
}
data class KTIsCaseTree(
    val type : KTTypeTree,
    val body : KTBlockTree,
) : KTCaseTree{
    override fun toString() : String =
        "is $type -> $body"
}
data class KTBlockTree(
    val statements: List<KTStatementTree>,
) : KTInnerTree{
    override fun toString() : String = "{\n" +
        statements.fold(""){acc,it-> "$acc$it\n" } +
    "}"
}
data class KTTypeTree(
    val name : String,
    val generic : List<KTTypeTree> = listOf(),
) : KTInnerTree{
    override fun toString() : String =
        "($name${if(generic.isNotEmpty()) "<${generic.joinToString()}>" else ""})"
}