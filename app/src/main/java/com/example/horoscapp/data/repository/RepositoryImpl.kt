package com.example.horoscapp.data.repository

import android.util.Log
import com.example.horoscapp.data.network.HoroscopeApiService
import com.example.horoscapp.data.network.responses.PredictionHoroscopeResponse
import com.example.horoscapp.domain.model.PredictionHoroscopeModel
import com.example.horoscapp.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String) : PredictionHoroscopeModel? {
        //Peticion
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("HoroscopoApiError", "Ha ocurrido un error ${it.message}") }
        return null;
    }
}