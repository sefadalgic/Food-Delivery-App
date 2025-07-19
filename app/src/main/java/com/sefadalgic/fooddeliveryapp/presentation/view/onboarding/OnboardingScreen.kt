package com.sefadalgic.fooddeliveryapp.presentation.view.onboarding

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.data.model.OnboardingData
import com.sefadalgic.fooddeliveryapp.data.repository.onboardingData
import com.sefadalgic.fooddeliveryapp.presentation.navigation.LocalNavController
import com.sefadalgic.fooddeliveryapp.presentation.navigation.RouteScreen
import com.sefadalgic.fooddeliveryapp.ui.components.CustomElevatedButton
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography
import com.sefadalgic.fooddeliveryapp.ui.theme.CustomAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun OnboardingScreen() {

     val onboardingList = onboardingData


    val pagerState = rememberPagerState{
        onboardingList.size
    }

    val coroutineScope: CoroutineScope = rememberCoroutineScope()

    val navController = LocalNavController.current


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().background(color = colorResource(R.color.bleached_silk)).padding(16.dp)
    ) {
        HorizontalPager(
            state = pagerState,
//            modifier = Modifier.weight(1f)
        ) { page ->
            OnboardingPageContent(onboardingList[page])
        }



        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.Start)

        ) {
            repeat(onboardingList.size) { index ->
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(colorResource(if (index == pagerState.currentPage) R.color.royal_oranje else R.color.melted_marshmellow))
                        .size(8.dp)
                )
            }

        }
        Spacer(modifier = Modifier.weight(1f))


        CustomElevatedButton(
            onClick = {
                coroutineScope.launch {
                    if (pagerState.currentPage < onboardingData.size - 1) {
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    }else {
                        navController.navigate(RouteScreen.Home.route)
                    }

                }
            },
            title = if (pagerState.currentPage == onboardingList.size - 1) stringResource(R.string.get_started).uppercase() else stringResource(R.string.next).uppercase()
        )

        TextButton(onClick = {
            coroutineScope.launch {
                pagerState.animateScrollToPage(onboardingList.size - 1)
            }
        }) {
            Text(stringResource(R.string.skip), style = AppTypography.bodyMedium, color = colorResource(R.color.spaceman))
        }
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun OnboardingPageContent (model: OnboardingData) {
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Spacer(modifier = Modifier.size(80.dp))

        GlideImage(
            model = "",
            contentDescription = "onboarding_image",
            modifier = Modifier.clip(RoundedCornerShape(12.dp)).

            size(300.dp, 400.dp),

            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.size(36.dp))

        Text(text = model.title,
            color = colorResource(R.color.parisian_night),
            style = AppTypography.titleLarge,
            fontWeight = FontWeight.ExtraBold
           )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = model.description,
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center,
            color = colorResource(R.color.spaceman)
        )


    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun OnboardingPreview () {
    CustomAppTheme {
        OnboardingScreen()
    }
}