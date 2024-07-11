package com.example.weatherforecast.data.remote

import com.example.weatherforecast.model.CityLocationData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GeoLocationService {

    @GET("/geo/1.0/direct")
    suspend fun getLocation(@Query("q") q: String, @Query("limit") limit: Int, @Query("appid") appId: String) : Response<CityLocationData>

}