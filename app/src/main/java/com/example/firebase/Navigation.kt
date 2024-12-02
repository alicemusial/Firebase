package com.example.firebase

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebase.pages.HomePage
import com.example.firebase.pages.LoginPage
import com.example.firebase.pages.SignupPage

@Composable
fun Navigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
   val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login", content = { LoginPage(modifier, navController, authViewModel) })
        composable("signup", content = { SignupPage(modifier, navController, authViewModel) })
        composable("home", content = { HomePage(modifier, navController, authViewModel) })
    }
    )
}