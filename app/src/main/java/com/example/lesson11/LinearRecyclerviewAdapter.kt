package com.example.lesson11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson11.R.layout.item_linear_recyclerview
import kotlinx.android.synthetic.main.item_linear_recyclerview.view.*

class LinearRecyclerviewAdapter (private val array: ArrayList<LinearExampleModel>): RecyclerView.Adapter<LinearViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(item_linear_recyclerview, parent, false)
        val holder = LinearViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}

class LinearViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: LinearExampleModel){
        itemView.tvText.text = item.title
        itemView.tvText1.text = item.title1
    }
}
