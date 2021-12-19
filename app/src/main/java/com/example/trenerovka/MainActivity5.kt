package com.example.trenerovka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        package com.example.trenerovka

        import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.widget.TextView

        class MainActivity5 : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main5)
                val lydi = intent.getStringExtra("lydi")
                val op = intent.getStringExtra("op" )
                val ot = intent.getStringExtra("ot" )


                var jkj = findViewById<TextView>(R.id.textView7)
                if (op != null && ot != null)
                    jkj.text = (players?.shuffled().take(1) + (op.toInt()..ot.toInt()).random()).toString()
            }
        }
    }
}