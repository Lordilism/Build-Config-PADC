package com.example.shared.mvp.views

import com.example.shared.data.Vo.ResponseVO

interface MainView {
    fun showRestaurants(restaurants: List<ResponseVO>)
    fun showError( errorMessage: String)
}