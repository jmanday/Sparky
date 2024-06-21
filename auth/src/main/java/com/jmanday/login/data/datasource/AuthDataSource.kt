package com.jmanday.login.data.datasource

import com.jmanday.login.domain.model.NetworkError
import com.jmanday.login.domain.model.User
import com.jmanday.login.domain.util.Resource

interface AuthDataSource {

    suspend fun register(username: String, email: String, password: String)

    suspend fun login(email: String, password: String): Resource<User, NetworkError>
}
