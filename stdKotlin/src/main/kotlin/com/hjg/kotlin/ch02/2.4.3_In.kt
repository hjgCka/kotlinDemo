package com.hjg.kotlin.ch02

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0' .. '9' -> "It's a digit!"
    in 'a' .. 'z', in 'A' .. 'Z' -> "It's a letter!"
    else -> "I don't know..."
}

/**
 * 如果队列中的元素实现了Comparable接口，可以用in判断是否属于队列。
 * 但是我们无法枚举这个数列中的值，比如我们无法枚举 "java" .. "scala"这个数列所有的值。
 * 但是我们能判断kotlin是否属于队列，因为就是用比较接口判断值是否在这个区间。
 */
fun main(args: Array<String>) {
    println(isLetter('Q'))
    println(isNotDigit('I'))
    println(recognize('Q'))
}
