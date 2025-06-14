package com.hjg.kotlin.ch05

data class Person(val name: String, val age: Int)

fun sendEmail(person: Person, message: String) {
    println("sending email to ${person.name}, message: $message")
}

fun salute() = println("Salute")

fun main() {
    val persons = listOf(Person("Alice", 29), Person("Bob", 31))
    //val oldest = persons.maxByOrNull { it.age }

    //这个lambda表达式等价于 {p:Person -> p.age}
    val oldest = persons.maxByOrNull(Person::age)
    println(oldest)

    run(::salute)

    val action1 = {person: Person, message: String -> sendEmail(person, message) }
    val action2 = ::sendEmail
    action1(Person("Alice", 29), "hello")
    action2(Person("Jack", 29), "hello")

    // constructor reference
    val createPerson = ::Person
    val p = createPerson("James", 29)
    println(p)
}
