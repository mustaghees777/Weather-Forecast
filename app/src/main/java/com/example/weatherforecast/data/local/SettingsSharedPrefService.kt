package com.example.weatherforecast.data.local

import android.content.Context
import com.google.gson.Gson
import com.example.weatherforecast.model.SettingsData
import com.example.weatherforecast.util.AppConstants

class SettingsSharedPrefService(val context: Context) {
    private val sharedPref = context.getSharedPreferences(AppConstants.SHARED_PREF_NAME, Context.MODE_PRIVATE)
    private val gson = Gson()

    fun getData(): SettingsData? {
        val data = sharedPref.getString(AppConstants.SETTINGS_SHARED_PREF, null)
        return gson.fromJson(data, SettingsData::class.java)
    }

    fun setData(settingsData: SettingsData) {
        val editor = sharedPref.edit()
        val data = gson.toJson(settingsData)
        editor.putString(AppConstants.SETTINGS_SHARED_PREF, data)
        editor.apply()
    }
}