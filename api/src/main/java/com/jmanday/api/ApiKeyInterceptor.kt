package com.jmanday.api

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalResponse = chain.proceed(chain.request())

        return originalResponse.newBuilder()
            .addHeader("x-api-key", BuildConfig.API_KEY)
            .build()
    }
}
