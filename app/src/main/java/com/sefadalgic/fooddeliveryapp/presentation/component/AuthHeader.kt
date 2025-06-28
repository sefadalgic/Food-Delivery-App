package com.sefadalgic.fooddeliveryapp.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun AuthHeader (title : String, subtitle: String) {
    val size = Size()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(
            width = size.width(1f).dp,
            size.height(0.29f).dp
        ).background(color = Color.Black)
    )
    {   Spacer(modifier = Modifier.size(size.height(0.14f).dp))
        Text(title,
            color = Color.White,
            style = AppTypography.titleLarge)

        Text(subtitle,
            modifier = Modifier.padding(
                top = 16.dp
            ),
            textAlign = TextAlign.Center,
            color = Color.White,
            style = AppTypography.bodyMedium)
    }
}


