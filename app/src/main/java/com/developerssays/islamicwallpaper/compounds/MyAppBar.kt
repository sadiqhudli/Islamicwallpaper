package com.developerssays.islamicwallpaper.compounds


import android.widget.Toast
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.developerssays.islamicwallpaper.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar(
    onClickMenu: () -> Unit,
    onClickAction :() -> Unit
){
    val contex = LocalContext.current


    Row (modifier = Modifier
        .heightIn(45.dp)
    ){
        TopAppBar(title = { CustomTextView(value = "Islamic Wallpaper")}
            , navigationIcon = {
                               IconButton(onClick = {
                                   onClickMenu.invoke()
                                   Toast.makeText(contex, "Team is working ", Toast.LENGTH_SHORT).show()
                               }
                               ) {
                                   Icon(Icons.Default.Menu, modifier = Modifier,
                                       tint = Color.White, contentDescription = null)
                                   
                               }
            },
            actions = {
                IconButton(onClick = {

                    onClickAction.invoke()
                    Toast.makeText(contex, "Team is working ", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(
                        Icons.Default.ArrowForward, modifier = Modifier,
                        tint = Color.White, contentDescription = null
                    )

                }

            }, colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.DarkGreen))
        )

    }

    }





@Composable
@Preview(showBackground = true)
fun AppBarPre(){
    MyAppBar(onClickAction = {}, onClickMenu = {})
}

