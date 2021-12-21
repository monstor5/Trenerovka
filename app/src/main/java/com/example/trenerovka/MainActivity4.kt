package com.example.trenerovka

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val aB = supportActionBar
        aB!!.title = "Отжимашки"
        aB.setDisplayHomeAsUpEnabled(true)
var xg = 0
        val plu = findViewById<Button>(R.id.button2)
        val plu2 = findViewById<Button>(R.id.but2)
        val min  = findViewById<Button>(R.id.button)
        val min1 = findViewById<Button>(R.id.but)
        val kolo = findViewById<TextView>(R.id.text)
        val kol = findViewById<TextView>(R.id.textv)
        val prod = findViewById<Button>(R.id.button10)

        if (dfgj == 1 ){
            val zntent = Intent (this@MainActivity4 , MainActivity5::class.java).apply {


            }
            startActivity(zntent)
            dfgj -= 1
        }

        if ( bhb2 != 0 && xg ==0){
            kol.text = "$bhb2"
            kolo.text = "$bhb"}


        plu.setOnClickListener {
            xg = 1
          if (mm == 0){
            bhb += 1
            kolo.text = "$bhb"}
            if (bhb == bhb2){
                bhb2 += 1
                kol.text = "$bhb2"
            }
            if (bhb == 300 && mm == 0 && dur == 0){
                mm = 1
                qw = 1
                AlertDialog.Builder(this)

                        .setTitle(" Error 003")
                        .setMessage("Ты шо дурной ?")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ -> qw = 0

            }
                        .create()
                        .show()

        }
            if (bhb == 300 && mm == 0 && dur > 0){
                mm = 1
                qw = 1
                AlertDialog.Builder(this)

                        .setTitle(" Error 003")
                        .setMessage("Ты шо дурной ?")


                        .setNegativeButton("Назат") { _, _ -> qw = 0

                        }
                        .create()
                        .show()

            }
        }
        min.setOnClickListener {
            xg = 1
           if ( bhb != 0) {
               bhb -= 1
               kolo.text = "$bhb"
               mm = 0
           }
            if (bhb == 0){
                qw = 2
                AlertDialog.Builder(this)
                        .setTitle(" Error 003")
                        .setMessage("Меньше 0 нельзя")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ -> qw = 0

                        }
                        .create()
                        .show()
            }
        }
        plu2.setOnClickListener {
            xg = 1
          if ( m == 0 && bhb2 != 400)
            bhb2 += 1
            kol.text = "$bhb2"


            if(bhb2 ==400 && dur == 0){
                qw = 3
                AlertDialog.Builder(this)

                        .setTitle(" Error 003")
                        .setMessage("Ты шо дурной ?")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ -> qw = 0

                        }
                        .create()
                        .show()

            }
            if(bhb2 ==400 && dur == 2){
                qw = 3
                AlertDialog.Builder(this)

                        .setTitle(" Error 003")
                        .setMessage("Ты шо дурной ?")


                        .setNegativeButton("Назат") { _, _ -> qw = 0

                        }
                        .create()
                        .show()


            }
        }

        min1.setOnClickListener {
            xg = 1
           if (bhb2 != bhb  && bhb2 !=1){
            bhb2 -= 1
            kol.text ="$bhb2"}
            if ( bhb2 == bhb && bhb2 !=1){
                bhb -= 1
                kolo.text ="$bhb"}

            if (bhb2 == 0 ){
                bhb2 += 1
                qw =2
                AlertDialog.Builder(this)
                        .setTitle(" Error 003")
                        .setMessage("Меньше 1 нельзя")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ -> qw = 0

                        }
                        .create()
                        .show()
            }
    }
        prod.setOnClickListener {
            xg = 0
            val intent = Intent (this@MainActivity4 , MainActivity5::class.java).apply {

                putExtra("op", "$bhb")
                putExtra("ot", "$bhb2")
            }
            startActivity(intent)


        }




    }



    @SuppressLint("CutPasteId")                                  //
    private fun createButton(): Button {                                 //
        return Button(this).apply {
            setText("Эта кнопка ничего не делает !")
            backgroundTintList =
                    ColorStateList.valueOf(Color.TRANSPARENT)
                    if (qw == 1 && dur == 0){
                        setText ("Да")
            setOnClickListener {
                dur = 1
                mmn = 300
            }

            }
            if ( qw == 2){
                setText("оптимальное значение (от 10 до 30 )")
                setOnClickListener {
                    bhb = 10
                    bhb2 = 30

                }
            }
            if ( qw == 3){
                setText("Да")
                setOnClickListener {
                    dur = 2
                    mmn = 400
                }
            }
        }

    }
}
var qw = 0
var mmn = 0
var mm = 0
var m = 0
var bhb = 0
var bhb2 = 1
var dur = 0