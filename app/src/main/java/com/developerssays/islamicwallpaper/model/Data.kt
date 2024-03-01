package com.developerssays.islamicwallpaper.model

import androidx.annotation.DrawableRes
import com.developerssays.islamicwallpaper.R

data class Data(
    val title:String,
    @DrawableRes val image :Int
)



fun getImages():List<Data>{

    return listOf(
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),
        Data("masjid1", image = R.drawable.masjid.toInt()),
        Data("islamic1", image = R.drawable.masjid1.toInt(),),
        Data("islamic2", image = R.drawable.masjid2.toInt(),),
        Data("islamic3", image = R.drawable.masjid3.toInt(),),
        Data("islamic4", image = R.drawable.masjid4.toInt(),),



    )
}
