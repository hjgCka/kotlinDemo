package com.hjg.kotlin.ch04.dataClass

/**
 * 主构造器中的属性，才会参与equals检查和hashcode计算
 */
data class Customer(val name: String, val postalCode: Int)

fun main() {
    val c1 = Customer("Jack", 11332)
    val c2 = Customer("John", 22934)
    val c3 = Customer("Jack", 11332)

    println(c1 == c2)
    println(c1 == c3)

    var c4 = c3.copy()
    println(c4)
}
