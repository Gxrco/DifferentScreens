package com.example.differentscreens.navigation.model

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = NavigationState.Concerts.routeName) {
        composable("Concerts") {

        }
        composable("Detail") {

        }
        composable("Favorites"){

        }
        composable("Profile"){

        }
    }
}