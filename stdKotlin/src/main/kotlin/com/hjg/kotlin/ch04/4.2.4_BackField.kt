package com.hjg.kotlin.ch04.BackField

class Person(var birthYear: Int) {
    var ageIn2050
        get() = 2050 - birthYear
        set(value) {
            birthYear = 2050 - value
        }
}

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                    Address was changed for $name:
                    "$field" -> "$value".
                """.trimIndent()
            )
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "1023-LOS Angel"

    val person = Person(2020)
    println(person.ageIn2050)
    person.ageIn2050 = 50
    println(person.birthYear)
}
