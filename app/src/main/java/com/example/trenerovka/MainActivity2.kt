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
   val a = intent?.extras?.getString("item")

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

/////////////////////////////////////////////////
if (pol.toString() != "" && xcv == 0){
    lst = 1
    list.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , pol)
    list.setOnItemClickListener { parent, view, position, id ->
        if(seseli == 1){
            ses += 5
            if(mns == 1) {
                if (pol.toString() != "") {
                    val polk = pol.get(0)
                    AlertDialog.Builder(this)

                            .setTitle(" Информация об игроке")

                            .setMessage("Имя - $polk ___" +
                                    " Фамилия - $jspr ____" +
                                    " Отчество - $jstr")
                            .setView(createButton())

                            .setNegativeButton("Назат") { _, _ ->
                                ses -= 5
                            }


                            .create()
                            .show()
                }

                Log.d("you loh", "$position")

            }
            if(mns == 0) {
                if (pol.toString() != "") {
                    val polk = pol.get(0)
                    AlertDialog.Builder(this)

                            .setTitle(" Информация об игроке")

                            .setMessage("Имя - $polk")
                            .setView(createButton())

                            .setNegativeButton("Назат") { _, _ ->
                                ses -= 5
                            }


                            .create()
                            .show()
                }

                Log.d("you loh", "$position")

            }
        }



        if(seseli !=1) {
            ses += 1
            if (pol.toString()!= "" ){
                val polk = pol.get(0)
            AlertDialog.Builder(this)

                    .setTitle("Информация об игроке")
                    .setMessage("Имя - $polk")
                    .setView(createButton())

                    .setNegativeButton("Назат") { _, _ ->ses -= 1
                    }



                    .create()
                    .show()
        }
            Log.d("you loh" , "$position")
        }




    }

    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
    list3.setOnItemClickListener { parent, view, position, id ->
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("item",off[position])
        startActivity(intent)
        sg -= 1
        off.removeAt(0)
        pol.removeAt(0)
        mns = 0
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
                        if(seseli == 1){
                            ses += 5
                            if(mns == 1) {
                                if (pol.toString() != "") {
                                    val polk = pol.get(0)
                                    AlertDialog.Builder(this)

                                            .setTitle(" Информация об игроке")

                                            .setMessage("Имя - $polk ___" +
                                                    " Фамилия - $jspr ____" +
                                                    " Отчество - $jstr")
                                            .setView(createButton())

                                            .setNegativeButton("Назат") { _, _ ->
                                                ses -= 5
                                            }


                                            .create()
                                            .show()
                                }

                                Log.d("you loh", "$position")

                            }
                            if(mns == 0) {
                                if (pol.toString() != "") {
                                    val polk = pol.get(0)
                                    AlertDialog.Builder(this)

                                            .setTitle(" Информация об игроке")

                                            .setMessage("Имя - $polk")
                                            .setView(createButton())

                                            .setNegativeButton("Назат") { _, _ ->
                                                ses -= 5
                                            }


                                            .create()
                                            .show()
                                }

                                Log.d("you loh", "$position")

                            }
                        }



                        if(seseli !=1) {
                           ses += 1
                           if (pol.toString()!= "" ) {
                               val polk = pol.get(0)
                               AlertDialog.Builder(this)

                                       .setTitle("Информация об игроке")
                                       .setMessage("Имя - $polk")
                                       .setView(createButton())

                                       .setNegativeButton("Назат") { _, _ ->
                                           ses -= 1
                                       }


                                       .create()
                                       .show()
                           }
                        Log.d("you loh" , "$position")
                        }

                    }





                    list3.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1 , off)
                    list3.setOnItemClickListener { parent, view, position, id ->
                         sg -= 1
                        off.removeAt(0)
                        pol.removeAt(0)
                        mns = 0
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

            backgroundTintList =
                ColorStateList.valueOf(Color.TRANSPARENT)

            if (ses == 0) {
                setText ("Эта кнопка ничего не делает !")
                setOnClickListener {
                    var intent = Intent(this@MainActivity2, MainActivity3::class.java).apply {

                    }
                    startActivity(intent)
                }
            }
            if (ses == 1){
                setText ("Добавить инфу о человеке")
                setOnClickListener {
                    var зntent = Intent(this@MainActivity2, MainActivity6::class.java).apply {

                    }
                    startActivity(зntent)

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
            if (ses == 5){
                setText("Изменить инфу")
                setOnClickListener {
                    var pntent = Intent(this@MainActivity2, MainActivity6::class.java).apply {
                        unit += 1

                    }
                    startActivity(pntent)
                }
            }
        }
    }

}




val pol = mutableListOf<String>()
val off = mutableListOf<String>()
var sg = 0
var unit = 0
var mns = 1