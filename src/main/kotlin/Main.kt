import api.data.ProjectNode
import api.rule.ast
import api.rule.check
import api.tools.print
import api.translators.kotlin.*
import java.io.File
import java.io.InputStream
const val subCodePath = "F:\\JavaProject\\SublimationLang\\docs\\code.sub"
const val ktCodeLang = "F:\\JavaProject\\SublimationLang\\docs\\code.kt"
val main get() =
    ProjectNode(
        name = "test",
        files = listOf(
            String(
                File(subCodePath)
                    .inputStream()
                    .use(InputStream::readAllBytes)
            )
            .ast("ok")
            .print()
        )
    )
    .check
    .print()
    .first
    .kotlinTree
    .print()
    .toString()
    .toByteArray().run {
        File(ktCodeLang)
            .outputStream()
            .use{ it.write(this) }
    }
