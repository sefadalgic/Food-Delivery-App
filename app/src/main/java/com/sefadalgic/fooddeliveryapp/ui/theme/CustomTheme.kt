package com.sefadalgic.fooddeliveryapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sefadalgic.fooddeliveryapp.R


val senFontFamily = FontFamily(
    Font(R.font.sen_regular, FontWeight.Normal),
    Font(R.font.sen_medium, FontWeight.Medium),
    Font(R.font.sen_bold, FontWeight.Bold)
)

val AppTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = senFontFamily,

        fontWeight = FontWeight.Bold,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ), displayMedium = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ), displaySmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontFamily = senFontFamily,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ), headlineLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        fontFamily = senFontFamily,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ), headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontFamily = senFontFamily,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ), headlineSmall = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ), titleLarge = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ), titleMedium = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ), titleSmall = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ), bodyLarge = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ), bodyMedium = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ), bodySmall = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ), labelLarge = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ), labelMedium = TextStyle(
        fontFamily = senFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ), labelSmall = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 11.sp, lineHeight = 16.sp
    )
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF2196F3),
    onPrimary = Color.White,
    background = Color(0xFFF3F3F3),
    onBackground = Color.Black
)

@Composable
fun CustomAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme, typography = Typography, content = content
    )
}


