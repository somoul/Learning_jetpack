package com.example.learning_jetpack.ui.test_ui

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning_jetpack.ui.theme.Learning_jetpackTheme

@Composable
fun ImageProFile() {
    Box(
        Modifier
            .clip(CircleShape)
            .size(100.dp)
            .background(Color.Blue),
            contentAlignment=Alignment.Center) {
    }



}
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ShowImageProFile() {
    Learning_jetpackTheme {
        ImageProFile()
    }


}