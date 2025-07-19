package com.sefadalgic.fooddeliveryapp.core.network

import com.sefadalgic.fooddeliveryapp.data.model.BaseResponse
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.Post
import retrofit2.http.GET

interface ApiInterface {
    @GET("category/")
    suspend fun getCategories(): BaseResponse<List<Category>>
}