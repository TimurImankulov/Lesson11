package com.example.lesson11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    var spRecyclerView: Spinner? = null
    var btnGo: Button? = null
    var positionNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        chooseLayout()
        setupListener()
        setupAdapter()
    }

    private fun initView() {
        spRecyclerView = findViewById(R.id.spRecyclerView)
        btnGo = findViewById(R.id.btnGo)
    }

    private fun chooseLayout() {
        spRecyclerView?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    1 -> positionNumber = 1
                    2 -> positionNumber = 2
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun setupListener() {
        btnGo?.setOnClickListener {
            when (positionNumber) {
                1 -> startActivity(Intent(applicationContext, LinearRecyclerviewActivity::class.java))
                2 -> startActivity(Intent(applicationContext, GridRecyclerviewActivity::class.java))
            }
            positionNumber = 0
        }
    }

    private fun setupAdapter(){
        val adapter = SpinnerAdapter(applicationContext, R.id.tvTitle, getData())
        spRecyclerView?.adapter = adapter
    }

    private fun getData(): ArrayList<CustomDataClass>{
        val data = arrayListOf<CustomDataClass>()
        data.add(CustomDataClass("Выберите список"))
        data.add(CustomDataClass("Linear список"))
        data.add(CustomDataClass("Grid список"))
        return data
    }
}
