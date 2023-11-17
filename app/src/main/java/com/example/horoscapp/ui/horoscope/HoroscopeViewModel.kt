package com.example.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.example.horoscapp.data.provider.HoroscopeProvider
import com.example.horoscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) :
    ViewModel() {
    private var _horoscopes = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscopes: StateFlow<List<HoroscopeInfo>> = _horoscopes

    init {
        _horoscopes.value = horoscopeProvider.getHoroscopes()
    }

}