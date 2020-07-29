package com.example.lesson11

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SpinnerAdapter(context: Context, resource: Int, private val objects: List<CustomDataClass>):
      ArrayAdapter<CustomDataClass>(context, resource, objects) {
    @SuppressLint()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_spinner, parent, false)
        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = objects[position].title
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_dropdown_spinner, parent, false)
        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = objects[position].title
        return view
    }
}