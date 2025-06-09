package com.hjg.kotlin.ch03

fun main() {
    //这些集合接口默认都是只读的
    val set = setOf(1, 7, 53)
    val list = listOf(1, 7, 53)
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list.last())
    println(list.shuffled())
    println(set.sum())
}
