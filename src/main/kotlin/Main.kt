@file:Suppress("NestedLambdaShadowedImplicitParameter")

import api.data.*
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.rule.*
import api.tools.*
import api.translators.kotlin.Apts
import api.translators.kotlin.kotlinTree
import api.translators.kotlin.toKotlinTree
import kotlin.jvm.internal.Ref.IntRef

const val subCodePath = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.sub"
const val ktCodeLang = "F:\\JavaProject\\SublimationLang\\cao2gao3\\code.kt"
fun main(){
    ProjectNode(
        name = "subTest",
        files = listOf("main".toAst())
    ).print.check().print.run{
        first.toKotlinTree(
            run{
                val idMap = mutableMapOf<ID,ID>()
                var i = 0
                Apts(
                    functionApts = io1 {
                        if(it.annotations.find { it.name.text == "启动函数" } != null)
                            "main".id.run {
                                idMap[it.name] = this
                                it.copy(name = this)
                            }
                        else it
                    },
                    processId = io1 {
                        if(idMap.containsKey(it))
                            idMap[it]!!
                        else
                            "subid$${i++}".id.apply { idMap[it] = this }
                    }
                )
            }
        ).print.kotlinTree.print
    }
}
