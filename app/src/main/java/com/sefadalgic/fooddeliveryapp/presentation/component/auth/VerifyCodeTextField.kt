package com.sefadalgic.fooddeliveryapp.presentation.component.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun VerifyCodeTextField(value: String, onValueChange: (String) -> Unit, focusRequester: FocusRequester) {
    Box(
        modifier = Modifier
            .size(width = 70.dp, height = 80.dp)
            .background(
                color = colorResource(R.color.alicia_blue),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .focusRequester(focusRequester),
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            maxLines = 1,

            textStyle = AppTypography.titleLarge.copy(
                textAlign = TextAlign.Center,
                color = colorResource(R.color.spaceman)
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )

    }

}