package com.hjg.kotlin.ch03

import org.intellij.lang.annotations.Language

fun main() {
    @Language("JSON")
    val expectedObject = """
        {
          "name": "Jack",
          "age": 22,
          "home": "Munich"
        }
    """.trimIndent()

    println(expectedObject)
}
