package com.example.learning_jetpack.ui.test_ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning_jetpack.ui.theme.Learning_jetpackTheme


@Composable
fun TestContent() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Text1", color= MaterialTheme.colors.onSurface, modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .weight(1f))
        Text(text = "Text1", modifier = Modifier.weight(0.5f))
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TestContentPreview() {
    Learning_jetpackTheme {
        TestContent()
    }
}