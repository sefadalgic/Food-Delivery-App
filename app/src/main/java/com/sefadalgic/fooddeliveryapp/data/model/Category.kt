package com.sefadalgic.fooddeliveryapp.data.model

data class Category(
    var id: Int,
    var name: String,
    var description: String? = null,
    var imageUrl: String? = null,
    var isActive: Boolean
)
