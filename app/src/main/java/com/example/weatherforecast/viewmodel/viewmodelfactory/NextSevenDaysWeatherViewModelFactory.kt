package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.NextSevenDaysWeatherRepository
import com.example.weatherforecast.viewmodel.NextSevenDaysWeatherViewModel

class NextSevenDaysWeatherViewModelFactory(private val repository: NextSevenDaysWeatherRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NextSevenDaysWeatherViewModel(repository) as T
    }

}