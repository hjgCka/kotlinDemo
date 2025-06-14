package com.hjg.kotlin.ch05

fun interface IntCondition {
    fun check(i: Int) : Boolean
    fun checkString(s: String) = check(s.toInt())
    fun checkChar(c: Char) = check(c.code)
}

fun checkCondition(i: Int, condition: IntCondition): Boolean {
    return condition.check(i)
}

fun main() {
    val isOdd = IntCondition { it % 2 == 0 }
    println(isOdd.check(1))

    println(isOdd.checkString("2"))

    println(isOdd.checkChar('3'))

    checkCondition(1) {it % 2 != 0}
    val isEven : (Int) -> Boolean = { it % 2 != 0 }
    checkCondition(1, isEven)
}
