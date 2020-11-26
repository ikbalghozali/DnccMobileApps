package com.mustaghfirin.pertemuan2intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            val user= username.text.toString()
            val pass= password.text.toString()
            if(user.isEmpty()||pass.isEmpty()){
                Toast.makeText(this,"Masukkan username dan password",Toast.LENGTH_SHORT).show()
            }
            if(user.isNotEmpty()&&pass.isNotEmpty()){
                val intent= Intent(this,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}