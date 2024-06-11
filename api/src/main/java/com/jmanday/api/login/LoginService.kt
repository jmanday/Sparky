package com.jmanday.api.login

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface LoginService {
    @Headers(
        "x-api-key: Aj8vfl8S5QTEkhUD"
    )
    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponseDto

}
