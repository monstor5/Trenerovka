package com.example.trenerovka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

//
class MainActivity : AppCompatActivity() {

val remove = mutableListOf<String>(

)
    val players = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var l = 0
      l  =   PreferenceManager
            .getDefaultSharedPreferences(applicationContext)
            .getInt("l" , 10)


        val textName = findViewById<TextInputEditText>(R.id.klo)
        val prod = findViewById<com.google.android.material.button.MaterialButton>(R.id.but)
        findViewById<Button>(R.id.but3).setOnClickListener {
            if (textName.text.toString() == ""){
                textName.error = "Введи имя"

            }
            if (textName.text.toString() != ""){

l += 1


            players.add(textName.text.toString())
                remove.add("Удалить" )
            textName.text?.clear()
            findViewById<ListView>(R.id.listView).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
            findViewById<ListView>(R.id.list2).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, remove)
            findViewById<ListView>(R.id.list2).setOnItemClickListener { adapterView, view, i, l ->
                players.removeAt(0)
                findViewById<ListView>(R.id.listView).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
                remove.removeAt(0)
                findViewById<ListView>(R.id.list2).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, remove)

            }

            PreferenceManager
                    .getDefaultSharedPreferences(applicationContext)
                .edit()
                .putInt("l" , l)
                .commit()
        }  }
        prod.setOnClickListener {
            if (players.isEmpty()){
                textName.error = "Введи имя"

            }
            if (players.isNotEmpty()){
                val intent = Intent (this@MainActivity , MainActivity4::class.java).apply {
                    putExtra("play", "$players")
                }
                startActivity(intent)
            }


        }
    }
}


