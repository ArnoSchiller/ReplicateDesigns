package de.byschiller.replicatedesigns.navigation

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.byschiller.replicatedesigns.Home
import de.byschiller.replicatedesigns.todo.navigation.todoGraph

@Composable
fun NavigationContainer(
    //onColorSchemeChanged: (scheme: ColorScheme) -> Unit
) {

    val navItems = listOf(
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

        // include navigation graphs
        todoGraph(navController)
    }

}