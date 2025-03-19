@file:Suppress("NestedLambdaShadowedImplicitParameter")

import api.data.*
import api.rule.*
import api.tools.*
import api.translators.kotlin.aptedKotlinTree
import api.translators.kotlin.functionApts
import api.translators.kotlin.kotlinTree

const val subCodePath = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.sub"
const val ktCodeLang = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.kt"
fun main(){
    apt()
    ProjectNode(
        name = "subTest",
        files = listOf("main".toAst())
    ).print.check().print.run{
        first.aptedKotlinTree.print.kotlinTree.print
    }
}
fun apt(){
    functionApts = functionApts or partial({
        it.annotations.find{ it.name.china == listOf("启动函数") } != null
    },{
        it.copy(
            annotations = it.annotations.filter{ it.name.china != listOf("启动函数") },
            name = "main".id
        )
    })
}