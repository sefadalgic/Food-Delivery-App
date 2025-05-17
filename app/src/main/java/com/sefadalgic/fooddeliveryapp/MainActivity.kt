package com.sefadalgic.fooddeliveryapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.presentation.splash.SplashScreen
import com.sefadalgic.fooddeliveryapp.ui.theme.FoodDeliveryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodDeliveryAppTheme {
                SplashScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .fillMaxSize()

            .background(color = Color.LightGray)
            .border(width = 5.dp, brush = Brush.horizontalGradient(
                colors = listOf(Color.Red, Color.Blue, Color.Green),
                startX = 0.0f,
                endX = 500.0f,
                tileMode = TileMode.Repeated
            ), shape = RectangleShape)


    ) {
        Text(
            text = "Hello Sefa $name!",
            modifier = modifier
        )
        Text(
            text = "Hello Sefa $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodDeliveryAppTheme {
        SplashScreen()
    }
}