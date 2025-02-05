package api.tools

//结果密封接口
sealed interface Result<out T>
//正常结果值类
@JvmInline
value class Okay<out T>(
    val value : T
) : Result<T>
//错误结果对象
data object Error : Result<Nothing>
//结果是否为正常
val Result<*>.okay get() = this is Okay
//结果是否为错误
val Result<*>.error get() = this is Error
//非错断言:result()
operator fun <T> Result<T>.invoke() = when(this){
    is Okay -> value
    is Error -> throw Exception("非错断言失败,废物哈基人")
}
//非错断言:!result
operator fun <T> Result<T>.not() = this()
//非错断言:result.value
val <T> Result<T>.value get() = this()
//包装为Okay
val <T> T.okay get() = Okay(this)
//函数式风格分类处理
inline fun <T,U> Result<T>.such(
    error : () -> U,
    okay : (T) -> U
) = when(this){
    is Okay -> okay(value)
    is Error -> error()
}
//柯里化
operator fun <T,U> (()->T).invoke(code : (U)->T) : Pair<()->T,(U)->T> = this to code
//柯里化风格分类处理
infix fun <T,U> Result<T>.such(code:Pair<()->U,(T)->U>) = when(this){
    is Okay -> code.second(value)
    is Error -> code.first()
}
//真柯里化
fun <T,U> Result<T>.such(
    error : () -> U
) = {okay : (T) -> U ->
    when (this) {
        is Okay -> okay(value)
        is Error -> error()
    }
}
//要么接口
sealed interface Either<out L : Any,out R : Any>
//要么左边值类
@JvmInline
value class Left<out L : Any>(
    val value : L
) : Either<L,Nothing>
//要么右边值类
@JvmInline
value class Right<out R : Any>(
    val value : R
) : Either<Nothing,R>
//是左值
val Either<*,*>.isLeft get() = this is Left
//是右值
val Either<*,*>.isRight get() = this is Right
//断言左值
val <T : Any> Either<T,*>.left : T get() = (this as Left<T>).value
//断言右值
val <T : Any> Either<*,T>.right : T get() = (this as Right<T>).value
//函数式处理
inline fun <T : Any,U : Any,R> Either<T,U>.such(
    left : (T) -> R,
    right : (U) -> R
) = when(this){
    is Left -> left(value)
    is Right -> right(value)
}
//左值
val <T : Any> T.left : Either<T, Nothing> get() = Left(this)
//右值
val <T : Any> T.right : Either<Nothing, T> get() = Right(this)
//安全拆包
val Either<*,*>.value : Any get() = when(this){
    is Left  -> value
    is Right -> value
}