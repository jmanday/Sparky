package com.jmanday.api

import org.junit.Test

import org.junit.Assert.*

class RetrofitClientTest {

    @Test
    fun addition_isCorrect() {
        val myURL = "https://www.testing.com/8080/"
        val retrofit = ApiClient(myURL).retrofit

        assert(retrofit.baseUrl().url().toString() == myURL)
    }
}
