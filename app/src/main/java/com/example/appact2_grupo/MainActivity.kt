package com.example.appact2_grupo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appact2_grupo.ui.theme.AppACT2_GRUPOTheme
import com.example.appact2_grupo.uii.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppACT2_GRUPOTheme {
                HomeScreen()
            }
        }
    }
}