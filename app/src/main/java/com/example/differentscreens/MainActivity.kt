package com.example.differentscreens
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.differentscreens.navigation.model.MyAppNavigationActions
import com.example.differentscreens.navigation.model.MyAppRoute
import com.example.differentscreens.navigation.model.MyAppTopLevelDestination
import com.example.differentscreens.navigation.model.TOP_LEVEL_DESTINATIONS
import com.example.differentscreens.ui.theme.DifferentScreensTheme
import com.example.differentscreens.ui.concerts.view.Components
import com.example.differentscreens.ui.profile.view.ProfileScreen
import com.example.differentscreens.ui.favorites.view.ListConcerts

val components = Components()
val profile = ProfileScreen()
val listCon = ListConcerts()

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DifferentScreensTheme {

                val navController =  rememberNavController()
                val navigateAction = remember(navController){
                    MyAppNavigationActions(navController)
                }
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val finalDestination = navBackStackEntry?.destination?.route ?: MyAppRoute.CONCERTS
                
                MyAppContent(
                    navController = navController,
                    finalDestination = finalDestination,
                    navigateTopLevelDestination = navigateAction::navigateTo
                )
            }
        }
    }

    @Composable
    fun MyAppContent(
        modifier: Modifier = Modifier,
        navController: NavHostController,
        finalDestination: String,
        navigateTopLevelDestination: (MyAppTopLevelDestination) -> Unit
    ){
        Row(modifier = modifier.fillMaxSize()){
            Column(modifier = modifier.fillMaxSize()) {
                NavHost(
                    modifier = Modifier.weight(1f),
                    navController = navController,
                    startDestination =  MyAppRoute.CONCERTS
                ){
                    composable(MyAppRoute.CONCERTS){
                        components.MainContent()
                    }
                    composable(MyAppRoute.PROFILE){
                        profile.MainScreenProfile()
                    }
                    composable(MyAppRoute.FAVORITES){
                        listCon.BuildList()
                    }
                }
                MyAppBottomNavigation(
                    finalDestination = finalDestination,
                    navigateTopLevelDestination = navigateTopLevelDestination
                )
            }
        }
    }

    @Composable
    fun MyAppBottomNavigation(
        finalDestination: String,
        navigateTopLevelDestination: (MyAppTopLevelDestination) -> Unit
    ){
        NavigationBar(modifier = Modifier.fillMaxWidth()) {
            TOP_LEVEL_DESTINATIONS.forEach { destinations ->
                NavigationBarItem(
                    selected = finalDestination == destinations.route,
                    onClick = { navigateTopLevelDestination(destinations) },
                    icon = {
                        Icon(
                            imageVector = destinations.selectedIcon,
                            contentDescription = stringResource(id = destinations.iconTextId)
                        )
                    }
                )
            }
        }
    }

}
