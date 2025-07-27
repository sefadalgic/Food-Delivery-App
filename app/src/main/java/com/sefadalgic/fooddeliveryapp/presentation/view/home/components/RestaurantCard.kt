package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FireTruck
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.WatchLater
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun RestaurantCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(140.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color.Red)
        )
        Text(
            text = "Rose Garden Restaurant",
            style = AppTypography.titleMedium,
            modifier = Modifier.padding(top = 12.dp, bottom = 8.dp)
        )
        Text(
            text = "Burger - Chicken - Riche - Wings", style = AppTypography.bodyMedium.copy(
                color = colorResource(R.color.spaceman)
            )
        )
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 12.dp)
        ) {
            RestaurantCardFeature(
                icon = Icons.Outlined.Star, textValue = "4.5"
            )
            RestaurantCardFeature(
                modifier = Modifier.padding(horizontal = 22.dp),
                icon = Icons.Outlined.FireTruck,
                textValue = "Free"
            )
            RestaurantCardFeature(
                icon = Icons.Outlined.WatchLater, textValue = "20 Min"
            )
        }
    }
}

@Composable
fun RestaurantCardFeature(modifier: Modifier = Modifier, icon: ImageVector, textValue: String) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            icon, tint = colorResource(R.color.royal_oranje), contentDescription = null
        )
        Text(textValue, style = AppTypography.bodyMedium, modifier = Modifier.padding(start = 4.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun RestaurantCardPreview() {
    RestaurantCard()
}