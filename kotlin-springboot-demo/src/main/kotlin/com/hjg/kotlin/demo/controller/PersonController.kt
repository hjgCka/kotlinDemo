package com.hjg.kotlin.demo.controller

import com.hjg.kotlin.demo.entity.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class PersonController {

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long): Person {
        val person = Person()
        person.id = userId
        person.age = 22
        person.name = "Jack"
        return person
    }
}
