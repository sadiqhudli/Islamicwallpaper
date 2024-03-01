package com.developerssays.islamicwallpaper.view



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.developerssays.islamicwallpaper.compounds.MyAppBar
import com.developerssays.islamicwallpaper.compounds.SingleCard
import com.developerssays.islamicwallpaper.model.Data
import com.developerssays.islamicwallpaper.model.getImages
import com.developerssays.islamicwallpaper.ui.theme.IslamicwallpaperTheme




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(myImgList: List<Data>) {

    val img = getImages()

    Scaffold(
        topBar = { MyAppBar(onClickAction = {},
            onClickMenu = {})},
        content = { padding ->
            Box(modifier = Modifier.fillMaxWidth().padding(padding)){

                LazyColumn(modifier = Modifier.padding
                    (vertical = 5.dp),
                    contentPadding = PaddingValues(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                    )
                {
                    items(myImgList) { index ->
                        SingleCard(data =index )
                    }
                }

            }



            /*

 LazyColumn(contentPadding = PaddingValues(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        items(imageList){myimage->
            SingleCard(data = myimage)
        }
    }
     */


        },
    )

}











@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    IslamicwallpaperTheme {
    
        val data = getImages()
    HomeScreen(data)
    }
}