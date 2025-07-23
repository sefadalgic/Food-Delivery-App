package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun CategoryCard(modifier: Modifier = Modifier, name: String, startingPrice: Long = 90) {
    Box(
        modifier = Modifier.padding(end = 12.dp, top = 16.dp).size(140.dp, 190.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = colorResource(R.color.white)))  {

        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Box(
                modifier = Modifier.

                size(height = 110.dp, width = 120.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = Color.Red
                    )
            ) {

            }

            Text(text = "Pizza",
                modifier = Modifier.padding(top= 12.dp),
                maxLines = 1,
                style = AppTypography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.parisian_night)
                ))

            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Starting",
                    style = AppTypography.bodyMedium.copy(
                        color = colorResource(R.color.spaceman)
                    )
                )

                Text(
                    text = "$40",
                    style = AppTypography.bodyMedium.copy(
                        color = colorResource(R.color.parisian_night)
                    )
                )


            }

        }

    }

}