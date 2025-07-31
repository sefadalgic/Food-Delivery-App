package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.UiState

@Composable
fun CategoryList(modifier: Modifier = Modifier, state: UiState<List<Category>>) {
    when (state) {
        is UiState.Loading -> {
            CircularProgressIndicator()
        }

        is UiState.Success -> {
            val categories = state.data
            LazyRow {
                items(categories) { category ->
                    CategoryCard(
                        category = category
                    )
                }
            }
        }

        is UiState.Error -> {
            val errorMessage = (state as UiState.Error).message
            Text(text = errorMessage)
        }
    }
}