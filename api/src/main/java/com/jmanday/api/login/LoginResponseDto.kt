package com.jmanday.api.login

import com.squareup.moshi.Json


data class LoginResponseDto(
    @field:Json(name = "accessToken")
    val accessToken: String,
    @field:Json(name = "refreshToken")
    val refreshToken: String,
    @field:Json(name = "accessTokenExpirationTimestamp")
    val accessTokenExpirationTimestamp: Long,
    @field:Json(name = "userId")
    val userId: String,
    @field:Json(name = "username")
    val username: String
)
