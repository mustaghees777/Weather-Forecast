package com.example.weatherforecast.data.repository

import com.example.weatherforecast.data.local.WeatherSharedPrefService
import com.example.weatherforecast.model.weathermodel.WeatherData

class WeatherSharedPrefRepository(private val weatherService: WeatherSharedPrefService) {

    fun getData(): WeatherData? {
        return weatherService.getData()
    }

    fun sendData(weatherData: WeatherData) {
        weatherService.sendData(weatherData)
    }

}