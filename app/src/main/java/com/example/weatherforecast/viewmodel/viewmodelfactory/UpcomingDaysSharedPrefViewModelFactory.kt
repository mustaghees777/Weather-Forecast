package com.example.weatherforecast.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.data.repository.UpcomingDaysSharedPrefRepository
import com.example.weatherforecast.viewmodel.UpcomingDaysSharedPrefViewModel

class UpcomingDaysSharedPrefViewModelFactory(private val repository: UpcomingDaysSharedPrefRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UpcomingDaysSharedPrefViewModel(repository) as T
    }

}