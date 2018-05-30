package com.soat.graphql.graphqlkotlindemo.dao

import com.soat.graphql.graphqlkotlindemo.entities.Mission
import org.springframework.stereotype.Component

@Component
class MissionDao {

    private val missions = mutableListOf(
            Mission(id = "1", title = "Mission chez Accor"),
            Mission(id = "2", title = "Mission chez SG"),
            Mission(id = "3", title = "Mission chez Accor 2"),
            Mission(id = "4", title = "Mission chez Nokia")
    )

    fun retrieveMissionById(id: String): Mission? = missions.firstOrNull { mission -> mission.id == id }

    fun retrieveAllMissions(): List<Mission> = missions
}