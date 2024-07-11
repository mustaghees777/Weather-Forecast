package com.example.weatherforecast.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.CurrentLocationRepository
import com.example.weatherforecast.model.CurrentLocationData

class CurrentLocationViewModel(private val currentLocationRepository: CurrentLocationRepository) : ViewModel() {
    suspend fun getLocation() {
        currentLocationRepository.getLocation()
    }

    val approximateLocationLiveData: LiveData<CurrentLocationData>
        get() = currentLocationRepository.locationLiveData
}