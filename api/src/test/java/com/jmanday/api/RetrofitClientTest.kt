package com.jmanday.api

import com.jmanday.client.RetrofitClient
import org.junit.Test

class RetrofitClientTest {

    @Test
    fun addition_isCorrect() {
        val myURL = "https://www.testing.com/8080/"
        val retrofit = RetrofitClient(myURL).retrofit

        assert(retrofit.baseUrl().url().toString() == myURL)
    }
}
