package com.hjg.kotlin.ch04.OverrideProperty

/**
 * interface中的属性和方法（不带默认实现）都是abstract，因此都相当于带上了open。
 * 带默认实现的方法不是abstract，实现类可以不重写。
 * 带默认实现的方法，可以声明为private。
 */
interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class SocialUser(val accountId: Int) : User {
    override val nickname = getNameFromSocialNetwork(accountId)
}

fun getNameFromSocialNetwork(accountId: Int) = "kodee$accountId"

fun main() {
    println(PrivateUser("kodee").nickname)

    println(SubscribingUser("test@kotlin.org").nickname)

    println(SocialUser(123).nickname)
}

