package com.example.horoscapp.data.provider

import com.example.horoscapp.domain.model.HoroscopeInfo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            HoroscopeInfo.Aries,
            HoroscopeInfo.Taurus,
            HoroscopeInfo.Gemini,
            HoroscopeInfo.Cancer,
            HoroscopeInfo.Leo,
            HoroscopeInfo.Virgo,
            HoroscopeInfo.Libra,
            HoroscopeInfo.Scorpio,
            HoroscopeInfo.Sagittarius,
            HoroscopeInfo.Capricorn,
            HoroscopeInfo.Aquarius,
            HoroscopeInfo.Pisces
        )
    }
}