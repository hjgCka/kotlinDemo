package com.hjg.kotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootDemoApp

fun main(args: Array<String>) {
    runApplication<SpringBootDemoApp>(*args)
}
