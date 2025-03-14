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
fun main(){ theMain().func() }
fun theMain() = allDo(
    printLine("开始写入文件..."),
    writeFile(path,"我是内容"),
    printLine("写入完毕")
) catch {it:Throwable->
    printLine(it.message!!)
}