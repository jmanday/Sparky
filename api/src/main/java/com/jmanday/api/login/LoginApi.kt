package com.jmanday.api.login

import com.jmanday.client.RetrofitClient

class LoginApi {

    val service = RetrofitClient("https://sparky.pl-coding.com:8081/").retrofit.create(LoginService::class.java)
}
