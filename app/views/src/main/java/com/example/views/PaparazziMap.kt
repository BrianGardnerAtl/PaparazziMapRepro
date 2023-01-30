package com.example.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.maps.android.compose.GoogleMap

@Composable
fun PaparazziMap() {
    GoogleMap(
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
fun Default() {
    MaterialTheme {
        PaparazziMap()
    }
}