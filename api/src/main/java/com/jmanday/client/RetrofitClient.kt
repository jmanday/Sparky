package com.jmanday.client

import com.jmanday.api.ApiKeyInterceptor
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitClient(private val url: String) {

    private val  moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val client = OkHttpClient.Builder()
        .addInterceptor(ApiKeyInterceptor())
        .build()

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(client)
            .build()
    }
}
