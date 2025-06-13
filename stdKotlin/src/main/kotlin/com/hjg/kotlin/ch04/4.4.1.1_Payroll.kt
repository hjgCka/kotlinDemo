package com.hjg.kotlin.ch04

import java.io.File

object Payroll {
    val allEmployees = mutableListOf<Person>()

    fun calculateSalary() {
        for (employee in allEmployees) {
            /***/
        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main() {
    Payroll.allEmployees.add(Person("Jack"))
    Payroll.calculateSalary()

    var files = listOf(File("/c"), File("/d"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}
