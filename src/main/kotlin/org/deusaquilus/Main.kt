package org.deusaquilus

class InContext
class MyReciever {
    // Add context here and compile-time issue goes away:
    //context(InContext)
    public suspend fun MyOutput.innerFun(): Int = 123
}
class MyOutput

public fun caller(block: suspend context(InContext) MyReciever.() -> Int): MyOutput = MyOutput()



fun main(args: Array<String>) {
    val out1 = caller {  MyOutput().innerFun() }
    // Also does not work:
    //val out2 = with (InContext()) { caller {  MyOutput().innerFun() } }
    // Also does not work:
    //val out3 = caller { with (InContext()) { MyOutput().innerFun() } }
}