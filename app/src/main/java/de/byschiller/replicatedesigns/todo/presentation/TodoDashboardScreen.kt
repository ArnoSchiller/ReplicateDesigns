package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.layout.Box
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
fun TodoDashboardScreen(
    navController: NavController,
    colorScheme: ColorScheme
) {
    val targetScreen = TodoNavRoutes.Welcome
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Button(onClick = {
            navController.navigate(targetScreen.route)
        }) {
            Text(text = "Go to ${stringResource(id = targetScreen.title)}")
        }
    }

}