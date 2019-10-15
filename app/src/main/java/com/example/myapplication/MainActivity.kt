package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText: TextView = findViewById(R.id.holaworld)
        val btnChange: Button = findViewById(R.id.btnChange)
        val txtNum: TextView = findViewById(R.id.txtNumero)

        var num: Int = 0
        txtNum.text = num.toString()

        val intent = Intent(this, profileActivity::class.java)

        val alert = getString(R.string.mensg)
        btnChange.setOnClickListener {
            Toast.makeText(MainActivity@ this, alert, Toast.LENGTH_SHORT).show()
            num++
            txtNum.text = num.toString()
        }
        btnEj2.setOnClickListener {
            intent.putExtra("Name", "carlos")
            intent.putExtra("bDate", "11/02/99")
            intent.putExtra("City", "Madrid")
            intent.putExtra("image",)
            intent.putExtra(
                "Desc",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at tincidunt sem, ac venenatis augue. Suspendisse nec ante sit amet metus facilisis aliquam. Maecenas odio lectus, vestibulum eget ultricies vel, blandit id sem. Maecenas eget turpis ac nunc ornare consectetur et in nunc. Mauris mi tellus, eleifend non commodo nec, sagittis et nisl. Donec tincidunt arcu nec eros mollis maximus. Fusce nisl ipsum, tristique eu dui id, laoreet finibus orci. Cras pretium ac quam rhoncus pretium. Integer pharetra efficitur blandit. Nulla a lectus posuere, aliquam ligula quis, tempus felis. In hac habitasse platea dictumst."
            )
            startActivity(intent)
        }
    }
}