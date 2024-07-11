package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.SettingsSharedPrefRepository
import com.example.weatherforecast.viewmodel.SettingsSharedPrefViewModel

class SettingsSharedPrefViewModelFactory(private val repository: SettingsSharedPrefRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SettingsSharedPrefViewModel(repository) as T
    }

}