package com.jmanday.login.domain.repository

import com.jmanday.login.domain.model.UserModel
import com.jmanday.login.domain.util.Resource

interface LoginRepository {
    suspend fun login(email: String, password: String): Resource<UserModel>
}
