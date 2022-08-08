package de.byschiller.replicatedesigns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import de.byschiller.replicatedesigns.navigation.NavRoutes
import de.byschiller.replicatedesigns.navigation.NavigationContainer
import de.byschiller.replicatedesigns.ui.theme.ReplicateDesignsTheme

class MainActivity : ComponentActivity() {

    private var overrideColorScheme: ColorScheme? = null
    fun updateColorScheme(scheme: ColorScheme?) {
        overrideColorScheme = scheme
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            ReplicateDesignsTheme(
                overrideColorScheme = overrideColorScheme
            ) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationContainer()
                }
            }
        }
    }
}

@Composable
fun Home(navController: NavHostController) {

    // change this to the new package
    val targetProject = NavRoutes.Todo
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = "This is ${stringResource(id = NavRoutes.Home.title)}!")

            Button(onClick = {
                navController.navigate(targetProject.route)
            }) {
                Text(text = "Go to ${stringResource(id = targetProject.title)}")
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReplicateDesignsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            NavigationContainer()
        }
    }
}