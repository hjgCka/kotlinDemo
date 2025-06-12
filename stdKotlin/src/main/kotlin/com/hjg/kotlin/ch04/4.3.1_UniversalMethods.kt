package com.hjg.kotlin.ch04

class Customer(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Customer) {
            return false
        } else {
            return name == other.name && postalCode == other.postalCode
        }
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    override fun toString() = "Customer(name='$name', postalCode='$postalCode')"
}

fun main() {
    val customer1 = Customer("Jack", 123);
    val customer2 = Customer("Jack", 123);
    println(customer1 == customer2)
}
