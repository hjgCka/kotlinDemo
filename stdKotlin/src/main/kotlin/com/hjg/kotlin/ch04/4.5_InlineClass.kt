package com.hjg.kotlin.ch04

interface PrettyPrintable {
    fun prettyPrint()
}

@JvmInline
value class UsdCent(val amount: Int) : PrettyPrintable {
    val salesTax get() = amount * 0.06
    override fun prettyPrint() = println("${amount}$")
}

fun main() {
    val expense = UsdCent(100)
    println(expense.salesTax)

    expense.prettyPrint()
}
