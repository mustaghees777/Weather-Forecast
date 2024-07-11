package com.example.weatherforecast.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repository.SettingsSharedPrefRepository
import com.example.weatherforecast.model.SettingsData

class SettingsSharedPrefViewModel(private val settingsRepository: SettingsSharedPrefRepository): ViewModel() {

    fun getData(): SettingsData? {
        return settingsRepository.getData()
    }

    fun sendData(settingsData: SettingsData) {
        settingsRepository.sendData(settingsData)
    }
}