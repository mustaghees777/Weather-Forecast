package com.example.weatherforecast.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.WeatherSharedPrefRepository
import com.example.weatherforecast.model.weathermodel.WeatherData

class WeatherSharedPrefViewModel(private val weatherRepository: WeatherSharedPrefRepository): ViewModel() {

    fun getData(): WeatherData? {
        return weatherRepository.getData()
    }

    fun sendData(weatherData: WeatherData) {
        weatherRepository.sendData(weatherData)
    }

}