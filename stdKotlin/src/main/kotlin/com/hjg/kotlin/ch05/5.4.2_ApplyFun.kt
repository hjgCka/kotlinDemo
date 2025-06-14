package com.hjg.kotlin.ch05.applyFun

/**
 * 除了直接使用apply，其它的buildString/buildList/buildSet
 * buildMap 等方法，都是receiver + lambda表达式。
 */
fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main() {
    println(alphabet())
}
