package com.example.module_login.ui.state

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RegisterViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            return RegisterViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}