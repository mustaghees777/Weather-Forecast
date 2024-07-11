package com.example.weatherforecast.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.UpcomingDaysSharedPrefRepository
import com.example.weatherforecast.model.nextweathermodel.nextsevendays.NextSevenDaysWeather

class UpcomingDaysSharedPrefViewModel(private val repository: UpcomingDaysSharedPrefRepository): ViewModel() {

    fun getData(): NextSevenDaysWeather? {
        return repository.getData()
    }

    fun sendData(weatherData: NextSevenDaysWeather) {
        repository.sendData(weatherData)
    }

}