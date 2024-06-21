package com.jmanday.login.data.datasource

interface AuthDataSource {

    suspend fun register(username: String, email: String, password: String)

    suspend fun login(email: String, password: String)
}
