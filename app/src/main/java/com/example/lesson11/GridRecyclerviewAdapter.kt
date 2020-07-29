package com.example.lesson11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_linear_recyclerview.view.*

class GridRecyclerviewAdapter(val list: ArrayList<GridExampleModel>):RecyclerView.Adapter<GridRecyclerviewAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid_recyclerview, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    class GridViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: GridExampleModel) {
            itemView.tvText.text = item.title
            itemView.ivImage.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.image))
        }
    }
}