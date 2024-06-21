package com.jmanday.auth

interface AuthRepository {

    suspend fun register(username: String, email: String, password: String)

    suspend fun login(email: String, password: String)
}
