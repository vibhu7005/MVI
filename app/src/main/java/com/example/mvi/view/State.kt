package com.example.mvi.view

import com.example.mvi.model.Animal

sealed class State {
    data object Loading : State()
    data object Idle : State()
    data class Success(val animal : Animal?) : State()
    data class Error(val message : String?) : State()
}