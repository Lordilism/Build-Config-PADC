package com.example.shared.data.models

import com.example.shared.data.Vo.ResponseVO

interface RestaurantsModel {
    fun getRestaurants(
        onSuccess:(List<ResponseVO>) ->Unit,
        onFailure: (String)->Unit

    )
}