package com.hjg.kotlin.ch02

interface Expr
//Num类实现了 Expr接口
class Num(val value: Int) : Expr
//Sum类实现了 Expr接口
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int {
    if (e is Num) {
        // 这里没用到smart cast，冗余了一行代码
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        // 这里用到了smart cast
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

// kotlin中if是一个表达式，意味着可以用在expression body
fun eval2(e: Expr) : Int =
    if (e is Num) {
        // 这里没用到smart cast，冗余了一行代码
        val n = e as Num
        n.value
    } else if (e is Sum) {
        // 这里用到了smart cast
        eval2(e.right) + eval2(e.left)
    } else throw IllegalArgumentException("Unknown expression")

fun eval3(e: Expr) : Int =
    when(e) {
        is Num -> {
            println("Num: ${e.value}")
            e.value
        }
        is Sum -> {
            println("Sum: left=${e.left}, right=${e.right}")
            eval3(e.left) + eval3(e.right)
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    val result = eval(Sum(Sum(Num(1), Num(2)), Num(3)))
    println(result)
}
