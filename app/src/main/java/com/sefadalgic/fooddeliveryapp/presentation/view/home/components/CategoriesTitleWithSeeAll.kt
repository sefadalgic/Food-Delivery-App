package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun CategoriesTitleWithSeeAll(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 25.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "All Categories",
            style = AppTypography.titleMedium
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "See All", style = AppTypography.bodyMedium)
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
        }
    }
}