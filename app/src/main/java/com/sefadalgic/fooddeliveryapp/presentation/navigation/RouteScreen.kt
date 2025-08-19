package com.sefadalgic.fooddeliveryapp.presentation.navigation

sealed class RouteScreen(val route: String) {
    data object Splash : RouteScreen("/splash")
    data object Onboarding : RouteScreen("/onboarding")
    data object Home : RouteScreen("/home")
    data object CategoryDetail : RouteScreen("/categoryDetail/{id}/{name}") {
        fun createRoute(id: Int, name: String): String{
            val encodedName = java.net.URLEncoder.encode(name, "UTF-8")
            return "/categoryDetail/$id/$encodedName"
        }
    }

}