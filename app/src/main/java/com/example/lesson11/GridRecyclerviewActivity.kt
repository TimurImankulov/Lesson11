package com.example.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridRecyclerviewActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_recyclerview)

        initView()
        setGridRecyclerviewAdapter()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun setGridRecyclerviewAdapter() {

        val adapter = GridRecyclerviewAdapter(getData())
        recyclerView?.layoutManager =GridLayoutManager(applicationContext,3)
        recyclerView?.adapter = adapter
    }

    private fun getData():ArrayList<GridExampleModel>{
        val data = arrayListOf<GridExampleModel>()

        for (i in 1..15){
            data.add(GridExampleModel("Item $i", getImage(i)))
        }
        return data
    }

    private fun getImage(position: Int): Int {
        val result = position % 3
        var image = 0

        when(result){
            0-> image = R.drawable.image1
            1-> image = R.drawable.image2
            2-> image = R.drawable.image3
        }
        return image
    }
}