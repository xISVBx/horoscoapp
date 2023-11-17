package com.example.horoscapp.domain.repository

import com.example.horoscapp.domain.model.PredictionHoroscopeModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionHoroscopeModel?
}