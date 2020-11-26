package com.mustaghfirin.pertemuan2intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var weight: EditText
    private lateinit var height: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        weight = findViewById(R.id.berat)
        height = findViewById((R.id.tinggi))
        btnCalculate = findViewById(R.id.hitung)
        tvResult = findViewById(R.id.hasil)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.hitung){
            val inputWeight = weight.text.toString().trim()
            val inputHeight = height.text.toString().trim()
            val strResult : String
            var emptyFields = false

            if (inputHeight.isEmpty()){
                emptyFields = true
                height.error = "Tidak boleh kosong"
            }
            if (inputWeight.isEmpty()){
                emptyFields = true
                weight.error = "Tidak boleh kosong"
            }
            if (!emptyFields){
                val bmi = inputWeight.toDouble()/(inputHeight.toDouble() * inputHeight.toDouble())
                val bmiLevel = when {
                    bmi < 18.5 ->"Kekurangan Berat Badan"
                    bmi < 25 ->"Normal(Ideal)"
                    bmi < 30 ->"Kelebihan Berat Badan"
                    else -> "Kegemukan (Obesitas)"
                }
                val solution = String.format("%.5f", bmi)
                strResult = "$solution kg/m2 \n $bmiLevel"
                tvResult.text = strResult
            }
        }
    }
}