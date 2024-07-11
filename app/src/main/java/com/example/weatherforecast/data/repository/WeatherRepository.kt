package com.example.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherforecast.data.remote.WeatherService
import com.example.weatherforecast.model.weathermodel.WeatherData

class WeatherRepository(private val weatherService: WeatherService) {

    private val weatherLiveData = MutableLiveData<WeatherData>()

    val weatherData: LiveData<WeatherData>
        get() = weatherLiveData

    suspend fun getWeather(lat: String, lon: String, appId: String) {
        val result = weatherService.getWeather(lat, lon, appId)

        if(result.body() != null) {
            weatherLiveData.postValue(result.body())
        }
    }

}