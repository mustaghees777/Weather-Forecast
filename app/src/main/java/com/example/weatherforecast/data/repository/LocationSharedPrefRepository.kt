package com.example.weatherforecast.data.repository

import com.example.weatherforecast.data.local.LocationSharedPrefService
import com.example.weatherforecast.model.CurrentLocationData

class LocationSharedPrefRepository(private val locationSharedPrefService: LocationSharedPrefService) {

    fun getData(): CurrentLocationData? {
        return locationSharedPrefService.getData()
    }

    fun sendData(locationData: CurrentLocationData) {
        locationSharedPrefService.sendData(locationData)
    }

}