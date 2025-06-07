package com.hjg.kotlin.ch02

import java.io.BufferedReader
import java.io.StringReader

/**
 * 表示该函数可能返回一个指定类型的值，也可能返回 null
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        var line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        //使用return会导致整个fun在catch之后，不再执行。即不会执行println
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    var reader = BufferedReader(StringReader("123"))
    println(readNumber(reader))

    readNumber2(BufferedReader(StringReader("369")))
    readNumber2(BufferedReader(StringReader("not a digit")))
}
