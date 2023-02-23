package com.example.learning_jetpack.ui.test_ui

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning_jetpack.ui.theme.Learning_jetpackTheme

@Composable
fun TestButtomScreen() {

    Row(
        horizontalArrangement= Arrangement.Center,

        verticalAlignment=Alignment.CenterVertically,

    ) {
        Button(
            border= BorderStroke(0.1.dp,Color.Black),
            shape = RoundedCornerShape(20),
            modifier = Modifier
                .width(100.dp)
                .height(50.dp),
            onClick = { /* ... */ },

        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite",
                modifier = Modifier.size(ButtonDefaults.IconSize),
                tint = Color.White
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Like", style = TextStyle(Color.White))
        }
        Spacer(modifier = Modifier.padding(start = 20.dp))
        Button(
            border= BorderStroke(0.1.dp,Color.Black),

            shape = RoundedCornerShape(20),
            modifier = Modifier
                .width(100.dp)
                .height(50.dp),
            onClick = { /* ... */ },

        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite",
                modifier = Modifier.size(ButtonDefaults.IconSize),
                tint = Color.White

            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Like", style = TextStyle(Color.White))
        }

    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowTestButtom() {
    Learning_jetpackTheme {
        TestButtomScreen()
    }

}