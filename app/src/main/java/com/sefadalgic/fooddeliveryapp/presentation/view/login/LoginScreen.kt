package com.sefadalgic.fooddeliveryapp.presentation.view.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.ResponsiveSize

import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.presentation.component.AuthHeader
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun LoginScreen (){
    Column(
    ) {
        AuthHeader(
            title = stringResource(R.string.loginTitle),
            subtitle = stringResource(R.string.loginSubtitle)
        )
    }
}




@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenPreview () {
    LoginScreen()
}