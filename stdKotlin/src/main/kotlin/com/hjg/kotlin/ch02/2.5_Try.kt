package com.hjg.kotlin.ch02

import java.io.BufferedReader
import java.io.StringReader

/**
 * 表示该函数可能返回一个指定类型的值，也可能返回 null。
 * 当想从error恢复，而不是抛出时，才使用try-catch-finally。
 *
 * kotlin未区分检查时异常和非检查时异常，对于reader.close()失败，其实开发者也无法做什么有意义的行为。
 * 因此开发者可以自行决定要处理哪些异常、或不处理哪些异常。
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        var line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        //kotlin没有throws子句，而Java中，close方法会抛出检查时异常IOException。
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
        //return null
        //使用return会导致整个fun在catch之后，不再执行。即不会执行println
    }

    println(number)
}

fun main(args: Array<String>) {
    var reader = BufferedReader(StringReader("123"))
    println(readNumber(reader))

    readNumber2(BufferedReader(StringReader("369")))
    readNumber2(BufferedReader(StringReader("not a digit")))
}
