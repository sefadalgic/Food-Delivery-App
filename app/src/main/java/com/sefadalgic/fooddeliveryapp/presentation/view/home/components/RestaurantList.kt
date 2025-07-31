package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import com.sefadalgic.fooddeliveryapp.data.model.UiState

@Composable
fun RestaurantList(modifier: Modifier = Modifier, restaurantState: UiState<List<Restaurant>>) {
    when (restaurantState) {
        is UiState.Loading -> CircularProgressIndicator()
        is UiState.Success -> {
            val restaurants = (restaurantState as UiState.Success<List<Restaurant>>).data
            Column {
                restaurants.forEach {
                    RestaurantCard(restaurant = it, modifier = Modifier.padding(bottom = 12.dp))
                }
            }
        }

        is UiState.Error -> {
            val errorMessage = (restaurantState as UiState.Error).message
            Text(text = errorMessage)
        }
    }

}