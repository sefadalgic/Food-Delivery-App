package com.sefadalgic.fooddeliveryapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodItemCard(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(end = 12.dp, top = 16.dp)
            .size(140.dp, 180.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = colorResource(R.color.white))
    ) {

        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(75.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colorResource(R.color.royal_oranje))
            ) {
                GlideImage(
                    model = "",
                    contentScale = ContentScale.FillBounds,
                    contentDescription = "test"
                )
            }

            Text(
                text = "Sefa",
                modifier = Modifier.padding(top = 12.dp),
                maxLines = 1,
                style = AppTypography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.parisian_night)
                )
            )
            Text(
                text = "Sefa",
                modifier = Modifier.padding(top = 4.dp),
                maxLines = 1,
                style = AppTypography.bodyMedium.copy(
                    colorResource(R.color.spaceman)
                )
            )

            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "$50", style = AppTypography.bodyMedium.copy(
                        color = colorResource(R.color.spaceman)
                    )
                )

                Box(
                    modifier = Modifier.
                    clip(CircleShape)
                        .background(colorResource(R.color.royal_oranje))
                        .padding(4.dp)

                ) {
                    Icon(
                        Icons.Default.Add,
                        tint = colorResource(R.color.white),
                        modifier = Modifier.align(Alignment.Center),
                        contentDescription = null,
                    )

                }


            }

        }

    }

}

@Preview
@Composable
private fun FoodItemCardPrev() {

}