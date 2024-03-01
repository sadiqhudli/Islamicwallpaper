package com.developerssays.islamicwallpaper.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.developerssays.islamicwallpaper.model.getImages
import com.developerssays.islamicwallpaper.view.HomeScreen
import com.developerssays.islamicwallpaper.view.SplashScreen


@Composable
fun NavGraph(){
    val navController = rememberNavController()
    val list = getImages()

    NavHost(navController = navController, startDestination = Route.SPASHSCREEN.name )
    {
        composable(route = Route.SPASHSCREEN.name){
           SplashScreen(navController)
        }
        composable(route = Route.HOMESCREEN.name){
            HomeScreen(myImgList = list)
        }

    }

}


enum class Route{

    SPASHSCREEN,
    HOMESCREEN
}