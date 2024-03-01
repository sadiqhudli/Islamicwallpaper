package com.developerssays.islamicwallpaper.view


import androidx.compose.animation.Animatable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.developerssays.islamicwallpaper.R
import com.developerssays.islamicwallpaper.navigation.Route
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController:NavHostController){

    val color = remember { Animatable(Color.Black) }


    Column(modifier = Modifier.fillMaxSize()
        .background(MaterialTheme.colorScheme.primary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){


        LaunchedEffect(key1 = true) {
            delay(2000L)
            navController.navigate(route = Route.HOMESCREEN.name)
        }

        Image(painter = painterResource(id = R.drawable.img),
            contentDescription ="",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(150.dp)
                .clip(
                    shape = CircleShape
                ) )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "App Name",
            color = Color.Black,
            fontSize = 16.sp)
    }


}




@Composable
@Preview(showBackground = true)
fun SpPrevee(){

    val nav = rememberNavController()
    SplashScreen(navController = nav)
}