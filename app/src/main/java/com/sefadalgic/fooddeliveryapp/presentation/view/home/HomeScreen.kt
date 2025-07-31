package com.sefadalgic.fooddeliveryapp.presentation.view.home

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import com.sefadalgic.fooddeliveryapp.data.model.UiState
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.TitleWithSeeAll
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoryCard
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoryList
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.GreetingsText
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.HomeTopBar
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.RestaurantCard
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.RestaurantList
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.SearchField

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val viewModel: HomeViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchCategories()
        viewModel.fetchOpenedRestaurants()
    }


    val categoriesState by viewModel.categories.collectAsState()
    val restaurantState by viewModel.restaurants.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            HomeTopBar()
        }
        item {
            GreetingsText()
        }
        item {
            SearchField()
        }
        item {
            TitleWithSeeAll(
                title = "All Categories", onSeeAllClick = {})
        }
        item {
            CategoryList(state = categoriesState)
        }
        item {
            TitleWithSeeAll(
                title = "Open Restaurants", onSeeAllClick = {})
        }
        item {
            RestaurantList(restaurantState = restaurantState)
        }
    }
}