package com.jmanday.api.register

import com.jmanday.client.RetrofitClient

class RegisterApi {

    val service = RetrofitClient("https://sparky.pl-coding.com:8081/").retrofit.create(RegisterService::class.java)
}
