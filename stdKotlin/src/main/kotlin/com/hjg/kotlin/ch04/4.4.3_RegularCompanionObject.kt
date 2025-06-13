package com.hjg.kotlin.ch04.regularCompanionObject

/**
 * 伴生对象只能有一个，可以对其进行命名，默认名称为Companion。
 */
class Person(val name: String) {
    companion object Loader {
        fun fromJSON(json: String): Person = Person("Jack")
    }
}

fun Person.Loader.serializeObject(person: Person): String {
    return "this is json string"
}

fun main() {
    val person1 = Person.fromJSON("{\"name\":\"Jack\"}")
    val person2 = Person.Loader.fromJSON("{\"name\":\"Jack\"}")

    println(Person.serializeObject(person1))
}
