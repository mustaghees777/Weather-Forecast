package com.example.weatherforecast.data.remote

import com.example.weatherforecast.model.CurrentLocationData
import retrofit2.Response
import retrofit2.http.GET

interface CurrentLocationService {

    @GET("/json")
    suspend fun getApproximateLocation(): Response<CurrentLocationData>

}