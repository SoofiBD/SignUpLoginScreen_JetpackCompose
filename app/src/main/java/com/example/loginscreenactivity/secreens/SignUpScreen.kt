package com.example.loginscreenactivity.secreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginscreenactivity.R
import com.example.loginscreenactivity.components.HeadingTextComponents
import com.example.loginscreenactivity.components.NormalTextComponents



@Composable
fun SignUpScreen() {

    Surface(color = Color.White,
    modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(28.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                NormalTextComponents(value = stringResource(id = R.string.hello))
                HeadingTextComponents(value = stringResource(id = R.string.crate_account))

            }
    }
}

@Preview
@Composable
fun DefaulPreviewOffSignUpScreen() {
    SignUpScreen()
}