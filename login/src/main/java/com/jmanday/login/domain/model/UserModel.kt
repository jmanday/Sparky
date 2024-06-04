package com.jmanday.login.domain.model

data class UserModel(
    private val userName: String,
    private val userId: String,
    private val accessTokenExpirationTimestamp: String,
    private val refreshToken: String,
    private val accessToken: String
)
