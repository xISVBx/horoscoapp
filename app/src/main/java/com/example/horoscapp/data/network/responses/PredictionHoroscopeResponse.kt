package com.example.horoscapp.data.network.responses

import com.example.horoscapp.domain.model.PredictionHoroscopeModel
import com.google.gson.annotations.SerializedName

data class PredictionHoroscopeResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionHoroscopeModel {
        return PredictionHoroscopeModel(horoscope = horoscope, sign = sign, date = date)
    }
}