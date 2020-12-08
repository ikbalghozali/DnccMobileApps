package com.ikbalghozali.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvlanguage : RecyclerView
    private var list : ArrayList<Language> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvlanguage = findViewById(R.id.rv_language)
        rvlanguage.setHasFixedSize(true)

        list.addAll(Data.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvlanguage.layoutManager = LinearLayoutManager(this)
        val listItemAdapter = listAdapter(list)
        rvlanguage.adapter = listItemAdapter
    }
}