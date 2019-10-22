package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieAdapter(val movieList: List<Movie>): RecyclerView.Adapter<movieListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return movieListViewHolder(view)
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: movieListViewHolder, position: Int) {
        val movieItem = movieList[position]
        holder.bind(movieItem)


    }
}

class movieListViewHolder(val myview: View): RecyclerView.ViewHolder(myview){
    private val movieImage:ImageView =  myview.findViewById(R.id.movieImage)
    private val movieTitle:TextView =  myview.findViewById(R.id.movieTitleTxt)
    private val movieTitleO:TextView =  myview.findViewById(R.id.movieTitleOTxt)
    private val movieRateTxt:TextView =  myview.findViewById(R.id.movieRateTxt)
    private val movieRDateTxt:TextView =  myview.findViewById(R.id.movieRDateTxt)
    fun bind(movie: Movie) {
        with(movie){
        Picasso.get().load(image).into(movieImage)
        movieTitle.setText(title)
        movieTitleO.setText(titleO)
        movieRateTxt.setText(rate)
        movieRDateTxt.setText(year)}
    }





}