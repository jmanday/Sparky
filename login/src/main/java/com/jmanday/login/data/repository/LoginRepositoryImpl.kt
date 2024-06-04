package com.jmanday.login.data.repository

import com.jmanday.login.data.datasource.UserDataSource
import com.jmanday.login.domain.model.UserModel
import com.jmanday.login.domain.repository.LoginRepository
import com.jmanday.login.domain.util.Resource

class LoginRepositoryImpl(
    private val userDataSource: UserDataSource
): LoginRepository {

    override suspend fun login(email: String, password: String): Resource<UserModel> {
        TODO("Not yet implemented")
    }
}
