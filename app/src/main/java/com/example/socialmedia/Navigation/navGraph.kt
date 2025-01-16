package com.example.socialmedia.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.socialmedia.screens.AddThreads
import com.example.socialmedia.screens.BottomNav
import com.example.socialmedia.screens.Home
import com.example.socialmedia.screens.Notification
import com.example.socialmedia.screens.Profile
import com.example.socialmedia.screens.Search
import com.example.socialmedia.screens.Splash

@Composable
fun NavGraph(navController: NavHostController){

    NavHost(navController =navController, startDestination = Routes.Splash.routes ) {

        composable(Routes.Splash.routes){
            Splash(navController)
        }


        composable(Routes.Home.routes){
           Home()
        }

        composable(Routes.Notification.routes){
            Notification()
        }

        composable(Routes.Search.routes){
            Search()
        }

        composable(Routes.Profile.routes){
            Profile()
        }

        composable(Routes.AddThreads.routes){
           AddThreads()
        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }
    }
}
