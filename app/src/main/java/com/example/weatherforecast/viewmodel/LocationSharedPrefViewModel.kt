package com.example.weatherforecast.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.LocationSharedPrefRepository
import com.example.weatherforecast.model.CurrentLocationData

class LocationSharedPrefViewModel(private val locationSharedPrefRepository: LocationSharedPrefRepository): ViewModel() {

    fun getData(): CurrentLocationData? {
        return locationSharedPrefRepository.getData()
    }

    fun sendData(locationData: CurrentLocationData) {
        locationSharedPrefRepository.sendData(locationData)
    }

}