package com.soat.graphql.graphqlkotlindemo.dao

import com.soat.graphql.graphqlkotlindemo.entities.Employer
import com.soat.graphql.graphqlkotlindemo.entities.Mission
import org.springframework.stereotype.Component

@Component
class EmployerDao {

    private val clients: List<Employer> = mutableListOf(
            Employer(id = "1", name = "Accor Hôtel"),
            Employer(id = "2", name = "SG"),
            Employer(id = "3", name = "Nokia")
    )

    fun retrieveClientById(id: String): Employer = clients.first { client -> client.id == id }

    fun retrieveAllClients(): List<Employer> = clients
}