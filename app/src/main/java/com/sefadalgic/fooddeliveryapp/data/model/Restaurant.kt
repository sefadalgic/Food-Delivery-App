package com.sefadalgic.fooddeliveryapp.data.model

import java.time.LocalTime

data class Restaurant(
    val id: Long,
    val name: String,
    val description: String?,
    val phone: String?,
    val mail: String?,
    val image: String?,
    val isActive: Boolean = true,
    val openingTime: String?,
    val closingTime: String?,
    val rating: Float?,
    val averageOrderTime: Int?,
    val deliveryPrice: Float?
)
