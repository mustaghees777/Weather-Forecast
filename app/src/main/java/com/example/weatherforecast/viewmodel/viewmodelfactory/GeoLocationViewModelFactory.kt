package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.GeoLocationRepository
import com.example.weatherforecast.viewmodel.GeoLocationViewModel

class GeoLocationViewModelFactory(private val repository: GeoLocationRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GeoLocationViewModel(repository) as T
    }
}