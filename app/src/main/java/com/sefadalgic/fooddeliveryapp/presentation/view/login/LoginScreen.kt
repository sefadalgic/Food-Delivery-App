package com.sefadalgic.fooddeliveryapp.presentation.view.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthHeader
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthTextFieldWithLabeledText
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.SocialLoginIconButton
import com.sefadalgic.fooddeliveryapp.ui.components.CustomElevatedButton
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
                    modifier = Modifier.padding(top = 24.dp),
                    value = password,
                    onValueChanged = {
                        password = it
                    },
                    labelText = stringResource(R.string.password),
                    placeholderValue = stringResource(R.string.passwordHint),
                    keyboardType = KeyboardType.Password,
                    isPasswordField = true
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 24.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {

                    RememberMeCheckbox()

                    Text(
                        text = stringResource(R.string.forgotPassword),
                        style = AppTypography.bodyLarge.copy(
                            color = colorResource(R.color.royal_oranje)
                        ),
                    )
                }

                CustomElevatedButton(
                    modifier = Modifier.padding(top = 42.dp),
                    onClick = {},
                    title = stringResource(R.string.login)
                )

                Row(
                    modifier = Modifier.fillMaxWidth().padding(
                        top = 32.dp
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        stringResource(R.string.dontHaveAccount), style = AppTypography.bodyMedium.copy(
                        color = colorResource(R.color.spaceman)
                    ))

                    Text(
                        stringResource(R.string.signUp),
                        modifier = Modifier.padding(
                            start = 6.dp
                        ),
                        style = AppTypography.bodyMedium.copy(
                            fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.royal_oranje),
                    ))
                }


                Text(text = stringResource(R.string.or),
                    textAlign = TextAlign.Center,
                    style = AppTypography.bodyMedium.copy(
                        color = colorResource(R.color.spaceman)
                    ),
                    modifier = Modifier.
                padding(top = 32.dp).fillMaxWidth())

                Row(
                    modifier = Modifier.fillMaxWidth().padding(
                        top = 32.dp
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    SocialLoginIconButton(resId = R.drawable.facebook) { }
                    SocialLoginIconButton(resId = R.drawable.twitter) { }
                    SocialLoginIconButton(resId = R.drawable.apple) { }

                }
            }
        }
    }
}


@Composable
fun RememberMeCheckbox(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }

    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .background(
                    color = if (checked) colorResource(R.color.royal_oranje) else colorResource(R.color.alicia_blue),
                    shape = RoundedCornerShape(6.dp)
                )
                .padding(4.dp)
                .clickable {
                    checked = !checked
                }) {
            if (checked) Icon(
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = colorResource(R.color.white)

            )
        }

        Text(
            text = stringResource(R.string.rememeberMe),
            style = TextStyle(
                color = colorResource(R.color.icealanding_blue)
            ), modifier = Modifier.padding(start = 10.dp)
        )
    }


}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenPreview() {
    LoginScreen()
}