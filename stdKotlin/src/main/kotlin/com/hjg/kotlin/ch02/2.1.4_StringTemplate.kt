package com.hjg.kotlin.ch02

fun main(args: Array<String>) {
    // 简单变量访问
    val name = "Jack"
    println("Hello, $name!")

    // 表达式访问
    val a = 3
    val b = 4
    println("result is ${a + b}")

    //双引号中使用双引号
    println("bigger is ${if (a>b) "val a" else "val b"}")

    val input = readln()
    val inputStr = if (input.isNotBlank()) input else "Kotlin"
    println("hello, $inputStr")
}
