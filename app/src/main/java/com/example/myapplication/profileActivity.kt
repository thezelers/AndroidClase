package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class profileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textView.text=intent.getStringExtra("Name")
        val ima = intent.getIntExtra("image",R.drawable.seniores2)
        imgPersona.setImageResource(ima)
        txtdDay.text=intent.getStringExtra("bDate")
        txtCity.text=intent.getStringExtra("City")
        txtdesc.text=intent.getStringExtra("Desc")
    }



}
