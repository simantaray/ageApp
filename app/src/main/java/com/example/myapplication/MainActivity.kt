package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton = findViewById<Button>(R.id.button)
        val result =findViewById<TextView>(R.id.result)
        var dob =findViewById<EditText>(R.id.bod)
        //val seekbar = findViewById<SeekBar>(R.id.seekBar2)


        rollbutton.setOnClickListener{
            //i =Random().nextInt(6)+1
            val year2020 = 2020
            result.text= (year2020 - dob.text.toString().toInt()).toString()


        }
    }
}

