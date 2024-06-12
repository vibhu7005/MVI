package com.example.mvi.networking

import com.example.mvi.model.Animal
import retrofit2.http.GET

interface ApiInterface {
    @GET("animals.json")
    suspend fun getAnimals() : List<Animal>
}