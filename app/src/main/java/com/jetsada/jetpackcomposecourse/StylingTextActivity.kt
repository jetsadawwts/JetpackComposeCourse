package com.jetsada.jetpackcomposecourse


import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.jetsada.jetpackcomposecourse.R

class StylingTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            val fontFamily = FontFamily(
                Font(R.font.lexendthin, FontWeight.Thin),
                Font(R.font.lexendlight, FontWeight.Light),
                Font(R.font.lexendregular, FontWeight.Normal),
                Font(R.font.lexendmedium, FontWeight.Medium),
                Font(R.font.lexendsemibold, FontWeight.SemiBold),
                Font(R.font.lexendbold, FontWeight.Bold),
                Font(R.font.lexendextrabold, FontWeight.ExtraBold),
            )
        setContent {
          Box(modifier = Modifier
              .fillMaxSize()
              .background(Color(0xFF101010))) {
              Text(
                  text = buildAnnotatedString {
                     withStyle(
                         style = SpanStyle(
                             color = Color.Green,
                             fontSize = 50.sp
                         )
                     ) {
                         append("J")
                     }
                      append("etpack")
                      withStyle(
                          style = SpanStyle(
                              color = Color.Green,
                              fontSize = 50.sp
                          )
                      ) {
                          append("C")
                      }
                      append("etpack")
                      append("ompose")
                  },

                  color = Color.White,
                  fontSize = 30.sp,
                  fontFamily = fontFamily,
                  fontWeight = FontWeight.Bold,
                  fontStyle = FontStyle.Italic,
                  textAlign = TextAlign.Center,
                  textDecoration = TextDecoration.Underline
              )
          }
        }
    }
}








