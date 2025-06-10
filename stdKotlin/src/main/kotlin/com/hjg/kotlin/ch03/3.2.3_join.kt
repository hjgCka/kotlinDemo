@file:JvmName("StringFunctions")

package strings

/**
 * 不用创建无意义的类（仅用作工具类，包含几个静态方法），减少了一个嵌套层级。
 * 会被编译为，一个类的静态方法。
 */
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

fun <T> Collection<T>.joinToString2(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)

    for( (index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
) = joinToString2(separator, prefix, postfix)

