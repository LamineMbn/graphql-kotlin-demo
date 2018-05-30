package com.soat.graphql.graphqlkotlindemo.dao

import com.soat.graphql.graphqlkotlindemo.entities.Mission
import org.springframework.stereotype.Component

@Component
class MissionDao(private val employerDao: EmployerDao) {

    private val missions = mutableListOf(
            Mission(id = "1", title = "Mission chez Accor", client = employerDao.retrieveClientById("1")),
            Mission(id = "2", title = "Mission chez SG", client = employerDao.retrieveClientById("2")),
            Mission(id = "3", title = "Mission chez Accor 2", client = employerDao.retrieveClientById("1")),
            Mission(id = "4", title = "Mission chez Nokia", client = employerDao.retrieveClientById("3"))
    )

    fun retrieveMissionById(id: String): Mission? = missions.firstOrNull { mission -> mission.id == id }

    fun retrieveMissionsByClientId(clientId: String): List<Mission>? = missions.filter { mission -> mission.client.id == clientId }.toList()

    fun retrieveAllMissions(): List<Mission> = missions
}