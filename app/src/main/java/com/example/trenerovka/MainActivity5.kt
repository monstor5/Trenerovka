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
                var jkj = findViewById<TextView>(R.id.textView7)
var sws = findViewById<TextView>(R.id.textView9)
                var ss = findViewById<TextView>(R.id.textView8)
                var zx = findViewById<Button>(R.id.but)
                var zgh = findViewById<Button>(R.id.but5)
                var zg = findViewById<Button>(R.id.but6)
                zg.setOnClickListener {
                    jkj.text = PreferenceManager
                            .getDefaultSharedPreferences(applicationContext)
                            .getString("jkj" , "")
                    ss.text = PreferenceManager
                            .getDefaultSharedPreferences(applicationContext)
                            .getString("ss", "")


                }
                        zgh.setOnClickListener {
                            bhb =  PreferenceManager
                        .getDefaultSharedPreferences(applicationContext)
                        .getInt("op" , 0)
                bhb2 =  PreferenceManager
                        .getDefaultSharedPreferences(applicationContext)
                        .getInt("ot" , 0)
            }

                if (bhb != null && bhb2 != null && mmn == 0){
                    jkj.text = (pol?.shuffled().take(1) ).toString()
                    ss.text =  ((bhb.toInt()..bhb2.toInt()).random()).toString()
            }

            if (bhb != null && bhb2 != null && mmn != 0){
                jkj.text = (pol?.shuffled().take(1) ).toString()
                ss.text =  mmn.toString()
            }
                zx.setOnClickListener {
                    gg += 1
                    var ntent = Intent(this@MainActivity5, MainActivity::class.java).apply {

                    }
                    startActivity(ntent)
                }
                PreferenceManager
                        .getDefaultSharedPreferences(applicationContext)
                        .edit()
                        .putInt("op" , bhb)
                        .putInt( "ot", bhb2)
                        .putString("jkj", jkj.text.toString())
                        .putString("ss", ss.text.toString())
                        .commit()
            }
}
var gg = 0