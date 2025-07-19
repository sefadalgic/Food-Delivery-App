package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun GreetingsText(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp)
    ) {
        Text("Hey Dalgic, ", style = AppTypography.titleMedium)
        Text(
            "Good Afternoon", style = AppTypography.titleMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
    }

}