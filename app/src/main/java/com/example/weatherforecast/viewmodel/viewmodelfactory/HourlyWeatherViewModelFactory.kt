package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.HourlyWeatherRepository
import com.example.weatherforecast.viewmodel.HourlyWeatherViewModel

class HourlyWeatherViewModelFactory(private val repository: HourlyWeatherRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HourlyWeatherViewModel(repository) as T
    }

}