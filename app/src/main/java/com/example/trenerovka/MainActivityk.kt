package com.example.trenerovka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class MainActivityk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityk)
        val sw = findViewById<Switch>(R.id.switch1)
        var lo = findViewById<TextView>(R.id.Vw)
        var p = 0

        val chit = findViewById<TextView>(R.id.textView4)
        val v = findViewById<Button>(R.id.button3)
        val vb = findViewById<Button>(R.id.button4)
        val vn = findViewById<Button>(R.id.button5)
        val vm = findViewById<Button>(R.id.button6)
        val vc = findViewById<Button>(R.id.button7)
        v.setOnClickListener {
            p += 2
            chit.text = p.toString()
            if(p==1){
                lo.text = "89833991029"}



        }
      vc.setOnClickListener {
        p-= 1
        chit.text = p.toString()
        if(p==1){
            lo.text = "89833991029"}
    }
    if(p==1){
        lo.text = "89833991029"}


        vm.setOnClickListener {
            p+=4
            chit.text = p.toString()
            if(p==1){
                lo.text = "89833991029"}
        }

        vn.setOnClickListener {
            p-=1
            chit.text = p.toString()

        }


        vb.setOnClickListener {
            p -=3
            chit.text = p.toString()
            if(p==1){
            lo.text = "89833991029"}


        }





    }


    //    val textWatcher = object :TextWatcher{
    //      override fun beforeTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) {
    //        TODO("Not yet implemented")
    //  }
//
    //          override fun onTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) {
    //            if (lo.toString() != "p"){
    //              lo = "89833991029" }
    //}
    //  override fun afterTextChanged(p0: Editable?) {
//
    //          }
    //    }




    ///   sw.setOnCheckedChangeListener { compoundButton, b ->
    ///   if (b) {
    ///   textWatcher.onTextChanged( p0 = 1.toString(),p1= 1, p2 =1, p3=1)
    // TODO: попытаться это доделать
}



// }
///}