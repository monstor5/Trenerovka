package com.example.trenerovka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var bhb = 0
        var bhb2 = 0
        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)

        val plu = findViewById<Button>(R.id.button2)
        val plu2 = findViewById<Button>(R.id.but2)
        val min  = findViewById<Button>(R.id.button)
        val min1 = findViewById<Button>(R.id.but)
        val kolo = findViewById<TextView>(R.id.text)
        val kol = findViewById<TextView>(R.id.textv)
        val prod = findViewById<Button>(R.id.button10)
        plu.setOnClickListener {
            bhb += 1
            kolo.text = "$bhb"

        }
        min.setOnClickListener {
            bhb -= 1
            kolo.text ="$bhb"
        }
        plu2.setOnClickListener {
            bhb2 += 1
            kol.text = "$bhb2"

        }
        min1.setOnClickListener {
            bhb2 -= 1
            kol.text ="$bhb2"
        }
        prod.setOnClickListener {
            val intent = Intent (this@MainActivity4 , MainActivity5::class.java).apply {

                putExtra("op", "$bhb")
                putExtra("ot", "$bhb2")
            }
            startActivity(intent)


        }




    }
}
