package com.example.dessertrelease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.dessertrelease.ui.DessertReleaseApp
import com.example.dessertrelease.ui.theme.DessertReleaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DessertReleaseTheme {
                DessertReleaseApp()
            }
        }
    }
}
