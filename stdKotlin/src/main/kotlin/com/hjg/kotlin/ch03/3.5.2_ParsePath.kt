package com.hjg.kotlin.ch03

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("dir = $directory, fileName= $fileName, ext = $extension")
}

//使用3引号字符串时，不需要使用转义字符

fun main() {
    parsePath("/home/london/kotlin-ch03/hello.txt")
}
