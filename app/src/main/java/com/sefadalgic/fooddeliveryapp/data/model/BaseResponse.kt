package com.sefadalgic.fooddeliveryapp.data.model

data class BaseResponse<T>(
    val message: String?,
    val data: T?,
    val success: Boolean
)
