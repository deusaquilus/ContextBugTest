package org.deusaquilus

import kotlin.coroutines.startCoroutine

class InContext
class MyReciever<T> {
    public suspend fun <R> MyOutput<R>.innerFun(): R = TODO()
}
class MyOutput<T>
interface Bound

class PairLite<A, B>

public fun <T: Bound> select(block: suspend context(InContext) MyReciever<T>.() -> T): MyOutput<T> {
    //val comboBlock: suspend MyReciever<T>.() -> T = { block(InContext(), this) }
    return TODO()
}

class A
class B

public fun use() {
    val out:  MyOutput<PairLite<A, B>> = TODO()

    val out1 =
        select {
            val x:  PairLite<A, B> = out.innerFun()
            TODO()
        }
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}