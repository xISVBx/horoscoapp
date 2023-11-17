package com.example.horoscapp.domain.useCase

import com.example.horoscapp.domain.repository.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository){
    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)

}