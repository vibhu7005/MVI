package com.example.mvi.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AnimalRepository {
    private const val BASE_URL = ""
    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(
            GsonConverterFactory.create()
        ).build()

    val api: ApiInterface = getRetrofit().create(ApiInterface::class.java)
}