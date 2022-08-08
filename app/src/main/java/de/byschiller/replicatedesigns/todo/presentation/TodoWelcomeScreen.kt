package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import de.byschiller.replicatedesigns.navigation.NavRoutes
import de.byschiller.replicatedesigns.todo.TodoColorScheme
import de.byschiller.replicatedesigns.todo.navigation.TodoNavRoutes

@Composable
fun TodoWelcomeScreen(
    navController: NavController,
    colorScheme: ColorScheme
) {

    val targetScreen = TodoNavRoutes.Login
    BackgroundWithCircles(colorScheme = colorScheme) {
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
}

@Preview(showBackground = true)
@Composable
fun TodoWelcomeScreen_Preview() {
    TodoWelcomeScreen(rememberNavController(), TodoColorScheme)
}