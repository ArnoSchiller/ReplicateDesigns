package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import de.byschiller.replicatedesigns.R
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

        Column(
            modifier = Modifier.padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_welcome), contentDescription = null
            )

            Text(
                text = stringResource(R.string.todo_welcome_headline),
                style = MaterialTheme.typography.titleSmall,
                color = colorScheme.onBackground
            )

            Text(
                text = stringResource(R.string.todo_welcome_content),
                style = MaterialTheme.typography.bodySmall,
                color = colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorScheme.primary),
                onClick = {
                    navController.navigate(targetScreen.route)
                }
            ) {
                Text(
                    modifier = Modifier
                        .padding(vertical = 15.dp),
                    text = stringResource(R.string.todo_welcome_cta),
                    style = MaterialTheme.typography.titleSmall,
                    color = colorScheme.onPrimary
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoWelcomeScreen_Preview() {
    TodoWelcomeScreen(rememberNavController(), TodoColorScheme)
}