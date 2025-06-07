package com.hjg.kotlin.ch02

fun max(a:Int, b:Int): Int {
    return if (a > b) a else b
}

fun max2(a:Int, b:Int) = if (a>b) a else b

fun main() {
    println(max(2, 3))
}
