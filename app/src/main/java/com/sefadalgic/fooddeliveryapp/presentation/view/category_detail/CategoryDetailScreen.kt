package com.sefadalgic.fooddeliveryapp.presentation.view.category_detail

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.sefadalgic.fooddeliveryapp.presentation.view.category_detail.component.CategoryDetailTopBar
import com.sefadalgic.fooddeliveryapp.ui.components.FoodItemCard
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun CategoryDetailScreen(modifier: Modifier = Modifier, categoryId: Int, categoryName: String) {
    Scaffold(
        modifier = Modifier.padding(
            top = 20.dp
        ), topBar = { CategoryDetailTopBar() },

        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
            ) {
                Text(text = "Popular Burgers", style = AppTypography.titleMedium)

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)

                ) {
                    items(4) {
                        FoodItemCard()
                    }
                }
            }
        }

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CategoryDetailPreview() {
    CategoryDetailScreen(
        categoryId = 1,
        categoryName = "Burger"
    )
}