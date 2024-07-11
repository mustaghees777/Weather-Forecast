package com.example.weatherforecast.model

data class SettingsData(var temperatureUnit: String = "°C", var windSpeedUnit: String = "m/s", var atmosphericPressureUnit: String = "hPa", var weatherMusic: Boolean = false)
