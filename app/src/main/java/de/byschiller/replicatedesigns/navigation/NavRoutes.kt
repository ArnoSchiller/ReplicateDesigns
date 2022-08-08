package de.byschiller.replicatedesigns.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import de.byschiller.replicatedesigns.R

sealed class NavRoutes(val route: String, val title: Int, val icon: ImageVector) {
    object Home : NavRoutes("home", R.string.home_title, Icons.Filled.Home)
}
