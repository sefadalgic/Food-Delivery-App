package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.clickable
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
fun TitleWithSeeAll(modifier: Modifier = Modifier, title: String, onSeeAllClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 25.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = AppTypography.titleMedium
        )

        Row(
            modifier = Modifier.clickable(onClick = onSeeAllClick),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "See All", style = AppTypography.bodyMedium)
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
        }
    }
}