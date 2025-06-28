package com.sefadalgic.fooddeliveryapp.presentation.component.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun AuthTextFieldWithLabeledText(
    modifier: Modifier = Modifier,
    value: String,
    onValueChanged: (String) -> Unit,
    labelText: String, placeholderValue: String, keyboardType: KeyboardType, isPasswordField: Boolean = false) {

    var isObscure by remember { mutableStateOf(true) }

    Column(
        modifier = modifier
    ) {
        Text(text = labelText,  style = AppTypography.bodyLarge)

        TextField(
            value = value,
            singleLine = true,
            trailingIcon = if (isPasswordField) {
                {
                    IconButton(
                        colors = IconButtonDefaults.iconButtonColors(
                            contentColor = colorResource(R.color.icealanding_blue)
                        ),
                        onClick = { isObscure = !isObscure })
                    {
                        Icon(
                            imageVector = if (isObscure) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                            contentDescription = null,
                        )
                    }
                }
            } else null,

            placeholder = {
                Text(
                    placeholderValue,
                    style = AppTypography.bodyMedium,
                    color = colorResource(R.color.icealanding_blue)
                )
            },
            visualTransformation = if (isObscure && isPasswordField) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(

                keyboardType = keyboardType),
            shape = RoundedCornerShape(10.dp), colors = TextFieldDefaults.colors(
                focusedContainerColor = colorResource(R.color.alicia_blue),
                unfocusedContainerColor = colorResource(R.color.alicia_blue),
                disabledContainerColor = colorResource(R.color.alicia_blue),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                focusedTextColor = colorResource(R.color.icealanding_blue),
                unfocusedTextColor = colorResource(R.color.icealanding_blue),
                disabledTextColor = colorResource(R.color.icealanding_blue)

            ), onValueChange = { newValue ->
                onValueChanged(newValue)
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        )

    }
}
