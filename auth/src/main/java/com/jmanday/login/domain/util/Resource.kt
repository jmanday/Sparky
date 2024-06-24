package com.jmanday.login.domain.util

sealed class Resource<in T, in E> {
    class Success<T>(val data: T): Resource<T, Nothing>()
    class Error<E>(val error: E): Resource<Nothing, E>()
}
