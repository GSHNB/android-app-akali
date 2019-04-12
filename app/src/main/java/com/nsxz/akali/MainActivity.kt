package com.nsxz.akali

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsxz.akali.bean.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHello.text = sum(1, 2).toString()

        printSum(1, 2)

        object : User(),IUser{

            override fun copp(name: String, age: Int): String {
                return super<User>.copp(name, age)
            }
        }

        object {
            val x:Int=1
            val y:Int=2
            fun xy(){

            }
        }

    }


    interface IUser{
        fun copp(name: String, age: Int): String
    }

    fun sum(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Int {
        println("$a and $b is ${a + b}")
        val c = if (a > 1) 1 else 2
        val list = mutableListOf<Any>(1)


        for ((index, value) in list.withIndex()) {
            println("$index,$value")
        }

        for (any in list.indices) {

        }

        var d:Any=1
        var e=when(d){

            1-> {println(1)
                2}

            is String-> println(a)

            in 1..10 -> println()

            1,2,3-> println()

            else-> println()



        }

        when{
            "a" in list-> println()
        }

        list.filter{ it==1 }.sortedBy { it==0 }.map { it.toString() }.forEach { println(it) }

        val str="""fsalkdjfasljfla
            |;sj""".trimMargin()

        mapOf<String,Int>().forEach{ println("")}

        return c
    }


}
