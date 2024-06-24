package com.jmanday.api.register

data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String
)
