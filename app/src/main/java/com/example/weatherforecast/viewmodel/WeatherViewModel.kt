package com.example.weatherforecast.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.WeatherRepository
import com.example.weatherforecast.model.weathermodel.WeatherData

class WeatherViewModel(private val weatherRepository: WeatherRepository): ViewModel() {

    suspend fun getWeather(lat: String, lon: String, appId: String) {
        weatherRepository.getWeather(lat, lon, appId)
    }

    val weatherLiveData: LiveData<WeatherData>
        get() = weatherRepository.weatherData

}