package com.sefadalgic.fooddeliveryapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sefadalgic.fooddeliveryapp.presentation.view.onboarding.OnboardingScreen
import com.sefadalgic.fooddeliveryapp.presentation.view.splash.SplashScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = RouteScreen.Splash.route
    ) {
        composable(route = RouteScreen.Splash.route) {
            SplashScreen()
        }
        composable(route = RouteScreen.Onboarding.route) {
            OnboardingScreen()
        }
    }
}