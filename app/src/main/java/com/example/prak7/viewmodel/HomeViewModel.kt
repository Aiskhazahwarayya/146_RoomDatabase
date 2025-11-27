package com.example.prak7.viewmodel

import com.example.prak7.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}