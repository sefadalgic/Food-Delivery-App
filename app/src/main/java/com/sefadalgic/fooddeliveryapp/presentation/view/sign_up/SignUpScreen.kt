package com.sefadalgic.fooddeliveryapp.presentation.view.sign_up

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthHeader
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthTextFieldWithLabeledText
import com.sefadalgic.fooddeliveryapp.ui.components.CustomElevatedButton

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(R.color.opulent_green))
    ) {
        AuthHeader(
            title = stringResource(R.string.signUp),
            subtitle = stringResource(R.string.signUpSubtitle)
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
                var nameValue by remember { mutableStateOf("") }
                var emailValue by remember { mutableStateOf("") }
                var passwordValue by remember { mutableStateOf(value = "") }
                var repasswordValue by remember { mutableStateOf(value = "") }

                AuthTextFieldWithLabeledText(
                    value = nameValue,
                    onValueChanged = {
                        nameValue = it
                    },
                    labelText = stringResource(R.string.name),
                    keyboardType = KeyboardType.Text,

                    placeholderValue = stringResource(R.string.nameHint),

                    )

                AuthTextFieldWithLabeledText(
                    modifier = Modifier.padding(
                        vertical = 16.dp
                    ),
                    value = emailValue,
                    onValueChanged = {
                        emailValue = it
                    },
                    labelText = stringResource(R.string.mail),
                    keyboardType = KeyboardType.Text,
                    placeholderValue = stringResource(R.string.exampleMail),
                )

                AuthTextFieldWithLabeledText(
                    value = passwordValue,
                    onValueChanged = {
                        passwordValue = it
                    },
                    labelText = stringResource(R.string.password),
                    keyboardType = KeyboardType.Password,
                    placeholderValue = stringResource(R.string.passwordHint),
                )

                AuthTextFieldWithLabeledText(
                    modifier = Modifier.padding(top = 16.dp),
                    value = repasswordValue,
                    onValueChanged = {
                        repasswordValue = it
                    },
                    labelText = stringResource(R.string.retypePassword),
                    keyboardType = KeyboardType.Password,
                    isPasswordField = true,
                    placeholderValue = stringResource(R.string.passwordHint),
                )

                CustomElevatedButton(
                    modifier = Modifier.padding(
                        top = 32.dp
                    ),
                    title = stringResource(R.string.signUp),
                    onClick =  {}
                )


            }
        }
    }


}

@Preview(showBackground = true)
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen()
}