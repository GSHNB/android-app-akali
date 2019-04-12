package com.nsxz.akali.bean

/**
 * Created by gaoshun on 2019/4/2.
 */
open class User {


    init {
        val user=User()
        user.copp(age = 2)
    }

    private open class A(aa:Int)

    class B

    open fun copp(name:String="",age:Int)="$name,$age"

}