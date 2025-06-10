package com.hjg.kotlin.ch03

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }

fun main() {
    println("My text".lastChar)

    val sb = StringBuilder("kotlin?")
    println(sb.lastChar)

    sb.lastChar = '!'
    println(sb)
}
