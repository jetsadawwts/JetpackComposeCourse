package com.jetsada.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetsada.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

class RowColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //เเนวตั้ง
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceAround) {
//                Text(text = "Hello")
//                Text(text = "World")
//                Text(text = "World")
//            }

            //เเนวนอน
            Row(modifier = Modifier
//                .fillMaxSize()
                .width(300.dp)
                .fillMaxHeight(0.7f)
//                .height(300.dp)
                .background(Color.Green),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "World")
            }
        }
    }
}

/*
              * horizontalAlignment (ปรับพื้นที่เเนวนอน)
                - Alignment = เช็ตตำเเหน่งเเนวนอน

              * horizontalArrangement (ปรับตำเเหน่งไอเทมเเนวนอน)
                - Arrangement = เช็ตตำเเหน่งเเนวนอน

              * verticalAlignment (ปรับพื้นที่เเนวตั้ง)
                - Alignment = เช็ตตำเเหน่งเเนวนอน

              * verticalArrangement (ปรับตำเเหน่งไอเทมเเนวตั้ง)
                - Arrangement = เช็ตตำเเหน่งเเนวตั้ง

              * modifier (ปรับเเต่ง)
                .background(Color.สีที่ต้องการ) = สีพื้นหลัง
                .fillMaxSize() = ขนาดไซด์โดยรวม เปอร์เซ็นต์
                .fillMaxHeight() = ขนาดความสูง เปอร์เซ็นต์
                .fillMaxWidth() = ขนาดความยาว เปอร์เซ็นต์
                .height = ความสูง
                .width = ความยาว
          */





