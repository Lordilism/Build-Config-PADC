package com.example.padc_build_config

import android.app.Application
import com.example.shared.data.models.RestaurantsModelImpl

class BaseRestaurantActivity : Application() {
    override fun onCreate() {
        val config = BuildConfig.ENDPOINT
        RestaurantsModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
        super.onCreate()

    }
}