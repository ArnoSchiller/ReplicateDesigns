package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import de.byschiller.replicatedesigns.todo.navigation.TodoNavRoutes

@Composable
fun TodoRegisterScreen(
    navController: NavController,
    colorScheme: ColorScheme
) {
    val dashboardScreen = TodoNavRoutes.Dashboard
    val loginScreen = TodoNavRoutes.Login

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Button(onClick = {
                navController.navigate(dashboardScreen.route)
            }) {
                Text(text = "Go to ${stringResource(id = dashboardScreen.title)}")
            }

            Button(onClick = {
                navController.navigate(loginScreen.route)
            }) {
                Text(text = "Go to ${stringResource(id = loginScreen.title)}")
            }
        }
    }
}