package com.hjg.kotlin.ch03

class User(val id: Int, val name: String, val address: String)

/**
 * 这是一个扩展的function，可以访问内部的字段。
 */
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    // save user to the database
}

fun main() {
    saveUser(User(1, "", ""))
}
