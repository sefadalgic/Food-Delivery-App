package com.sefadalgic.fooddeliveryapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun CustomElevatedButton(onClick: () -> Unit, title: String) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(R.color.royal_oranje)
        ),
        shape = RoundedCornerShape(size = 12.dp),
        onClick = onClick) {
        Text(title, style = AppTypography.titleSmall)
    }
}

