package com.sefadalgic.fooddeliveryapp.presentation.component.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SocialLoginIconButton(resId: Int, onClick: () -> Unit) {
    Image(
        modifier = Modifier.size(60.dp).clickable(onClick = onClick),
        painter = painterResource(resId),
        contentDescription = null
    )
}