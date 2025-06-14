package com.hjg.kotlin.ch05

/**
 * 返回的是执行的结果（最后一行语句作为表达式的返回），而不是receiver。
 */
fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main() {
    println(alphabet())
}
