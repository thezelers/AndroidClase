package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText: TextView = findViewById(R.id.holaworld)
        val btnChange: Button = findViewById(R.id.btnChange)
        val txtNum: TextView = findViewById(R.id.txtNumero)

        var num: Int = 0
        txtNum.text = num.toString()


        val alert = getString(R.string.mensg) 
        btnChange.setOnClickListener {
            Toast.makeText(MainActivity@ this, alert, Toast.LENGTH_SHORT).show()
            num++
            txtNum.text = num.toString()
        }
    }
}






