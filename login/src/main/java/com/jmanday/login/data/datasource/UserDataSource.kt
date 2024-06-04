package com.jmanday.login.data.datasource

interface UserDataSource {
    suspend fun login(email: String, password: String)
}
