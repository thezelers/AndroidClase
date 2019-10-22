package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieAdapter(val imageList: List<String>,val titleList: List<String>,val rDateList: List<String>,val rateList: List<String>,val titleOList: List<String>): RecyclerView.Adapter<movieListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return movieListViewHolder(view)
    }

    override fun getItemCount(): Int = titleList.size

    override fun onBindViewHolder(holder: movieListViewHolder, position: Int) {
        val titleItem = titleList[position]
        val titleOItem = titleOList[position]
        val rDateItem = rDateList[position]
        val rateItem = rateList[position]
        val imageItem = imageList[position]
        holder.bind(rateItem,rDateItem,titleOItem,titleItem,imageItem)


    }
}

class movieListViewHolder(val myview: View): RecyclerView.ViewHolder(myview){
    private val movieImage:ImageView =  myview.findViewById(R.id.movieImage)
    private val movieTitle:TextView =  myview.findViewById(R.id.movieTitleTxt)
    private val movieTitleO:TextView =  myview.findViewById(R.id.movieTitleOTxt)
    private val movieRateTxt:TextView =  myview.findViewById(R.id.movieRateTxt)
    private val movieRDateTxt:TextView =  myview.findViewById(R.id.movieRDateTxt)
    fun bind(rate:String,rDate:String,titleO:String,title:String,image:String) {
        Picasso.get().load(image).into(movieImage)
        movieTitle.setText(title)
        movieTitleO.setText(titleO)
        movieRateTxt.setText(rate)
        movieRDateTxt.setText(rDate)
    }





}