package com.example.myapplication


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieAdapter(val stringList: List<String>): RecyclerView.Adapter<StringListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.string_item,parent,false)
        return StringListViewHolder(view as TextView)
    }

    override fun getItemCount(): Int = stringList.size

    override fun onBindViewHolder(holder: StringListViewHolder, position: Int) {
       val stringItem = stringList[position]
        holder.textview.text = stringItem

    }
}

class StringListViewHolder(val textview: TextView): RecyclerView.ViewHolder(textview){

}