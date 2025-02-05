@file:Suppress("UNCHECKED_CAST","unused")

package api.tools

import org.jetbrains.annotations.TestOnly

//try部分
inline fun <reified T:Any?> deal(crossinline code1:()->T?):(Throwable.()->T?)->T? = {
    try {
        code1()
    }catch (e:Throwable){
        e.it()
    }
}
//catch部分
inline infix fun <reified T:Any?> ((Throwable.()->T?)->T?).with(noinline code:Throwable.()->T?) : T?{
    return this(code)
}
//没有catch的try语句
inline fun <T:Any?> pass(code1:()->T){
    try {
        code1()
    }catch (_:Throwable){}
}
//后缀if语句
inline infix fun Boolean.then(code:()->Unit){
    if (this) {
        code()
    }
}
//打印
@JvmName("printSomething")
fun <T:Any?> T.print(msg : Any? = null) : T = this.apply{
    println((msg?.toString()?.plus(" : ") ?: "")+(this?.toString() ?: "null"))
}
//打印
val <T:Any?> T.print : T get() = this.print()
//多打印
@JvmName("printLotsOfSomething")
fun <T:Any?> print(vararg msg : T?) : T =
    msg.onEach {
        it?.apply { this.print }
        ?: "null".print
    }.last() as T
//带有测试目的的打印
@Suppress("NOTHING_TO_INLINE")
@JvmName("testPrintSomething")
@TestOnly
inline fun <T:Any?> T.test(msg : Any? = null) : T = this.print(msg)
val <T:Any?> T.test : T
    @TestOnly get() = this.test()
@JvmName("testLotsOfSomething")
@TestOnly
fun <T:Any?> test(vararg msg : T?) : T =
    msg.onEach {
        it?.apply { this.test }
        ?: "null".test
    }.last() as T
//非空运行
@Deprecated(
    message = "建议使用 obj?.apply { code() } 代替",
    replaceWith = ReplaceWith("this?.apply { code() }")
)
inline infix fun Any?.notNull(code:()->Unit){
    if (this != null) {
        code()
    }
}
//函数式类型转换
inline fun <reified T> Any?.to() : T = this as T