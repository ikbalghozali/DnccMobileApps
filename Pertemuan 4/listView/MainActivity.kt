package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search = findViewById<SearchView>(R.id.search) as SearchView
        val listView = findViewById<ListView>(R.id.list) as ListView
        val language = arrayOf("Phyton", "Java", "JavaScript", "Kotlin", "Dart", "C++", "Golang", "Ruby", "Objective-C", "shell", "Swift", "PHP", "Go", "Typescript", "R", "MATLAB")
        val adp : ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_expandable_list_item_1,language)
        listView.adapter = adp

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query : String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                adp.filter.filter(newText)
                return false
            }
        })

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, "Anda Memilih : "+ language[position], Toast.LENGTH_SHORT).show()
        }
    }
}