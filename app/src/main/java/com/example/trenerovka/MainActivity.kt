package com.example.trenerovka
//
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

@Suppress("UNREACHABLE_CODE")

//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //
        val kol =findViewById<TextView>(R.id.text)
        val l = 1


        val min = findViewById<Button>(R.id.button)
        //
        val plus = findViewById<Button>(R.id.button2)
        //
val sf = findViewById<Button>(R.id.bu2)

        //
        val prod = findViewById<Button>(R.id.but)
        //

        kol.text = "       $lydi"
        if (gg == 1){
            gg -= 1
            sf.visibility = VISIBLE
            sf.setOnClickListener {
                var lntent = Intent(this@MainActivity, MainActivity5::class.java).apply {

                }
                startActivity(lntent)
            }
        }
        min.setOnClickListener{





            if (lydi < 2) {
                AlertDialog.Builder(this)

                        .setTitle(" Error 002")
                        .setMessage("Меньше 1 нельзя")
                        .setView(createButton())

                        .setNegativeButton("Назат") { _, _ ->  kol.text = "       $lydi"}
                        .setPositiveButton("закрыть приложение") { _, _ ->
                            finish()
                        }


                        .create()
                        .show()

                lydi += k
                kol.text = "       $lydi"


            }
            lydi -= l
            kol.text = "       $lydi"
        }


        //

        plus.setOnClickListener{

            ////////


            ///////////////////
            if (lydi > 19) {
                AlertDialog.Builder(this)

                        .setTitle(" Error 001")
                        .setMessage("Больше 20 нельзя")
                        .setView(createButton())
                        .setNegativeButton("Назат") { _, _ ->  kol.text = "       $lydi" }
                        .setPositiveButton("закрыть приложение") { _, _ ->
                            finish()
                        }


                        .create()
                        .show()

                lydi -= 20
                kol.text = "       $lydi"
            }
            lydi += l
            kol.text = "       $lydi"

        }

        prod.setOnClickListener {
            if (lydi > 0 && lydi < 21) {
                var ntent = Intent(this@MainActivity, MainActivity2::class.java).apply {

                }
                startActivity(ntent)

            }
        }
        //////////////////////////////////////




    }

    val k = 20

















    ///////////////////////////////////////////////////////////////////////////
    @SuppressLint("CutPasteId")                                  //
    private fun createButton(): Button {                                 //
        return Button(this).apply {
            setText ("Минимальное нужное значение(2) " +
                    "(если вы с кем то)")
            backgroundTintList =
                    ColorStateList.valueOf(Color.TRANSPARENT)
            setOnClickListener {
                if (lydi > 18){
                    lydi -= 18

                }
                if (lydi == 1){
                    lydi += 1

                }

            }
        }
    }



}
var lydi = 1