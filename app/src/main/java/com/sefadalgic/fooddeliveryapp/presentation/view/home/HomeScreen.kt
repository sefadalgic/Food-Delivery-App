package com.sefadalgic.fooddeliveryapp.presentation.view.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.GreetingsText
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.HomeTopBar
import com.sefadalgic.fooddeliveryapp.presentation.view.home.components.SearchField

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val viewModel: HomeViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchCategories()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        HomeTopBar()
        GreetingsText()
        SearchField()




    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}