package com.soat.graphql.graphqlkotlindemo.dao

import com.soat.graphql.graphqlkotlindemo.entities.Person
import org.springframework.stereotype.Component

@Component
class PersonDao(private val missionDao: MissionDao) {

    private val soatien = mutableListOf(
            Person(id = "1", firstName = "Juliane", lastName = "Adams", email = "julianne.adams@signidyne.com", active = true, age = 37, mission = missionDao.retrieveMissionById("1")),
            Person(id = "2", firstName = "Barry", lastName = "Scott", email = "barry.scott@lovepad.com", active = false, age = 20),
            Person(id = "3", firstName = "Kelli", lastName = "House", email = "kelli.house@snorus.com", active = true, age = 24),
            Person(id = "4", firstName = "Socorro", lastName = "Rasmussen", email = "socorro.rasmussen@virxo.com", active = true, age = 23,mission = missionDao.retrieveMissionById("3")),
            Person(id = "5", firstName = "Mays", lastName = "Pena", email = "mays.pena@bezal.com", active = true, age = 28),
            Person(id = "6", firstName = "Middleton", lastName = "Chase", email = "middleton.chase@trollery.com", active = false, age = 42)
    )

    fun retrieveAllSoatien(): List<Person> = soatien
}