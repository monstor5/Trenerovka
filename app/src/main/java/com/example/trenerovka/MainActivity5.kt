package com.example.trenerovka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView







        class MainActivity5 : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main5)

                val op = intent.getStringExtra("op" )
                val ot = intent.getStringExtra("ot" )


                var jkj = findViewById<TextView>(R.id.textView7)
                if (op != null && ot != null)
                    jkj.text = (pol?.shuffled().take(1) + (op.toInt()..ot.toInt()).random()).toString()
            }
        }

