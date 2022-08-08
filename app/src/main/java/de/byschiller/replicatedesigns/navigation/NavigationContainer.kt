package de.byschiller.replicatedesigns.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.byschiller.replicatedesigns.Greeting
import de.byschiller.replicatedesigns.Home

@Composable
fun NavigationContainer() {

    val navItems = listOf(
        NavRoutes.Greeting,
        NavRoutes.Home
    )

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route,
        Modifier
    ) {

        composable(NavRoutes.Home.route) {
            Home(navController = navController)
        }
        composable(route = NavRoutes.Greeting.route) {
            Greeting(navController = navController, "test")
        }

        // include navigation graphs
    }

}