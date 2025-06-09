package com.hjg.kotlin.ch02

enum class Color(val r: Int, val g: Int, val b: Int) {
    /**
     * 这里是唯一要求使用 ; 的地方，用分号将枚举常量列表 和 方法定义区分。
     * 如果没有定义方法，不用加上分号。
     */
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    INDIGO(75, 0, 130), BLUE(0, 0, 255),
    VIOLET(238, 130, 238);

    val rgb = (r * 256 + g) * 256 + b
    //enum 重写了toString()
    fun printColor() = println("$this is $rgb")
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

//无参数版本的when
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println("r = ${Color.RED.r}, rgb = ${Color.RED.rgb}")
    Color.RED.printColor()

    println(getMnemonic(Color.RED))
    println(getWarmth(Color.BLUE))

    println(mix(Color.RED, Color.YELLOW))
}
