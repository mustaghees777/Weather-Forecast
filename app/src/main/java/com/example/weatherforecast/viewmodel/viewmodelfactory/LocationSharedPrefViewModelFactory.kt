package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.LocationSharedPrefRepository
import com.example.weatherforecast.viewmodel.LocationSharedPrefViewModel

class LocationSharedPrefViewModelFactory(private val repository: LocationSharedPrefRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LocationSharedPrefViewModel(repository) as T
    }

}