package com.sefadalgic.fooddeliveryapp.core.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Size {
    @Composable
    fun height(ratio : Float): Float {
        val configuration = LocalConfiguration.current
        return configuration.screenHeightDp * ratio
    }
    @Composable
    fun width(ratio: Float): Float {
        val configuration = LocalConfiguration.current
        return configuration.screenWidthDp * ratio
    }
}



class ResponsiveSize(
    private val screenWidthDp: Int, private val screenHeightDp: Int
) {

    fun widthRatio(ratio: Float): Dp = (screenWidthDp * ratio).dp

    fun heightRatio(ratio: Float): Dp = (screenHeightDp * ratio).dp
}

@Composable
fun rememberResponsiveSize(): ResponsiveSize {
    val configuration = LocalConfiguration.current
    return ResponsiveSize(
        screenWidthDp = configuration.screenWidthDp, screenHeightDp = configuration.screenHeightDp
    )
}
