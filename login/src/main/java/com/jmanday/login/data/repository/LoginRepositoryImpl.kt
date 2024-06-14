package com.jmanday.login.data.repository

import com.jmanday.login.data.datasource.UserDataSource
import com.jmanday.login.domain.model.UserModel
import com.jmanday.login.domain.repository.LoginRepository
import com.jmanday.login.domain.util.Resource

class LoginRepositoryImpl(
    private val userDataSource: UserDataSource
): LoginRepository {

    override fun login(email: String, password: String): Resource<UserModel> {
        userDataSource.login(email, password)
        return Resource.Success(UserModel("12", "33", "111", "sadasd", "asdsad"))
    }
}
