package api.tools

import java.io.FileInputStream
import java.io.FileOutputStream

val readFile = io1{path:String->
    FileInputStream(path).use {
        it.readBytes().decodeToString()
    }
}
val writeFile = io2{path:String,content:String->
    FileOutputStream(path).use {
        it.write(content.encodeToByteArray())
    }
}
val appendFile = io2{path:String,content:String->
    FileOutputStream(path,true).use {
        it.write(content.encodeToByteArray())
    }
}
val printLine = io1{content:String->
    println(content)
}
@JvmInline value class IOMonad<out T>(val func : T)
typealias IO<T> = IOMonad<()->T>
typealias IO1<T,A> = IOMonad<(A)->T>
typealias IO2<T,A,B> = IOMonad<(A,B)->T>
fun allDo(vararg ioms:Any)= io{ ioms.forEach { when(it){
    is IOMonad<*> -> (it.func as ()->Any?)()
    else -> (it as ()->Any?)()
} } }
fun <R> io(block : ()->R) = IOMonad(block)
fun <R,A> io1(block : (A)->R) = IOMonad(block)
fun <R,A,B> io2(block : (A,B)->R) = IOMonad(block)
operator fun <T> T.unaryPlus() = IOMonad{this}
fun <T> just(value:T) = IOMonad{value}
fun <T> IOMonad<()->T>.runNow() = func()
@JvmName("invoke0") operator fun <A,T> IOMonad<(A)->T>.invoke(a:A) = io{ func(a) }
@JvmName("invoke1") operator fun <A,B,T> IOMonad<(A,B)->T>.invoke(a:A) = io1{b:B-> func(a,b) }
@JvmName("invoke2") operator fun <A,B,T> IOMonad<(A,B)->T>.invoke(a:A,b:B) = io{ func(a,b) }
@JvmName("apply0") infix fun <A,R> IOMonad<(A)->R>.app(a:A) = io{func(a)}
@JvmName("apply1") infix fun <A,B,R> IOMonad<(A,B)->R>.app(a:A) = io1{b:B->func(a,b)}
infix fun <R> IOMonad<()->Any?>.and(next:IOMonad<()->R>)=io{func();next.func()}
infix fun <R> IOMonad<()->Any?>.and(next:()->R)=io{func();next()}
operator fun <R> IOMonad<()->Any?>.plus(next:IOMonad<()->R>)=io{func();next.func()}
operator fun <R> IOMonad<()->Any?>.plus(next:()->R)=io{func();next()}
infix fun <L,R> IOMonad<()->L>.map(next : IOMonad<(L)->R>)=io{next.func(func())}
infix fun <L,R> IOMonad<()->L>.map(next : (L)->R)=io{next(func())}
@JvmName("bind0") infix fun <L,R> IOMonad<()->L>.bind(next:(L)->IOMonad<()->R>)=io{next(func()).func()}
@JvmName("bind1") infix fun <L,R> IOMonad<()->L>.bind(next:(L)->()->R)=io{next(func())()}
infix fun <L,R> IOMonad<()->L>.give(next:IOMonad<(L)->R>)=io{next(func())}
infix fun <L,R> IOMonad<()->L>.give(next:(L)->R)=io{next(func())}
inline infix fun <R,reified E:Throwable> IOMonad<()->R>.catch(next : IOMonad<(E)->R>)=io{
    try{
        func()
    }catch(e:Throwable){
        if (e is E)
            next.func(e)
        else
            throw e
    }
}
inline infix fun <R,reified E:Throwable> IOMonad<()->R>.catch(crossinline next : (E)->R)=io{
    try{
        func()
    }catch(e:Throwable){
        if (e is E)
            next(e)
        else
            throw e
    }
}
fun <R:Any> want(iom:IOMonad<()->R>)=io{
    try {
        iom.func.right
    }catch (e:Throwable){
        e.left
    }
}
fun <R:Any> want(iom:()->R)=io{
    try {
        iom().right
    }catch (e:Throwable){
        e.left
    }
}