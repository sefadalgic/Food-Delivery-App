package com.sefadalgic.fooddeliveryapp.core.network.services

import com.sefadalgic.fooddeliveryapp.data.model.BaseResponse
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import retrofit2.http.GET

interface RestaurantApi {
    @GET("restaurant")
    suspend fun getOpenedRestaurants(): BaseResponse<List<Restaurant>>
}