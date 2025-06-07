package com.sefadalgic.fooddeliveryapp.presentation.view.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.components.CustomElevatedButton
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography
import com.sefadalgic.fooddeliveryapp.ui.theme.CustomAppTheme
import java.util.Locale

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun OnboardingScreen () {
    Column(
        modifier = Modifier.
            fillMaxSize().background(Color.White).
        padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(modifier = Modifier.size(80.dp))
        GlideImage(
            model = "",
            contentDescription = "onboarding_image",
            modifier = Modifier.clip(RoundedCornerShape(12.dp)).

            size(240.dp, 292.dp),

            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.size(32.dp))

        Text(text = stringResource(R.string.onboarding_title_1),
            color = colorResource(R.color.parisian_night),
            style = AppTypography.titleLarge,
            fontWeight = FontWeight.ExtraBold
           )

        Spacer(modifier = Modifier.size(16.dp))

        Text(modifier = Modifier.weight(1f),
            text = stringResource(R.string.onboarding_description_1,),
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center,
            color = colorResource(R.color.spaceman)
        )

        // TODO: Add a page indicator
        CustomElevatedButton(
            onClick = {
                // TODO: Go to next onboarding page
            },
            title = stringResource(R.string.next).uppercase()
        )

        TextButton(onClick = {
            // TODO: Skip this onboarding
        }) {
            Text(stringResource(R.string.skip), style = AppTypography.bodyMedium, color = colorResource(R.color.spaceman))
        }
    }

}

@Composable
@Preview
fun OnboardingPreview () {
    CustomAppTheme {
        OnboardingScreen()
    }
}