package com.sefadalgic.fooddeliveryapp.presentation.view.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoriesTitleWithSeeAll
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.CategoryCard
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.GreetingsText
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.HomeTopBar
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.SearchField
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val viewModel: HomeViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchCategories()
    }


    val categories by viewModel.categories.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        HomeTopBar()
        GreetingsText()
        SearchField()
        CategoriesTitleWithSeeAll()

        LazyRow {
            println("Categories: ${categories}")
            items(categories) { category ->
                CategoryCard(
                    name = category.name)
            }
        }






    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}