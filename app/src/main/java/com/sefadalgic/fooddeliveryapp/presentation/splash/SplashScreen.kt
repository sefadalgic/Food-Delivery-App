package com.sefadalgic.fooddeliveryapp.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.ResponsiveSize
import com.sefadalgic.fooddeliveryapp.core.utils.rememberResponsiveSize
import com.sefadalgic.fooddeliveryapp.ui.theme.BackgroundColor

@Composable
@Preview
fun SplashScreen() {
    val size = rememberResponsiveSize()

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = BackgroundColor
            )
    ) {
        Image(
            painter = painterResource(R.drawable.splash_ellipse1),
            contentDescription = null,
            modifier = Modifier
                .size(size.heightRatio(0.15f))
                .align(
                    alignment = Alignment.Start
                )
        )
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = stringResource(R.string.app_logo),
            modifier = Modifier.size(size.heightRatio(0.135f))
        )
        Image(
            painter = painterResource(R.drawable.splash_ellipse2),
            contentDescription = null,
            modifier = Modifier
                .size(size.heightRatio(0.15f))
                .align(
                    alignment = Alignment.End
                )
        )
    }
}