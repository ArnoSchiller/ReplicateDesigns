package de.byschiller.replicatedesigns.todo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import de.byschiller.replicatedesigns.R

sealed class TodoNavRoutes(private val relRoute: String, val title: Int) {
    companion object {
        const val baseRoute = "todo"
    }

    val route: String = "$baseRoute/$relRoute"

    object Welcome : TodoNavRoutes("welcome", R.string.todo_welcome_title)
    object Login : TodoNavRoutes("login", R.string.todo_login_title)
    object Register : TodoNavRoutes("register", R.string.todo_register_title)
    object Dashboard : TodoNavRoutes("dashboard", R.string.todo_dashboard_title)
}
