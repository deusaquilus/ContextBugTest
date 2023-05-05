package org.deusaquilus

import kotlin.coroutines.startCoroutine

class InContext
class MyReciever {
    public suspend fun <R> MyOutput<R>.innerFun(): R = TODO()
}
class MyOutput<T>

public fun <T> select(block: suspend context(InContext) MyReciever.() -> T): MyOutput<T> = TODO()

class A

public fun use() {
    val out:  MyOutput<A> = TODO()

    val out1 =
        select {
            val x:  A = out.innerFun()
            TODO()
        }
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}