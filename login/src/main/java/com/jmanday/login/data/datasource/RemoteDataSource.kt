package com.jmanday.login.data.datasource

import com.jmanday.api.login.LoginApi
import com.jmanday.api.login.LoginRequest

class RemoteDataSource : UserDataSource {

    private val loginApi = LoginApi()

    override suspend fun login(email: String, password: String) {
        val response = loginApi.service.login(LoginRequest("jmanday@gmail.com", "12a34b56D"))
        println()
    }
}
