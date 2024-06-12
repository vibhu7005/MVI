package com.example.mvi.view

sealed class Intent {
    data object FetchAnimals : Intent()
}