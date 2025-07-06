package com.sefadalgic.fooddeliveryapp.presentation.view.verify

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefadalgic.fooddeliveryapp.R
import com.sefadalgic.fooddeliveryapp.core.utils.Size
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.AuthHeader
import com.sefadalgic.fooddeliveryapp.presentation.component.auth.VerifyCodeTextField
import com.sefadalgic.fooddeliveryapp.ui.components.CustomElevatedButton
import com.sefadalgic.fooddeliveryapp.ui.theme.AppTypography

@Composable
fun VerifyScren() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(R.color.opulent_green))
    ) {
        val mail = ""

        AuthHeader(
            title = stringResource(R.string.verification), subtitle = "${stringResource(R.string.verificationSubtitle)} \n $mail"
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

                Row (
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        stringResource(R.string.code),
                        style = AppTypography.bodyMedium.copy(
                            color = colorResource(R.color.parisian_night)
                        ),
                    )

                    Text(
                        stringResource(R.string.resendCode),
                        style = AppTypography.bodyMedium,
                    )

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val focusRequesterFirst = remember { FocusRequester() }
                    val focusRequesterSecond = remember { FocusRequester() }
                    val focusRequesterThird = remember { FocusRequester() }
                    val focusRequesterFourth = remember { FocusRequester() }

                    var codeValueFirst by remember { mutableStateOf("") }
                    var codeValueSecond by remember { mutableStateOf("") }
                    var codeValueThird by remember { mutableStateOf("") }
                    var codeValueFourth by remember { mutableStateOf("") }


                    VerifyCodeTextField(
                        value = codeValueFirst, onValueChange = {
                            codeValueFirst = it
                            if (it.length == 1) focusRequesterSecond.requestFocus()
                        }, focusRequester = focusRequesterFirst
                    )
                    VerifyCodeTextField(
                        value = codeValueSecond, onValueChange = {
                            codeValueSecond = it
                            if (it.length == 1) focusRequesterThird.requestFocus()
                        }, focusRequester = focusRequesterSecond
                    )
                    VerifyCodeTextField(
                        value = codeValueThird, onValueChange = {
                            codeValueThird = it
                            if (it.length == 1) focusRequesterFourth.requestFocus()
                        }, focusRequester = focusRequesterThird
                    )

                    VerifyCodeTextField(
                        value = codeValueFourth, onValueChange = {
                            codeValueFourth = it
                            if (it.length == 1) {
                                // TODO Send Code
                            }
                        }, focusRequester = focusRequesterFourth
                    )

                }
                CustomElevatedButton(
                    title = stringResource(R.string.verify),
                    onClick = {},
                    modifier = Modifier.padding(top = 32.dp)
                )
            }
        }
    }

}


@Preview
@Composable
private fun VerifyScreenPreview() {
    VerifyScren()
}