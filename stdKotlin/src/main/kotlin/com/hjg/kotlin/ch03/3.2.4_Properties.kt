package com.hjg.kotlin.ch03

/**
 * 属性也可以定义在文件的顶层，这样的属性会被编译为static域。
 * const val会被编译为 public static final。
 */
var opCount = 0
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++
    println("opCount:$opCount")
}
