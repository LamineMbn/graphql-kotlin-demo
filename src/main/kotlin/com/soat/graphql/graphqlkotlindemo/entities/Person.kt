package com.soat.graphql.graphqlkotlindemo.entities

data class Person(
        val id: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val age: Int,
        val active: Boolean,
        val mission: Mission? = null
)