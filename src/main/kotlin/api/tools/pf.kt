package api.tools
//匹配异常
object MatchException : RuntimeException("参数不在偏函数范围") {
    private fun readResolve() : Any = MatchException
    operator fun invoke() : Nothing = throw this
}
//偏函数
@JvmInline
value class PartialFunction<in P,out R>(
    private val func : (P)->R
) : (P)->R{
    override infix operator fun invoke(param:P) : R = func(param)
}
//创建偏函数
fun <P,R> partial(bool:(P)->Boolean = {true},block:(P)->R) =
    PartialFunction<P,R>{
        if(bool(it))
            block(it)
        else
            MatchException()
    }
//融合偏函数
infix fun <P,R> PartialFunction<P,R>.or(other:PartialFunction<P,R>)=
    PartialFunction<P,R>{
        try{
            this(it)
        }catch(_:MatchException){
            other(it)
        }
    }