package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    private val imageList: List<String> = mutableListOf("https://upload.wikimedia.org/wikipedia/en/7/70/Terminator1984movieposter.jpg",
        "https://upload.wikimedia.org/wikipedia/en/8/85/Terminator2poster.jpg",
        "https://upload.wikimedia.org/wikipedia/en/3/39/Terminator_3_Rise_of_the_Machines_movie.jpg",
        "https://upload.wikimedia.org/wikipedia/en/9/95/Terminator-salvation-poster.jpg")
    private val titleList: List<String> = mutableListOf("Terminator","Terminator 2: el juicio final","Terminator 3: La rebelión de las máquinas","Terminator Salvation")
    private val rDateList: List<String> = mutableListOf("1984","1991","2003","2009")
    private val rateList: List<String> = mutableListOf("97","93","68","33")
    private val titleOList: List<String> = mutableListOf("Terminator","Terminator 2: Judgment Day","Terminator 3: Rise of the Machines","Terminator Salvation")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movie_list.layoutManager = LinearLayoutManager(this)
        movie_list.adapter = MovieAdapter(imageList,titleList,rDateList,rateList,titleOList)
    }


}

