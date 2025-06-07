package com.hjg.kotlin.ch02

import java.util.Random

/**
 * 这个类只有这个 2个参数的构造函数，可以省略{}，这个里面可以定义方法 或 自定义getter。
 * 默认修饰符是Public
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean get() = height == width
    //可以省略 : Boolean
    //val isSquare get() = height == width
}

fun createRandomRectangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    var rectangle = Rectangle(2, 3)
    println(rectangle.isSquare)

    rectangle = createRandomRectangle()
    println("height = ${rectangle.height}, width = ${rectangle.width}, isSquare = ${rectangle.isSquare}")
}
