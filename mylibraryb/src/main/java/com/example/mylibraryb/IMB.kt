package com.example.mylibraryb

import com.example.mylibrarya.ThisIsA
import com.google.gson.Gson

class IMB {
    fun show() {
        println("---------------")
        val a = ThisIsA()
        println("name: ${a.name()}")
        val g = Gson()

        val user = User("张三")
        val copy = user.copy()
        println(user == copy)
        println(user === copy)
    }
}