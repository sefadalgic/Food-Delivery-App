package com.sefadalgic.fooddeliveryapp.data.repository

import com.sefadalgic.fooddeliveryapp.core.network.RetrofitInstance
import com.sefadalgic.fooddeliveryapp.core.network.services.CategoryApi

class CategoryRepository (private val api: CategoryApi = RetrofitInstance.categoryApi) {
    suspend fun getCategories() = api.getCategories();

    suspend fun getCategoryDetail(id: Int) = api.getCategoryDetail(id = id)
}