package com.example.loginscreenactivity.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginscreenactivity.R
import com.example.loginscreenactivity.ui.theme.TextColor
import java.time.format.TextStyle

@Composable
fun NormalTextComponents(value: String) {
    Text(
        text =value,modifier = Modifier
            .fillMaxSize()
            .heightIn(min = 40.dp),
        style = androidx.compose.ui.text.TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            fontStyle = FontStyle.Normal,
        )
    ,color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )

}


@Composable
fun HeadingTextComponents(value: String) {
    Text(
        text =value,modifier = Modifier
            .fillMaxSize()
            .heightIn(),
        style = androidx.compose.ui.text.TextStyle(
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontStyle = FontStyle.Normal,
        )
        ,color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )

}