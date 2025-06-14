package com.hjg.kotlin.ch05

fun main() {
    val sum = {x:Int, y:Int -> x + y}
    println(sum(5, 6))

    //{ println(42) }()
    run { println(42) }
}
