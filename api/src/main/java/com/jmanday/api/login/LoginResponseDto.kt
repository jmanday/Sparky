package com.jmanday.api.login

data class LoginResponseDto(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExpirationTimestamp: Long,
    val userId: String,
    val username: String
)
