package com.soat.graphql.graphqlkotlindemo.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.soat.graphql.graphqlkotlindemo.dao.MissionDao
import com.soat.graphql.graphqlkotlindemo.dao.PersonDao
import com.soat.graphql.graphqlkotlindemo.entities.Mission
import com.soat.graphql.graphqlkotlindemo.entities.Person
import org.springframework.stereotype.Component

@Component
class Query(private val personDao: PersonDao, private val missionDao: MissionDao) : GraphQLQueryResolver {

    fun findAllSoatien(): List<Person> = personDao.retrieveAllSoatien()

    fun findAllMissions(): List<Mission> = missionDao.retrieveAllMissions()
}