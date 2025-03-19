@file:Suppress("UNCHECKED_CAST")

package api.translators

import api.data.ProjectTree
import kotlin.reflect.KClass

//翻译器
@JvmInline
value class Translator(
    //翻译逻辑
    val logic : MutableMap<KClass<*>,Any.()->Any> = mutableMapOf()
)
//翻译逻辑
inline fun <reified T : Any,U> Translator.on(noinline code:T.()->U) = logic.put(T::class,code as Any.()->Any)
//翻译
fun <T> Translator.translate(tree:ProjectTree) : T = logic[ProjectTree::class]!!(tree) as T
//调用翻译
inline fun <reified T : Any,U : Any> Translator.call(tree:T) : U = logic[T::class]?.invoke(tree).apply {
    this ?: throw Exception("找不到翻译器'${T::class.simpleName}'") } as U
//翻译dsl
fun <T> ProjectTree.translate(code:Translator.()->Unit) = Translator().apply(code).translate<T>(this)