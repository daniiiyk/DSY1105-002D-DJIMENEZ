package com.example.app3.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app3.ui.RegistroScreen
import com.example.app3.ui.ResumenScreen
import com.example.app3.viewmodel.UsuarioViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    // crear el viewmodel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "registro"
    ) {
        composable("registro") {
            RegistroScreen(navController = navController, viewModel = usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(viewModel = usuarioViewModel)
        }
    }
}