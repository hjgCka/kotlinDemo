package com.hjg.kotlin.ch02

fun max(a:Int, b:Int): Int {
    return if (a > b) a else b
}

fun max2(a:Int, b:Int): Int = if (a > b) a else b

fun max3(a:Int, b:Int) = if (a>b) a else b

/**
 * args: Array<String>可以省略
 */
fun main() {
    println(max(2, 3))
}
