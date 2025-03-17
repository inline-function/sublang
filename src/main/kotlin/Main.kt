
import api.data.*
import api.rule.*
import api.tools.*
import api.translators.kotlin.kotlinTree

var a = 0
const val subCodePath = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.sub"
const val ktCodeLang = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.kt"
/*val main get() =
    ProjectNode(
        nameof = "test",
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
*/
fun main(){
    ProjectNode(
        name = "subTest",
        files = listOf("main".toAst())
    ).print.check().print.run{
        first.kotlinTree.print
    }
}