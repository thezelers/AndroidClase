package com.example.myapplication

import android.media.Image
import android.widget.ImageView

data class Movie(val id: Int, val name:String,val year:String,val gender:String,val desc: String,val image:String) {
    init {

    }
}