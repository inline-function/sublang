@file:Suppress("NestedLambdaShadowedImplicitParameter","NullableBooleanElvis")

package api.translators.kotlin

import api.tools.Either
import api.tools.left
import api.tools.such

sealed interface KTTree{
    val metaData : Map<String,String?>
}
sealed interface KTInnerTree : KTTree
data class KTProjectTree(
    val name: String,
    val files: List<KTFileTree>,
    override val metaData : Map<String,String?> = mapOf()
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
    override val metaData : Map<String,String?> = mapOf()
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
    val args : List<String>,
    override val metaData : Map<String,String?> = mapOf()
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
    override val generic : List<KTTypeTree> = listOf(),
    override val annotations : List<KTAnnotationTree> = listOf(),
    override val metaData : Map<String,String?> = mapOf()
) : KTTopTree,KTStatementTree{
    override fun toString() : String =
        annotations.fold(""){acc,it->acc+it+"\n"} +
        metaData.keys.flatMap{ metaData[it]?.run { listOf() } ?: listOf(it) }
        .joinToString(" ") + " class" +
        generic.run { if(isNotEmpty()) "<${joinToString()}>" else "" } + " $name(" +
        constructorArgs.joinToString {
            it.such(
                left = { it.toString() },
                right = {
                    val (ann,name,type) = it
                    "${ann.joinToString(" ")} $name: $type"
                }
            )
        } + "){" + members.fold(""){acc,it->
            acc+"$it\n"
        } + "}"
}
data class KTVariableTree(
    override val name: String,
    val type: KTTypeTree,
    val value: KTExpressionTree?,
    val receiver: KTTypeTree? = null,
    override val generic : List<KTTypeTree> = listOf(),
    override val annotations : List<KTAnnotationTree> = listOf(),
    override val metaData : Map<String,String?> = mapOf()
) : KTTopTree,KTStatementTree{
    override fun toString() : String =
        annotations.fold(""){acc,it->acc+it+"\n"} +
        metaData.keys.flatMap{ metaData[it]?.run { listOf() } ?: listOf(it) }
        .joinToString(" ") + if (metaData["mutable"]?.toBoolean()?:false) "var" else "val" +
        generic.run { if(isNotEmpty()) "<${joinToString()}>" else "" } + "${
        if (receiver==null) " " else " $receiver."}$name: $type " +
        if (value==null) "" else (if (metaData["by"]?.toBoolean()?:false) "by" else "=") + " $value"
}
data class KTFunctionTree(
    override val name: String,
    val params: Map<String,KTTypeTree>,
    val body: KTBlockTree,
    val receiver: String? = null,
    override val generic : List<KTTypeTree> = listOf(),
    override val annotations : List<KTAnnotationTree> = listOf(),
    override val metaData : Map<String,String?> = mapOf()
) : KTTopTree,KTStatementTree{
    override fun toString() : String =
        annotations.fold(""){acc,it->acc+it+"\n"} +
        metaData.keys.flatMap{ metaData[it]?.run { listOf() } ?: listOf(it) }
        .joinToString(" ") + "fun" +
        generic.run { if(isNotEmpty()) "<${joinToString()}>" else "" } + "${
        if (receiver==null) " " else " $receiver."}$name(" +
        params.map { "${it.key}: ${it.value}" }.joinToString() + ") "+ body
}
sealed interface KTStatementTree : KTInnerTree
sealed interface KTExpressionTree : KTStatementTree
data class KTAssignTree(
    val name: KTNameTree,
    val value: KTExpressionTree,
    override val metaData : Map<String,String?> = mapOf()
) : KTStatementTree{
    override fun toString() : String =
        "$name = $value"
}
data class KTReturnTree(
    val value: KTExpressionTree,
    override val metaData : Map<String,String?> = mapOf()
) : KTStatementTree{
    override fun toString() : String =
        "return $value"
}
data object KTNullTree : KTExpressionTree {
    override val metaData : Map<String,String?> = mapOf()
    override fun toString() : String = "null"
}
data class KTThrowTree(
    val value: KTExpressionTree,
    override val metaData : Map<String,String?> = mapOf()
) : KTStatementTree{
    override fun toString() : String =
        "throw $value"
}
data class KTIFTree(
    val condition: KTExpressionTree,
    val body: KTBlockTree,
    val elseBody: KTBlockTree? = null,
    override val metaData : Map<String,String?> = mapOf()
) : KTExpressionTree{
    override fun toString() : String =
        "if($condition) $body" +
        if (elseBody==null) "" else " else $elseBody"
}
data class KTWhenTree(
    val condition: KTExpressionTree?,
    val cases : List<KTCaseTree> = listOf(),
    val `else` : KTBlockTree? = null,
    override val metaData : Map<String,String?> = mapOf()
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
    override val metaData : Map<String,String?> = mapOf()
) : KTExpressionTree{
    override fun toString() : String = when(value){
        is String -> "\"$value\""
        is Char -> "\'$value\'"
        else -> value.toString()
    }
}
data class KTInvokeTree(
    val name : KTNameTree,
    val args : List<KTExpressionTree>,
    override val metaData : Map<String,String?> = mapOf()
) : KTExpressionTree{
    override fun toString() : String =
        "$name(${args.joinToString()})"
}
data class KTNameTree(
    val chain : List<String>,
    override val metaData : Map<String,String?> = mapOf()
) : KTExpressionTree{
    override fun toString() : String =
        chain.joinToString(".")
}
data class KTLambdaTree(
    val params : Map<String,KTTypeTree?>,
    val body : List<KTStatementTree>,
    override val metaData : Map<String,String?> = mapOf()
) : KTExpressionTree{
    override fun toString() : String =
        "{${params.map { "${it.key}${it.value?.let{":$it"} ?: ""}" }.joinToString()
        } -> ${body.fold(""){acc,it-> "$acc$it\n" }}"
}
sealed interface KTCaseTree : KTStatementTree
data class KTConstCaseTree(
    val value : KTExpressionTree,
    val body : KTBlockTree,
    override val metaData : Map<String,String?> = mapOf()
) : KTCaseTree{
    override fun toString() : String =
        "$value -> $body"
}
data class KTIsCaseTree(
    val type : KTTypeTree,
    val body : KTBlockTree,
    override val metaData : Map<String,String?> = mapOf()
) : KTCaseTree{
    override fun toString() : String =
        "is $type -> $body"
}
data class KTBlockTree(
    val statements: List<KTStatementTree>,
    override val metaData : Map<String,String?> = mapOf()
) : KTInnerTree{
    override fun toString() : String = "{\n" +
        statements.fold(""){acc,it-> "$acc$it\n" } +
    "}"
}
data class KTTypeTree(
    val name : String,
    val generic : List<KTTypeTree> = listOf(),
    override val metaData : Map<String,String?> = mapOf()
) : KTInnerTree{
    override fun toString() : String =
        "($name${if(generic.isNotEmpty()) "<${generic.joinToString()}>" else ""})"
}