package com.developerssays.islamicwallpaper.compounds

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextView(value:String)
{
    Text(text = value,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Black,
        fontSize = 10.sp,
        color = Color.White)
}