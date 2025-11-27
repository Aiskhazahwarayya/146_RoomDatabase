package com.example.prak7.repositori

import com.example.prak7.room.Siswa
import kotlinx.coroutines.flow.Flow

interface  RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}