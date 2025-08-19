package com.sefadalgic.fooddeliveryapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.sefadalgic.fooddeliveryapp.presentation.view.category_detail.CategoryDetailScreen
import com.sefadalgic.fooddeliveryapp.presentation.view.home.HomeScreen
import com.sefadalgic.fooddeliveryapp.presentation.view.onboarding.OnboardingPageContent
import com.sefadalgic.fooddeliveryapp.presentation.view.onboarding.OnboardingScreen
import com.sefadalgic.fooddeliveryapp.presentation.view.splash.SplashScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = RouteScreen.Home.route
    ) {
        composable(route = RouteScreen.Splash.route) {
            SplashScreen()
        }
        composable(route = RouteScreen.Onboarding.route) {
            OnboardingScreen()
        }

        composable(route = RouteScreen.Home.route) {
            HomeScreen()
        }
        composable(route = RouteScreen.CategoryDetail.route,  arguments = listOf(
            navArgument("id") { type = NavType.IntType },
            navArgument("name") { type = NavType.StringType }

        ) ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getInt("id")
            val categoryNameEncoded = backStackEntry.arguments?.getString("name")
            val categoryName = categoryNameEncoded?.let { java.net.URLDecoder.decode(it, "UTF-8") }

            if (categoryName != null && categoryId != null) {
                CategoryDetailScreen(categoryName = categoryName, categoryId = categoryId)
            }
        }
    }
}