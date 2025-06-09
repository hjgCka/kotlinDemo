package com.hjg.kotlin.ch03

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
) : String {
    val result = StringBuilder(prefix)

    for( (index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

/**
 * 通过指定参数的默认值，可以避免创建 重载的方法
 */
fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)

    for( (index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    println(list)
    println(joinToString(list, ";", "(", ")"))

    //命名参数，当为所有参数进行命名时，你可以改变它们的顺序
    println(
        joinToString(postfix = ".", separator = " ", collection = list, prefix = " ")
    )

    println(joinToString2(list))
}
