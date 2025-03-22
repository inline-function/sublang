@file:Suppress("NestedLambdaShadowedImplicitParameter")

import api.data.*
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.rule.*
import api.tools.*
import api.translators.kotlin.apts.*
import api.translators.kotlin.kotlinTree
import api.translators.kotlin.toKotlinTree
import kotlin.jvm.internal.Ref.IntRef

const val subCodePath = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.sub"
const val ktCodeLang = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.kt"
fun main(){
    ProjectNode(
        name = "subTest",
        files = listOf("main".toAst())
    )
    .print
    .check()
    .print
    .run{
        val idMap = mutableMapOf<ID,ID>()
        var info = second
        first.toKotlinTree(
            ProjectIdProcessor(IdMapClosure(idMap)),
            TheMainFunction(idMap),
            JvmFunction(idMap){ info += it },
            ProjectIdProcessor(IdMapClosure(idMap)),
        )
        .print
        .kotlinTree
        .print
    }
}
