package com.hjg.kotlin.ch05

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach { println("$prefix $it") }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val errors = listOf("403 forbidden", "404 not found", "405 forbidden")
    printMessagesWithPrefix(errors, prefix = "Error: ")

    val responses = listOf("403 forbidden", "404 not found", "405 forbidden", "200 ok")
    printProblemCounts(responses)
}
