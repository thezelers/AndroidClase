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
        val btnchange: Button = findViewById(R.id.btnChange)
        val numerotxt : TextView = findViewById(R.id.txtNumero)

        var numero : Int = 1
        var aux : Int = 0
        numerotxt.text = numero.toString()



        val alerta = getString(R.string.btnChange)
        btnchange.setOnClickListener {
            Toast.makeText(MainActivity@this, alerta, Toast.LENGTH_SHORT).show()
            numero++
            numerotxt.text = numero.toString()
        }
    }





}
