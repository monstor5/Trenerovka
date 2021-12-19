package com.example.trenerovka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.TextView







        class MainActivity5 : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main5)
                  PreferenceManager
                        .getDefaultSharedPreferences(applicationContext)
                        .getInt("l" , 10)
var sws = findViewById<TextView>(R.id.textView9)
                var ss = findViewById<TextView>(R.id.textView8)
                val zx = findViewById<Button>(R.id.but)
                val op = intent.getStringExtra("op" )
                val ot = intent.getStringExtra("ot" )


                var jkj = findViewById<TextView>(R.id.textView7)
                if (op != null && ot != null && mmn == 0){
                    jkj.text = (pol?.shuffled().take(1) ).toString()
                    ss.text =  (op.toInt()..ot.toInt()).random().toString()
            }

            if (op != null && ot != null && mmn != 0){
                jkj.text = (pol?.shuffled().take(1) ).toString()
                ss.text =  mmn.toString()
            }
                zx.setOnClickListener {
                    gg += 1
                    var ntent = Intent(this@MainActivity5, MainActivity::class.java).apply {

                    }
                    startActivity(ntent)
                }
        }
}
var gg = 0