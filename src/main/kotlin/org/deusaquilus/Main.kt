package org.deusaquilus

class InContext
class MyReciever {
    public suspend fun MyOutput.innerFun(): Int = 123
}
class MyOutput

public fun caller(block: suspend context(InContext) MyReciever.() -> Int): MyOutput = MyOutput()



fun main(args: Array<String>) {
    val out1 =
        caller {
            MyOutput().innerFun()
        }
}