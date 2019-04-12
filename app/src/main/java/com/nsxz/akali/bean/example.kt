package com.nsxz.akali.bean

/**
 * Created by gaoshun on 2019/4/2.
 */
private fun foo(int: IntArray) {}

interface Base{
    fun print()
}

class BaseImpl(val x:Int):Base{
    override fun print() {
        println(x)
    }
}

class Derived(b:Base):Base by b

fun main(vararg int: Int){
    Derived(BaseImpl(1)).print()
//    ::foo.invoke()

}

abstract class A{
    abstract fun a()
}


val lazyValue:String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println()
    "hello"}

val click:(Int,Int)->(Int,Int)->Unit=fun (a:Int,b:Int):(a:Int,b:Int)->Unit=fun (a:Int,b:Int)=Unit

