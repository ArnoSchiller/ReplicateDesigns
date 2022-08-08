package de.byschiller.replicatedesigns.todo.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import de.byschiller.replicatedesigns.todo.TodoColorScheme
import de.byschiller.replicatedesigns.todo.presentation.TodoDashboardScreen
import de.byschiller.replicatedesigns.todo.presentation.TodoLoginScreen
import de.byschiller.replicatedesigns.todo.presentation.TodoRegisterScreen
import de.byschiller.replicatedesigns.todo.presentation.TodoWelcomeScreen

fun NavGraphBuilder.todoGraph(navController: NavController) {
    val colorScheme = TodoColorScheme
    navigation(
        startDestination = TodoNavRoutes.Welcome.route,
        route = TodoNavRoutes.baseRoute
    ) {
        composable(TodoNavRoutes.Welcome.route) { TodoWelcomeScreen(navController, colorScheme) }
        composable(TodoNavRoutes.Login.route) { TodoLoginScreen(navController, colorScheme) }
        composable(TodoNavRoutes.Register.route) { TodoRegisterScreen(navController, colorScheme) }
        composable(TodoNavRoutes.Dashboard.route) { TodoDashboardScreen(navController, colorScheme) }

    }
}