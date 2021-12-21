package com.example.trenerovka

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.preference.PreferenceManager
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
@Suppress("UNREACHABLE_CODE")
class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        /////////////////////////////
        var sg = 0
val prod = findViewById<com.google.android.material.button.MaterialButton>(R.id.but)
        var plo = 0
var xcv = 0

        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)
        val dobav = findViewById<com.google.android.material.button.MaterialButton>(R.id.but3)

        var klo = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo)
        var kol = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.klo).text
        val list = findViewById<ListView>(R.id.list)

        val list3 = findViewById<ListView>(R.id.list3)
       sg = PreferenceManager
                .getDefaultSharedPreferences(applicationContext)
                .getInt("op" , 0)
/////////////////////////////////////////////////
if (pol.toString() != "" && xcv == 0){
    lst = 1
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

                        if (plo == 1){
                            plo = 0}

                        gog -= 1
                    }
                }



                .create()
                .show()

        Log.d("you loh" , "$position")
    }

    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
    list3.setOnItemClickListener { parent, view, position, id ->
        sg -= 1
        off.removeAt(0)
        pol.removeAt(0)

        list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)

        list.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , pol)
        Log.d("you loh" , "$position")

    }
}

        val kak = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.out)
        if (lydi != null) {


            if (lydi.toInt() == 1){
                kak.hint = "Укакжи своё имя !"
            }



           dobav.setOnClickListener {

                if (plo == 0){
                    plo += 1}
                // TODO: сделать чтобы выходило по порядку




                if (kol.toString() == "") {
                    kak.error= "Введите имя"
                }
                //////////////////////////////////////
                if (kol.toString() != "" && sg != lydi.toInt()){
                    xcv =1
                    klo.text
                    kak.error = null
                    sg += 1
                    pol.add(klo.text.toString())
      off.add("Удалить")
        klo.text?.clear()
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

                                    if (plo == 1){
                                        plo = 0}

                                    gog -= 1
                                }
                            }



                            .create()
                            .show()

                        Log.d("you loh" , "$position")
                    }





                    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
                    list3.setOnItemClickListener { parent, view, position, id ->
                         sg -= 1
                        off.removeAt(0)
                        pol.removeAt(0)

                        list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)

                        list.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , pol)
                        Log.d("you loh" , "$position")

                    }
                }
               if (kol.toString() != "" && sg == lydi){
                   ses += 4
                   AlertDialog.Builder(this)
                       .setTitle(" Error 003")
                       .setMessage("Людей больше чем ты подсчитал ?")
                       .setView(createButton())

                       .setNegativeButton("Назат") { _, _ ->ses = 0

                       }
                           .create()
                           .show()

               }

           }

            prod.setOnClickListener {
                lst = 0
                if (pol.toString() != "" && sg == lydi.toInt() ){
                    var intent = Intent(this@MainActivity2, MainActivity4::class.java).apply {

                    }
                    startActivity(intent)
                    PreferenceManager
                            .getDefaultSharedPreferences(applicationContext)
                            .edit()
                            .putInt("op" , sg)
                            .commit()
                }
                else{
                    if (lydi.toInt() == 5)
                    AlertDialog.Builder(this)

                        .setTitle(" Error 003")
                        .setMessage("Сначала добавь людей ")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ ->

                            }
                            .create()
                            .show()
                    if (plo.toString() != "" && sg != 0){
                        lst += 1
                        ses += 2
                        AlertDialog.Builder(this)

                                .setTitle(" Error 003")
                                .setMessage("Точно хочеш продолжить?")
                                .setView(createButton())

                                .setNegativeButton("Назат") { _, _ ->ses = 0

                                }
                                .create()
                                .show()
                        PreferenceManager
                                .getDefaultSharedPreferences(applicationContext)
                                .edit()
                                .putInt("op" , sg)
                                .commit()
                    }


                 if (sg != lydi && lst == 0){
                        AlertDialog.Builder(this)

                            .setTitle(" Error 003")
                            .setMessage("Сначала добавь людей ")


                            .setNegativeButton("Назат") { _, _ ->

                            }
                                .create()
                                .show()

                    } }
                       xcv =0
                        }



            }



/////////////////////////////////////////////////////






























        }
var ses = 0

    var gog = 0
    var lst =0



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
            if ( ses == 2){
                setText ("Продолжить")
                setOnClickListener {
                var intent = Intent(this@MainActivity2, MainActivity4::class.java).apply {

                }
                startActivity(intent)
            }}
            if ( ses == 4){
                setText (" Добавить ещё 5 людей ")
                setOnClickListener {
                    lydi += 5
                }
            }
        }
    }

}




val pol = mutableListOf<String>()
val off = mutableListOf<String>()
