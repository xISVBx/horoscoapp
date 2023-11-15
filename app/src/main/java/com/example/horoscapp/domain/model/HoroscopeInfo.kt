package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val name:Int, val img:Int){
    object Aries:HoroscopeInfo(R.drawable.aries,R.string.aries)
}