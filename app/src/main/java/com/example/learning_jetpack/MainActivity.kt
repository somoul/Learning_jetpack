package com.example.learning_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.learning_jetpack.ui.test_ui.TestScaffold
//import com.example.learning_jetpack.ui.test.TestButtomScreen
//import com.example.learning_jetpack.ui.test.TestContent
import com.example.learning_jetpack.ui.theme.Learning_jetpackTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val items = mutableListOf<String>("C","D")
            val item1= mutableListOf<Int>(1,2)
            val genericMap: Map<String,Int> = mapOf<String,Int>("A" to 1,"B" to 2)

            Learning_jetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White,

                ) {

//                    TestContent()
//                    ImageProFile()
//                    TestButtomScreen()

                    TestScaffold()

                }

            }
        }
    }
}


