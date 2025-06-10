package com.hjg.kotlin.ch03

/**
 * 不同包需要引入才可以使用。
 */
import strings.lastChar as last
import strings.join

fun main() {
    //val c = "Kotlin".lastChar()
    val c = "Kotlin".last()
    println(c)

    println(listOf("one", "two", "three", "four").join(" "))
}

