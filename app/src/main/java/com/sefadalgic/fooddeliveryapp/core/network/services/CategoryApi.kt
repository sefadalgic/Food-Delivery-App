package com.sefadalgic.fooddeliveryapp.core.network.services

import com.sefadalgic.fooddeliveryapp.data.model.BaseResponse
import com.sefadalgic.fooddeliveryapp.data.model.Category
import retrofit2.http.GET
import retrofit2.http.Path

interface CategoryApi {
    @GET("category/")
    suspend fun getCategories(): BaseResponse<List<Category>>

    @GET("category/{id}")
    suspend fun getCategoryDetail(@Path("id") id: Int): BaseResponse<Category>
}