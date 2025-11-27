package com.example.prak7.viewmodel.provider


import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.prak7.repositori.AplikasiSiswa
import com.example.prak7.viewmodel.EntryViewModel
import com.example.prak7.viewmodel.HomeViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            val aplikasiSiswa = this.aplikasiSiswa()
            HomeViewModel(
                aplikasiSiswa.container.repositoriSiswa
            )
        }
        initializer {
            // Ulangi untuk EntryViewModel
            val aplikasiSiswa = this.aplikasiSiswa()
            EntryViewModel(
                aplikasiSiswa.container.repositoriSiswa
            )
        }
    }
}
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)