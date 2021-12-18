package com.example.trenerovka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)
        var lo = "290287"
        var l = "newstar"
        val p =  findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo).text
        val pp = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo1).text
        val r = findViewById<com.google.android.material.button.MaterialButton>(R.id.op)
        r.setOnClickListener {
            if (p.toString() == lo && pp.toString() == l){
                var intent = Intent(this@MainActivity3, MainActivityk::class.java).apply {

                }
                startActivity(intent)

            }
        }
    }
}