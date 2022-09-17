package com.example.poe20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring mutable variables
        val head = findViewById<TextView>(R.id.tvHeader)
       
       
       
            //A toast
        thanks.setOnClickListener {

            Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show()
        }




    }
}
