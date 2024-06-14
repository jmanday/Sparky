package com.jmanday.login.data.datasource

interface UserDataSource {
    fun login(email: String, password: String)
}
