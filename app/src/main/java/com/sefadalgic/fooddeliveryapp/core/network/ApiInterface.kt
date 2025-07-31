package com.sefadalgic.fooddeliveryapp.core.network

import com.sefadalgic.fooddeliveryapp.data.model.BaseResponse
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.Post
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import retrofit2.http.GET

interface ApiInterface {
    @GET("category/")
    suspend fun getCategories(): BaseResponse<List<Category>>


    @GET("restaurant")
    suspend fun getOpenedRestaurants(): BaseResponse<List<Restaurant>>
}