package com.jmanday.api

import com.jmanday.api.login.LoginRequest
import com.jmanday.api.login.LoginResponseDto
import com.jmanday.api.register.RegisterRequest
import com.jmanday.api.register.RegisterResponseDto
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthService {

    @POST("register")
    suspend fun register(@Body registerRequest: RegisterRequest): RegisterResponseDto

    @Headers(
        "x-api-key: Aj8vfl8S5QTEkhUD"
    )
    @POST("login")
    fun login(@Body loginRequest: LoginRequest): LoginResponseDto
}
