package com.example.horoscapp.data.repository

import com.example.horoscapp.data.datasource.LocalHoroscopeDataSource
import com.example.horoscapp.domain.model.HoroscopeInfo
import javax.inject.Inject

class HoroscopeRepository @Inject constructor(
    private val datasource: LocalHoroscopeDataSource
) {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return datasource.getHoroscopes()
    }

}