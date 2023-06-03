package com.example.shared.data.models

import com.example.shared.data.Vo.ResponseVO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers


object RestaurantsModelImpl : RestaurantsModel, BaseModel() {

    override fun getRestaurants(
        onSuccess: (List<ResponseVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRestaurantAPI?.getRestaurants()?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe({
                onSuccess(it.data ?: listOf())
            }, {
                onFailure(it.localizedMessage ?: "No Internet")
            })
    }


}