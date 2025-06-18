package com.hjg.kotlin.demo.controller

import com.hjg.kotlin.demo.entity.Person
import com.hjg.util.PlainUtil
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class PersonController {

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long): Person {
        val plainUtil = PlainUtil()
        val dateStr = plainUtil.getDateFormat();

        val person = Person()
        person.id = userId
        person.age = 22
        person.name = dateStr
        return person
    }
}
