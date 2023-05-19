package com.example.shared.network.responses

import com.example.shared.data.Vo.ResponseVO
import com.google.gson.annotations.SerializedName

data class GetRestaurantsResponse(
    @SerializedName("code")
    val code: String?,

    @SerializedName("message")
    val message: String?,

    @SerializedName("data")
    val data:List<ResponseVO>?
) {


}