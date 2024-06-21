package com.jmanday.login.data.datasource

import android.net.http.HttpException
import android.os.Build
import com.jmanday.api.AuthApi
import com.jmanday.api.login.LoginRequest

class RemoteDataSource : AuthDataSource {

    private val authApi = AuthApi()

    override suspend fun register(username: String, email: String, password: String) {
        val response = authApi.service.login(LoginRequest(email, password))
        println("RESPONSE 1")
    }

    override suspend fun login(email: String, password: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            try {
                val response = authApi.service.login(LoginRequest(email, password))
                println("RESPONSE 2")
            } catch (e: HttpException) {
                println("FALLOOOOOOO")
            }
        }
    }

}
