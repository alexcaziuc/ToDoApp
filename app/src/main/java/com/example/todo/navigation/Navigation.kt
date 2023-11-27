package com.example.todo.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todo.navigation.destinations.listComposable
import com.example.todo.navigation.destinations.splashComposable
import com.example.todo.navigation.destinations.taskComposable
import com.example.todo.ui.viewmodels.SharedViewModel
import com.example.todo.util.Constants.LIST_SCREEN
import com.example.todo.util.Constants.SPLASH_SCREEN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable (
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}