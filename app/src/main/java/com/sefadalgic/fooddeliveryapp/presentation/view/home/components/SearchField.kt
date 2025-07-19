package com.sefadalgic.fooddeliveryapp.presentation.view.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography


@Composable
fun SearchField(modifier: Modifier = Modifier) {
    var searchValue by remember { mutableStateOf(value = "") }

    TextField(
        modifier = Modifier.fillMaxWidth().padding(
            top = 18.dp
        ),
        value = searchValue,
        shape = RoundedCornerShape(12.dp),
        placeholder = {
            Text(
                text = stringResource(R.string.searchHint),
                modifier = Modifier.padding(
                    start = 8.dp
                ),
                style = AppTypography.bodyMedium.copy(
                    color = colorResource(R.color.icealanding_blue)
                ),
            )
        },
        prefix = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = colorResource(R.color.icealanding_blue)
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = colorResource(R.color.cultured),
            unfocusedContainerColor = colorResource(R.color.cultured),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            ),
        onValueChange = {
            searchValue = it
        }
    )

}