package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetailActivity: AppCompatActivity() {

    val movie = Movie2(
        name = "Peliculon",
        id = 1,
        gender = "Maravillosa",
        year = "2020",
        desc = "Esto es una descripcion",
        image = "https://fotografias.lasexta.com/clipping/cmsimages01/2013/07/30/FE687635-403F-4209-9EC5-0CDF1CB7104F/58.jpg" )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        with(movie) {
            Picasso.get().load(image).into(movImg)
            movYearTxt.setText(year)
            descTxt.setText(desc)
            movGenderTxt.setText(gender)
            movNameTxt.setText(name)
        }
    }
}