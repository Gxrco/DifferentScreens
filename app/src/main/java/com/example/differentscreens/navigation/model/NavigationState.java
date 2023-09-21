package com.example.differentscreens.navigation.model;

sealed class NavigationState(routeName: String) {
    object Concerts: NavigationState("Concerts")
    object Detail: NavigationState("Detail")
    object Favorites: NavigationState("Favorites")
    object Profile: NavigationState("Profile")
}

