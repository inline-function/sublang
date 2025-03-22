@file:Suppress("FunctionName","NestedLambdaShadowedImplicitParameter")

package api.translators.kotlin.apts

import api.classes.Checker.Information
import api.classes.Checker.Message
import api.data.ID
import api.data.id
import api.tools.also
import api.tools.such
import api.translators.kotlin.KTFunctionApt

fun JvmFunction(idMap : MutableMap<ID,ID>,handler : (Information)->Unit) = KTFunctionApt {
    val ann = annotations.find { it.name.text == "JVM函数"}?.also {
        it.value?.such(
            left = {it.value.toString().id},
            right = {it.first().id}
        )?.also {
            idMap[name] = it
            idMap[it] = it
        }?:handler(Information(
            errors = listOf(Message(
                line = line,
                row = row,
                module = module,
                log = "JVM函数注解必须有一个用于指定对应JVM函数名称的参数"
            ))
        ))
    }
    if (ann != null)
        null
    else
        this
}