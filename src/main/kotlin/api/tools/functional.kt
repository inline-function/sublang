package api.tools

import kotlin.Error

sealed interface Optional<out T>
@JvmInline
value class Some<out T>(
    val value : T
) : Optional<T>
data object None : Optional<Nothing>
fun exception(context:Any?=null) : Nothing =
    if(context == null)
        throw Exception()
    else
        throw Exception(context.toString())
operator fun <T> Optional<T>.not() = when(this){
    is Some -> value
    None -> exception("风险式解包到了空对象")
}
val <T> Optional<T>.toNullable get() = such({null},{it})
val <T> T?.toOptional get() = this?.apply(::Some)?:None
infix fun <R> Optional<R>.or(obj:Optional<R>)=when(this){
    is Some -> this
    None -> obj
}
inline infix fun <T,U> Optional<T>.map(code : (T)->U) = when(this){
    is Some -> Some(code(value))
    None -> None
}
inline infix fun <T,U> Optional<T>.flatMap(code : (T)->Optional<U>) = when(this){
    is Some -> code(value)
    None -> None
}
val <T> T.some get() = Some(this)
inline fun <T,U> Optional<T>.such(
    none : () -> U,
    some : (T) -> U
) = when(this){
    is Some -> some(value)
    None -> none()
}
inline fun <T> nullable(code:()->T?)=
    try {
        code()?.some ?: None
    } catch (e : Exception) {
        None
    }
sealed interface Either<out L : Any,out R : Any>
@JvmInline
value class Left<out L : Any>(
    val value : L
) : Either<L,Nothing>
@JvmInline
value class Right<out R : Any>(
    val value : R
) : Either<Nothing,R>
@Deprecated("使用is语句",ReplaceWith("this is Left"))
val Either<*,*>.isLeft get() = this is Left
@Deprecated("使用is语句",ReplaceWith("this is Right"))
val Either<*,*>.isRight get() = this is Right
val <T : Any> Either<T,*>.left : T get() = (this as Left<T>).value
val <T : Any> Either<*,T>.right : T get() = (this as Right<T>).value
inline fun <T : Any,U : Any,R> Either<T,U>.such(
    left : (T) -> R,
    right : (U) -> R
) = when(this){
    is Left -> left(value)
    is Right -> right(value)
}
val <T : Any> T.left : Either<T, Nothing> get() = Left(this)
val <T : Any> T.right : Either<Nothing, T> get() = Right(this)
val Either<*,*>.value : Any get() = when(this){
    is Left  -> value
    is Right -> value
}
inline fun <L:Any,R:Any> Boolean.either(left:()->L,right:()->R)=if(this) left().left else right().right
inline fun <L:Any,R:Any,LL:Any,RR:Any> Either<L,R>.map(
    left : (L)->LL,
    right : (R)->RR
) = when(this){
    is Left -> left(value).left
    is Right -> right(value).right
}
inline fun <T:Any> result(code:()->T)=try {
    code().right
}catch (e:Throwable){
    e.left
}
fun never() : Nothing = throw Error("发生了不可能发生的情况")
val never : Nothing get() = throw Error("发生了不可能发生的情况")
fun <A,R> lambda(code : ((A)->R).(A)->R) : (A)->R {
    lateinit var fn : (A)->R
    fun f(a : A) : R = code(fn,a)
    fn = ::f
    return { code(fn,it) }
}
inline infix fun <T> T.apply(code:T.()->Unit) : T { code() ; return this }
inline infix fun <T,R> T.run(code:T.()->R) : R = code()
inline infix fun <T> T.also(code:(T)->Unit) : T { code(this) ; return this }
inline infix fun <T,R> T.let(code:(T)->R) : R = code(this)
inline infix fun <T> T?.mayApply(code:T.()->Unit) : T? { this?.apply(code) ; return this }
inline infix fun <T,R> T?.mayRun(code:T.()->R) : R? = this?.run(code)
inline infix fun <T> T?.mayAlso(code:(T)->Unit) : T? { this?.also(code) ; return this }
inline infix fun <T,R> T?.mayLet(code:(T)->R) : R? = this?.let(code)