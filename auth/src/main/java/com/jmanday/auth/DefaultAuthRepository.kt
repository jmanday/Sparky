package com.jmanday.auth

import com.jmanday.login.data.datasource.RemoteDataSource
import com.jmanday.login.domain.model.NetworkError
import com.jmanday.login.domain.model.User
import com.jmanday.login.domain.util.Resource

class DefaultAuthRepository(
    private val dataSource: RemoteDataSource
) : AuthRepository{

    override suspend fun register(username: String, email: String, password: String) {
        dataSource.register(username, email, password)
    }

    override suspend fun login(email: String, password: String): Resource<User, NetworkError> {
        return dataSource.login(email, password)
    }
}
