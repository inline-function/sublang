@file:Suppress(
    "ConstantConditionIf",
    "RedundantLambdaOrAnonymousFunction",
    "NOTHING_TO_INLINE",
    "RemoveRedundantBackticks",
    "KotlinRedundantDiagnosticSuppress",
    "UNUSED_ANONYMOUS_PARAMETER",
    "CAST_NEVER_SUCCEEDS",
    "UNREACHABLE_CODE",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UnusedImport",
    "RedundantSuspendModifier"
)

import api.rule.*
import api.tools.*
import org.jetbrains.annotations.TestOnly
import java.io.IOException

const val path = "C:\\Users\\ZhuanZ\\Desktop\\草稿.txt"
fun main() {
    buildList{
        repeat(readln().toInt()) {
            addAll(
                readln()
                    .trim()
                    .split(Regex("\\s+"))
                    .map(String::toInt)
            )
        }
    }.sorted().apply{
        var duplicate = -1
        var missing = -1
        (1 until size).forEach {
            val prev = this[it - 1]
            val current = this[it]
            when{
                prev == current    -> duplicate = current
                current - prev > 1 -> missing = prev + 1
            }
        }
        println("$missing $duplicate")
    }
}