package com.jmanday.login.data.datasource

import com.jmanday.api.AuthApi
import com.jmanday.api.login.LoginRequest

class RemoteDataSource : UserDataSource {

    private val loginApi = AuthApi()

    override fun login(email: String, password: String) {
        val response = loginApi.service.login(LoginRequest("jmanday@gmail.com", "12a34b56D"))
        println("RESPONSE")
    }
}
