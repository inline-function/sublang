@file:Suppress("NestedLambdaShadowedImplicitParameter")

package api.translators.kotlin.apts

import api.data.Block
import api.data.ExprTree
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.ExprTree.WhenTree.CaseTree.*
import api.data.ID
import api.data.StmtTree
import api.data.TopTree
import api.data.id
import api.tools.also
import api.tools.let
import api.tools.map
import api.tools.not
import api.translators.kotlin.KTFunctionApt

fun TheMainFunction(idMap : MutableMap<ID,ID>) = KTFunctionApt {
    if (annotations.any{ it.name.text == "启动函数" })
        copy(
            name = "main".id,
            annotations = annotations.filterNot { it.name.text == "启动函数" }
        ) also {
            idMap[name] = "main".id
            idMap["main".id] = "main".id
        }
    else this
}