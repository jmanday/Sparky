package com.jmanday.login.domain.repository

import com.jmanday.login.domain.model.NetworkError
import com.jmanday.login.domain.model.User
import com.jmanday.login.domain.util.Resource

interface LoginRepository {
    fun login(email: String, password: String): Resource<User, NetworkError>
}