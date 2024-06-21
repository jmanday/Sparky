package com.jmanday.login.data.datasource

import com.jmanday.api.AuthApi
import com.jmanday.api.login.LoginRequest
import com.jmanday.login.domain.model.NetworkError
import com.jmanday.login.domain.model.User
import com.jmanday.login.domain.util.Resource

class RemoteDataSource : AuthDataSource {

    private val authApi = AuthApi()

    override suspend fun register(username: String, email: String, password: String) {
        println("RESPONSE REGISTER")
    }

    override suspend fun login(email: String, password: String): Resource<User, NetworkError> {
        try {
            val response = authApi.service.login(LoginRequest(email, password))
            return Resource.Success(User(response.username, response.userId, response.accessTokenExpirationTimestamp, response.refreshToken, response.accessToken))
        } catch (e: Exception) {
            return Resource.Error(NetworkError(e.message ?: "Unexpected issue"))
        }
    }

}
