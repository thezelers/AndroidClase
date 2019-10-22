package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {


    private val movieList:List<Movie> = mutableListOf(Movie(1,"Terminator","1984","Terminator","97","https://upload.wikimedia.org/wikipedia/en/7/70/Terminator1984movieposter.jpg"),
        Movie(2,"Terminator 2: el juicio final","1991","Terminator 2: Judgment Day","93","https://upload.wikimedia.org/wikipedia/en/8/85/Terminator2poster.jpg"),
        Movie(3,"Terminator 3: La rebelión de las máquinas","2003","Terminator 3: Rise of the Machines","68","https://upload.wikimedia.org/wikipedia/en/3/39/Terminator_3_Rise_of_the_Machines_movie.jpg"),
        Movie(4,"Terminator Salvation","2009","Terminator Salvation","33","https://upload.wikimedia.org/wikipedia/en/9/95/Terminator-salvation-poster.jpg"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movie_list.layoutManager = LinearLayoutManager(this)
        movie_list.adapter = MovieAdapter(movieList)
    }


}

