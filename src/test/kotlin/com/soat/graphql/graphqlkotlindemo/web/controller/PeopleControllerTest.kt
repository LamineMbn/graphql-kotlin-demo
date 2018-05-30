package com.soat.graphql.graphqlkotlindemo.web.controller

import org.assertj.core.api.Assertions
import org.junit.Test

class PeopleControllerTest {

    @Test
    fun test_ping() {
        val sut = PeopleController()
        Assertions.assertThat(sut.ping()).isEqualToIgnoringCase("It's working")
    }
}