package com.sefadalgic.fooddeliveryapp.presentation.navigation

sealed class RouteScreen(val route: String) {
    data object Splash: RouteScreen("/splash")
    data object Onboarding: RouteScreen("/onboarding")
    data object Home: RouteScreen("/home")

}