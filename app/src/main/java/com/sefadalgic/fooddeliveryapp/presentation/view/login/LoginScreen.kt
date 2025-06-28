package com.sefadalgic.fooddeliveryapp.presentation.view.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Surface
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthHeader
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthTextFieldWithLabeledText
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(R.color.opulent_green))

    ) {
        AuthHeader(
            title = stringResource(R.string.loginTitle),
            subtitle = stringResource(R.string.loginSubtitle)
        )

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = Size().height(0.29f).dp),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            color = Color.White,
            tonalElevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp)
            ) {

                var email by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                AuthTextFieldWithLabeledText(
                    value = email,
                    onValueChanged = {
                        email = it
                    },
                    labelText = stringResource(R.string.mail),
                    placeholderValue = stringResource(R.string.exampleMail),
                    keyboardType = KeyboardType.Email
                )

                AuthTextFieldWithLabeledText(
                    modifier = Modifier.padding(top = 16.dp),
                    value = password,
                    onValueChanged = {
                        password = it
                    },
                    labelText = stringResource(R.string.password),
                    placeholderValue = stringResource(R.string.passwordHint),
                    keyboardType = KeyboardType.Password,
                    isPasswordField = true
                )
            }
        }


    }
}



@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenPreview() {
    LoginScreen()
}