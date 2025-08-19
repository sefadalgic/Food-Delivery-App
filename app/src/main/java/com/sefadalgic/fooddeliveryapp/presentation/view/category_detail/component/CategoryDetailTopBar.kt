package com.sefadalgic.fooddeliveryapp.presentation.view.category_detail.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.presentation.navigation.LocalNavController
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryDetailTopBar(modifier: Modifier = Modifier) {

    val navController = LocalNavController.current

    TopAppBar(
        title = {
            Row {
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(16.dp)
                        )
                        .height(50.dp)
                        .background(color = colorResource(R.color.bright_gray))
                        .padding(horizontal = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.align(
                            alignment = Alignment.Center
                        )
                    ) {
                        Text(text = "Burger", style = AppTypography.bodyMedium.copy(
                            fontWeight = FontWeight.Bold
                        ))
                        Icon(
                            Icons.Default.ArrowDropDown,
                            tint = colorResource(R.color.royal_oranje),
                            contentDescription = null
                        )
                    }
                }

            }
        }, navigationIcon = {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(50.dp)
                    .background(color = colorResource(R.color.bright_gray))
                    .clickable(
                        onClick =  {
                            navController.popBackStack()
                        }
                    )
            ) {
                Icon(
                    Icons.Default.ChevronLeft,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    contentDescription = "Back"
                )
            }
        },

        actions = {
            Box(
                modifier =  Modifier.size(50.dp).clip(CircleShape).background(colorResource(R.color.black))
            ) {
                Icon(Icons.Default.Search,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    tint = colorResource(R.color.white), contentDescription = null)
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier =  Modifier.size(50.dp).clip(CircleShape).background(colorResource(R.color.bright_gray)).padding(12.dp)
            ) {
                Image(painter = painterResource(R.drawable.filter), modifier = Modifier.align(alignment = Alignment.Center).fillMaxSize(), contentDescription = null)
            }

        }

    )
}