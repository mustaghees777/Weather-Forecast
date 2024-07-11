package com.example.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherforecast.data.remote.HourlyWeatherService
import com.example.weatherforecast.model.nextweathermodel.hourlyweathers.HourlyWeatherModel

class HourlyWeatherRepository(private val service: HourlyWeatherService) {

    private val hourlyWeatherLiveData = MutableLiveData<HourlyWeatherModel>()

    val weatherLiveData: LiveData<HourlyWeatherModel>
        get() = hourlyWeatherLiveData

    suspend fun getWeather(lat: String, lon: String, hourly: String, weatherCode: String, forecastDays: Int, timezone: String) {
        val result = service.getWeather(lat, lon, hourly, weatherCode, forecastDays, timezone)

        if(result.body() != null) {
            hourlyWeatherLiveData.value = result.body()
        }
    }

}