package com.jmanday.auth

import com.jmanday.login.data.datasource.RemoteDataSource

class DefaultAuthRepository(
    private val dataSource: RemoteDataSource
) : AuthRepository{

    override suspend fun register(username: String, email: String, password: String) {
        dataSource.register(username, email, password)
    }

    override suspend fun login(email: String, password: String) {
        dataSource.login(email, password)
    }
}
