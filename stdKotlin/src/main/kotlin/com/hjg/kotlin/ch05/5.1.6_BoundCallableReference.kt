package com.hjg.kotlin.ch05

fun main() {
    val seb = Person("Sebastian", 29)
    //返回给定对象的age
    val personsAgeFunction = Person::age
    println(personsAgeFunction(seb))

    //返回特定对象的age，相当于 {seb.age}。
    //绑定到了seb这个对象上。
    val sebAgeFunction = seb::age
    println(sebAgeFunction())
}
