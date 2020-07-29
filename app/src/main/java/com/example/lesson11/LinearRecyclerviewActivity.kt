package com.example.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class LinearRecyclerviewActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_recyclerview)

        initView()
        setLinearRecyclerviewAdapter()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun setLinearRecyclerviewAdapter() {
        val adapter = LinearRecyclerviewAdapter(getData())
        recyclerView?.adapter = adapter
    }

    private fun getData():ArrayList<LinearExampleModel>{
        val data = arrayListOf<LinearExampleModel>()

        for (i in 1..15){
            data.add(LinearExampleModel("Name $i","Phone number $i"))
        }
        return data
    }
}