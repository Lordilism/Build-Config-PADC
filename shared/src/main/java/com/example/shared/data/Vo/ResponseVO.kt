package com.example.shared.data.Vo

import com.google.gson.annotations.SerializedName

data class ResponseVO(
    @SerializedName("name")
    val name:String?,

    @SerializedName("category")
    val category: String?,

    @SerializedName("delivery_price")
    val delivery_price:Int?,

    @SerializedName("rating")
    val rating:Double?,

    @SerializedName("image_url")
    val image_url:String?
)
