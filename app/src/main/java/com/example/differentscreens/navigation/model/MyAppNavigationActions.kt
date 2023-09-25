package com.example.differentscreens.navigation.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.differentscreens.R

class MyAppNavigationActions(private val navController: NavHostController){
    fun navigateTo(destination: MyAppTopLevelDestination){
        navController.navigate(destination.route){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
        }
    }
}

data class MyAppTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconTextId: Int
    )

val TOP_LEVEL_DESTINATIONS = listOf(
    MyAppTopLevelDestination(
        route = MyAppRoute.CONCERTS,
        selectedIcon = Icons.Default.Home,
        iconTextId = R.string.concerts
    ),
    MyAppTopLevelDestination(
        route = MyAppRoute.PROFILE,
        selectedIcon = Icons.Default.Person,
        iconTextId = R.string.profile
    ),
    MyAppTopLevelDestination(
        route = MyAppRoute.FAVORITES,
        selectedIcon = Icons.Default.Star,
        iconTextId = R.string.favorites
    )

)

object MyAppRoute {
    const val CONCERTS = "concerts"
    const val PROFILE = "profile"
    const val FAVORITES = "favorites"
}