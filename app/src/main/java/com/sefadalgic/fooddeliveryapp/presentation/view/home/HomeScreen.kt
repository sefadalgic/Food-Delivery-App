package com.sefadalgic.fooddeliveryapp.presentation.view.home

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
import com.sefadalgic.fooddeliveryapp.data.model.UiState
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.TitleWithSeeAll
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoryCard
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoryList
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.GreetingsText
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.HomeTopBar
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.RestaurantCard
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.SearchField

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val viewModel: HomeViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchCategories()
    }


    val categoriesState by viewModel.categories.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        HomeTopBar()
        GreetingsText()
        SearchField()
        TitleWithSeeAll(
            title = "All Categories", onSeeAllClick = {})

        CategoryList(state = categoriesState)
        TitleWithSeeAll(
            title = "Open Restaurants", onSeeAllClick = {})

        LazyColumn(
            modifier = Modifier.padding(top = 6.dp)
        ) {
            items(3) {
                RestaurantCard(modifier = Modifier.padding(bottom = 16.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}