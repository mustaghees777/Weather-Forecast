package com.example.weatherforecast.data.repository

import com.example.weatherforecast.data.local.UpcomingDaysSharedPrefService
import com.example.weatherforecast.model.nextweathermodel.nextsevendays.NextSevenDaysWeather

class UpcomingDaysSharedPrefRepository(private val service: UpcomingDaysSharedPrefService) {

    fun sendData(weatherData: NextSevenDaysWeather) {
        service.sendData(weatherData)
    }

    fun getData(): NextSevenDaysWeather? {
        return service.getData()
    }

}