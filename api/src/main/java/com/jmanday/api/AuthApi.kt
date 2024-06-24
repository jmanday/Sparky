package com.jmanday.api

import com.jmanday.client.RetrofitClient

class AuthApi {

    val service = RetrofitClient("https://sparky.pl-coding.com:8081/").retrofit.create(AuthService::class.java)

}
