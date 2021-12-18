package com.example.trenerovka

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
@Suppress("UNREACHABLE_CODE")
class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        /////////////////////////////

        var plo = 0
        var lydi= intent.getStringExtra("lydi".toString())
        var k = lydi
        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)
        val dobav = findViewById<Button>(R.id.but3)
        dobav.width = Color.BLACK
        var klo = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo)
        var kol = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo).text
        val list = findViewById<ListView>(R.id.list)
        val list2 = findViewById<ListView>(R.id.list2)
        val list3 = findViewById<ListView>(R.id.list3)
/////////////////////////////////////////////////


        val kak = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.out)
        if (k != null) {

            val momn = (0..k.toInt())
            if (k.toInt() == 1){
                kak.hint = "Укакжи своё имя !"
            }



            dobav.setOnClickListener {
                if (plo == 0){
                    plo += 1}
                // TODO: сделать чтобы выходило по порядку
                val pol = MutableList(k.toInt()) {
                    (kol).toString()
                }
                val kolich = MutableList(k.toInt()) {
                    (it + 1).toInt()
                }
                val off = MutableList (k.toInt()){
                    "Убрать"
                }
                if (kol.toString() == "") {
                    kak.error= "Введите имя"
                }
                //////////////////////////////////////
                if (kol.toString() != ""){
                    klo.text
                    kak.error = null

                    list.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , pol)
                    list.setOnItemClickListener { parent, view, position, id ->
                        ses += 1


                        AlertDialog.Builder(this)

                            .setTitle(" Error 003")
                            .setMessage("Ты точно хочеш добавить ещё кого то ?")
                            .setView(createButton())

                            .setNegativeButton("Назат") { _, _ -> ses -= 1
                                if (gog == 1&& plo  > 0) {
                                    pol.add(kol.toString())
                                    list.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, pol)
                                    off.add("Убрать")
                                    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
                                    kolich.add(k.toInt()+1  )
                                    list2.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , kolich)
                                    if (plo == 1){
                                        plo = 0}

                                    gog -= 1
                                }
                            }



                            .create()
                            .show()

                        Log.d("you loh" , "$position")
                    }


                    list2.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , kolich)
                    list2.setOnItemClickListener { parent, view, position, id -> ses += 0
                        if (k.toInt() == 5&& kol.toString() == "Жора"){
                            AlertDialog.Builder(this)

                                .setTitle(" Error 002")
                                .setMessage("Ты куда зашёл ?")
                                .setView(createButton())

                                .setNegativeButton("Назат") { _, _ -> ses == 1}



                                .create()
                                .show()}
                        else {
                            AlertDialog.Builder(this)

                                .setTitle(" Error 002")
                                .setMessage("Ты куда зашёл ?")


                                .setNegativeButton("Назат") { _, _ -> ses == 0 }


                                .create()
                                .show()
                        }
                        Log.d("you loh" , "$position")
                    }


                    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
                    list3.setOnItemClickListener { parent, view, position, id ->

                        off.removeAt(0)
                        pol.removeAt(0)
                        kolich.removeAt(0)
                        list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
                        list2.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , kolich)
                        list.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , pol)
                        Log.d("you loh" , "$position")

                    }
                } }


/////////////////////////////////////////////////////






























        }
    }var ses = 0

    var gog = 0



    @SuppressLint("CutPasteId")                                  //
    private fun createButton(): Button {                                 //
        return Button(this).apply {
            setText ("Эта кнопка ничего не делает !")
            backgroundTintList =
                ColorStateList.valueOf(Color.TRANSPARENT)

            if (ses == 0) {
                setOnClickListener {
                    var intent = Intent(this@MainActivity2, MainActivity3::class.java).apply {

                    }
                    startActivity(intent)
                }
            }
            if (ses == 1){
                setText ("Добавить когото ?")
                setOnClickListener {
                    gog = 1

                }
            }
        }
    }
}





