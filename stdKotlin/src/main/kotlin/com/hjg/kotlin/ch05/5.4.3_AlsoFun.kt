package com.hjg.kotlin.ch05

//also 与 apply 几乎一样，除了可以访问receiver对象，通过it。
fun main() {
    val fruits = listOf("Apple", "Banana", "Pear", "Grape")
    val uppercaseFruits = mutableListOf<String>()
    val reversedLongFruits = fruits.map { it.uppercase() }
        .also { uppercaseFruits.addAll(it) }
        .filter { it.length > 5 }
        .also { println(it) }
        .reversed()

    println(fruits)
    println(uppercaseFruits)
    println(reversedLongFruits)
}
