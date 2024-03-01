package com.developerssays.islamicwallpaper.compounds

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.developerssays.islamicwallpaper.R
import com.developerssays.islamicwallpaper.model.Data


@Composable
fun SingleCard(data: Data) {

    Card(modifier = Modifier
        .fillMaxSize()
        .padding()) {
        Column(modifier = Modifier
            .background(color = colorResource(id = R.color.lightGreen))
            .padding(2.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Image(painter = painterResource(id = data.image),
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                , contentScale = ContentScale.FillWidth,
                contentDescription ="" )


        }
        Spacer(modifier = Modifier.heightIn(5.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.white)),
            contentAlignment = Alignment.Center){

            Text(text = data.title)
            Spacer(modifier = Modifier.heightIn(5.dp))
        }

    }
//



}

