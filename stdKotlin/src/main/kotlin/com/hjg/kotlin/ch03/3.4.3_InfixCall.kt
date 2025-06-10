package com.hjg.kotlin.ch03

val map = mapOf(1 to "one", 2 to "two", 3 to "three")
// 1 to "one" 与 1.to("one")，是相等的。
// 在目标对象和参数之间，放置to。这样要求只能有一个参数才行。

fun main() {
    //这里就用到了解构声明
    for((key, value) in map) {
        println("${key.javaClass} -> ${value.javaClass}")
    }

    //中缀调用 和 解构声明，右侧是一个Pair实例
    val (number, name) = 1 to "one"
    println("$number -> $name")
}
