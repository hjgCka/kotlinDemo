package com.hjg.kotlin.ch04

class MyClass {
    companion object {
        private val code = 23
        fun callMe() {
            println("Companion object called, code = $code")
        }
    }
}

fun main() {
    MyClass.callMe()
}
