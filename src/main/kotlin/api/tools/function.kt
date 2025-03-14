@file:Suppress("UNCHECKED_CAST","unused")

package api.tools

import org.jetbrains.annotations.TestOnly
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
//后缀if
@Deprecated(
    message = "建议使用 if(obj){doing()} 代替",
    replaceWith = ReplaceWith("if(this){ code() }")
)
inline infix fun Boolean.thenDo(code:()->Unit){
    if (this) {
        code()
    }
}
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
//字符串重复指定次数
operator fun String.times(times : Int) : String{
    var text = ""
    for (i in 0 until times) {
        text += this
    }
    return text
}
//合并列表为字典
inline fun <L,R,LL,RR,LV,RV> Pair<List<L>,List<R>>.merge(
    leftToKey:(L)->LL = {it as LL},
    rightToValue:(R)->RR = {it as RR},
    keyAndValue:(LL,RR)->Pair<LV,RV> = {left,right->left as LV to right as RV}
)=first.mapIndexed{index,l->keyAndValue(leftToKey(l),rightToValue(second[index]))}.toMap()
//干预非空
inline infix fun <T> Boolean.then(code:()->T) = if(this) code() else null
//双判空行
@Deprecated("建议替换成更具kotlin风格的if语句",ReplaceWith("if(!this){then()}else{or()}"))
inline fun <U,T> U?.isNullThen(then:()->T,or:U.()->T)=if(this==null) then() else this.or()
//对象是否为空
val Any?.none : Boolean get() = this == null
operator fun Any?.not() = this == null
//关于空的偏函数责任链
fun <T> List<*>.buildChain(
    vararg func : ()->T
):T=func[indexOf(find{it!=null})]()