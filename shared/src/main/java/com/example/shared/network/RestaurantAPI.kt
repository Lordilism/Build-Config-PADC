package com.example.shared.network

import com.example.shared.network.responses.GetRestaurantsResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import java.util.*

interface RestaurantAPI {
  @GET(ENDPOINTS_GET_RESTAURANTS)
  fun getRestaurants() : Observable<GetRestaurantsResponse>

}