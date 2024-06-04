package com.jmanday.login.domain

import com.jmanday.login.domain.repository.LoginRepository

class LoginUseCase(
    private val loginRepository: LoginRepository
) {

    suspend operator fun invoke(email: String, password: String) {
        loginRepository.login(email, password)
    }
}
