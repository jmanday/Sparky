package com.jmanday.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuthViewModel(
    private val repository: AuthRepository
) : ViewModel() {

    fun login(email: String, password: String) {

        viewModelScope.launch {
            repository.login(email, password);
        }
    }
}
