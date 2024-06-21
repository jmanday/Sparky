package com.jmanday.login.domain.model

data class User(
    private val userName: String,
    private val userId: String,
    private val accessTokenExpirationTimestamp: Long,
    private val refreshToken: String,
    private val accessToken: String
)
