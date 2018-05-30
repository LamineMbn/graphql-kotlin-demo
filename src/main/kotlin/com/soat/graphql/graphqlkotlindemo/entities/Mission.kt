package com.soat.graphql.graphqlkotlindemo.entities

data class Mission(
        val id: String,
        val title: String,
        val description: String? = ""
)