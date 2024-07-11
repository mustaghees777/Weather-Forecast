package com.example.weatherforecast.data.repository

import com.example.weatherforecast.data.local.SettingsSharedPrefService
import com.example.weatherforecast.model.SettingsData

class SettingsSharedPrefRepository(private val settingsService: SettingsSharedPrefService) {

    fun getData(): SettingsData? {
        return settingsService.getData()
    }

    fun sendData(settingsData: SettingsData) {
        settingsService.setData(settingsData)
    }
}