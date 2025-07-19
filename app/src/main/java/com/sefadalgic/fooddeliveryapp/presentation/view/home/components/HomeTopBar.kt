package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography


@Composable
fun HomeTopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .size(70.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        MenuIcon()
        DeliveredToColumn()
        Spacer(modifier = Modifier.weight(1f))
        ShopBagIconWithBadge()
    }

}

@Composable
private fun ShopBagIconWithBadge() {
    Box(
        modifier = Modifier
            .clip(shape = CircleShape)
            .size(50.dp)
            .background(color = colorResource(R.color.sambucus))
    ) {
        BadgedBox(
            modifier = Modifier.align(Alignment.Center), badge = {
                Badge(
                    containerColor = colorResource(R.color.royal_oranje),
                    contentColor = Color.White,
                    modifier = Modifier.size(18.dp)
                ) {
                    Text(text = "3", style = AppTypography.bodySmall)
                }
            }) {
            Icon(
                imageVector = Icons.Filled.ShoppingBag,
                modifier = Modifier.size(30.dp),
                tint = Color.White,
                contentDescription = stringResource(R.string.shoppingBag)
            )
        }
    }
}

@Composable
private fun DeliveredToColumn() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(start = 8.dp)
            .fillMaxHeight()

    ) {
        Text(
            text = stringResource(R.string.deliverTo), style = AppTypography.titleMedium.copy(
                color = colorResource(R.color.royal_oranje), fontWeight = FontWeight.Bold
            )
        )
        Text(text = "Istanbul, Turkey", style = AppTypography.bodyMedium)
    }
}

@Composable
private fun MenuIcon() {
    Box(
        modifier = Modifier
            .clip(shape = CircleShape)
            .size(60.dp)
            .background(color = colorResource(R.color.bright_gray))
            .padding(15.dp)
    ) {
        Icon(
            Icons.Default.Menu,
            tint = colorResource(R.color.sambucus),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .size(60.dp),
            contentDescription = stringResource(R.string.menu)
        )
    }
}