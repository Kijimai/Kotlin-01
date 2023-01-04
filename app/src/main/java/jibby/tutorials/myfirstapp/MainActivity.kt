package jibby.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val myText = findViewById<TextView>(R.id.tvText)
        var counter = 0
        btnClickMe.setOnClickListener {
            if(counter > 10) {
                Toast.makeText(this, "You're clicking too much!", Toast.LENGTH_LONG).show()
                myText.text = "Stop!!! You're clicking too much!"
                return@setOnClickListener
            }
            counter+=1
            btnClickMe.text = "HAHA YOU CLICKED ME!"
            //Alternatively...
//            myText.text = "$counter"
            myText.text = counter.toString()
        }
    }
}