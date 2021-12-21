package com.example.trenerovka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val dj = findViewById<TextView>(R.id.textV5)
        var out = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.out)
        var outt = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.out1)
        var exx = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo)
        var exz = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo1)
        if ( jspr != ""&& jstr != ""){
            jspr = exx.text.toString()
            jstr = exz.text.toString()
        }


       dj.text = pol.get(0)
        val jos = findViewById<Button>(R.id.but5)
        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)
        jos.setOnClickListener {
            if (unit == 0) {
                if (exx.text.toString() == "" && exz.text.toString() == "") {
                    out.error = "Введите фамилию"
                    outt.error = "Введите отчество"
                }
                if (exx.text.toString() == "") {
                    out.error = "Введите фамилию"
                }
                if (exz.text.toString() == "") {
                    outt.error = "Введите отчество"
                }
                if (exx.text.toString() != "" && exz.text.toString() != "") {
                    jspr = exx.text.toString()
                    jstr = exz.text.toString()
                    var зntent = Intent(this@MainActivity6, MainActivity2::class.java).apply {
                        seseli += 1
                    }
                    startActivity(зntent)
                }
            }
            if ( unit == 1){
                if (exx.text.toString() == "" && exz.text.toString() == "") {
                    out.error = "Измените фамилию"
                    outt.error = "Измените отчество"
                }
                if (exx.text.toString() == "") {
                    out.error = "Измените фамилию"
                }
                if (exz.text.toString() == "") {
                    outt.error = "Измените отчество"
                }
                if (exx.text.toString() != "" && exz.text.toString() != "") {
                    jspr = exx.text.toString()
                    jstr = exz.text.toString()
                    var зntent = Intent(this@MainActivity6, MainActivity2::class.java).apply {

                    }
                    startActivity(зntent)
                }
            }

        }

        }

    }

var jstr =""
var jspr =""
var seseli = 0