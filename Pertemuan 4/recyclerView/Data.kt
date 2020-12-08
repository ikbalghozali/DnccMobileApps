package com.ikbalghozali.myrecyclerview

object Data {
    private  val Names = arrayOf("Python", "Java", "JavaScript", "Kotlin", "Dart", "C++", "Golang", "Ruby", "Objective-C", "Clojure", "Swift", "PHP", "Go", "Typescript", "R", "MATLAB")

    private val Details = arrayOf("Web, Enterprise", "Web, Mobile, Enterprise", "Web, Mobile", "Web, Mobile", "Web, Mobile", "Mobile, Enterprise, Embedded", "Web, Enterprise", "Web, Enterprise", "Mobile, Enterprise", "Enterprise", "Mobile, Enterprise", "Web", "Web, Enterprise", "Mobile, Enterprise", "Enterprise", "Enterprise")

    private  val images = intArrayOf(R.drawable.python,
        R.drawable.java,
        R.drawable.js,
        R.drawable.kotlin,
        R.drawable.dart,
        R.drawable.cpp,
        R.drawable.golang,
        R.drawable.ruby,
        R.drawable.objc,
        R.drawable.clojure,
        R.drawable.swift,
        R.drawable.php,
        R.drawable.go,
        R.drawable.ts,
        R.drawable.r,
        R.drawable.matlab,
        )
    val listData: ArrayList<Language>
        get(){
            val list = arrayListOf<Language>()
            for (position in Names.indices){
                val data = Language()
                data.name = Names[position]
                data.detail = Details[position]
                data.photo = images[position]
                list.add(data)

            }
            return list
        }

}