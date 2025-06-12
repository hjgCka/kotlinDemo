package com.hjg.kotlin.ch04

/**
 * 这是主构造器的完整写法，如果不需要在constructor上加上 注解 和 访问修饰符，constructor可以省略。
 * @JvmOverloads注解 或 private访问修饰符。
 */
class Student constructor(_nickname: String) {
    val nickname: String

    /**
     * 这个init块可以省略，因为它可以与声明nickname属性结合
     */
    init {
        nickname = _nickname
    }
}

/**
 * 这与上面是等价的。
 */
class Student2 (_nickname: String) {
    val nickname = _nickname
}

/**
 * 如果属性由对应的构造器参数初始化，那么可以简化为在构造器参数前加上val。
 */
class Student3(val nickname: String)

/**
 * 为构造器参数nickname 和 isSubscribed 生成对应的属性
 * 并为构造器参数isSubscribed 提供默认值
 */
class User(
    val nickname: String,
    val isSubscribed: Boolean = true
)

open class Person(val nickname: String)

/**
 * 如果父类的构造器需要参数，子类的主构造器也需要初始化它们。
 * 这个用法表示了：1，继承关系；2，生成的构造函数会先调用父类的构造函数。
 */
class SocialPerson(nickname: String) : Person(nickname)

/**
 * 这会生成一个无参的默认构造器
 */
open class Button421

/**
 * 必须要用Button421()，来初始化父类。
 * 不加()的是接口。
 */
class RadioButton421 : Button421()

class Secret private constructor(private val agentName: String)

fun main() {
    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", false)
    println(bob.isSubscribed)

    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)

    val dave = User(nickname = "Dave", isSubscribed = false)
    println(dave.isSubscribed)

    val sp = SocialPerson("Jack")
    println(sp.nickname)
}
