package com.sefadalgic.fooddeliveryapp.data.repository

import com.sefadalgic.fooddeliveryapp.core.network.RetrofitInstance
import com.sefadalgic.fooddeliveryapp.core.network.services.RestaurantApi

class RestaurantRepository(private val api: RestaurantApi = RetrofitInstance.restaurantApi) {
    suspend fun getOpenedRestaurants() = api.getOpenedRestaurants()
}