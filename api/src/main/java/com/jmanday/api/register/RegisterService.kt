package com.jmanday.api.register

import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterService {

    @POST("register")
    suspend fun register(@Body registerRequest: RegisterRequest): RegisterResponseDto
}
