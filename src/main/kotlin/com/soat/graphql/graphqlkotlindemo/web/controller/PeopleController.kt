package com.soat.graphql.graphqlkotlindemo.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/people")
class PeopleController {

    @GetMapping
    fun ping(): String {
        return "It's working"
    }
}