package com.hjg.kotlin.ch02

import java.util.TreeMap

fun iteratorList() {
    var list = ArrayList<String>()
    list.add("1")
    list.add("2")
    list.add("3")

    for(item in list) {
        println(item)
    }

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun iteratorMap() {
    var binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        binaryReps[c] = Integer.toBinaryString(c.code)
    }

    for( (letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun main(args: Array<String>) {
    iteratorList()
    iteratorMap()
}
