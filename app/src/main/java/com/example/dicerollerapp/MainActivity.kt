package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButtonMA: Button = findViewById(R.id.rollButton)
        val rolledNumberText: TextView = findViewById(R.id.rolledNumberText)

        rollButtonMA.setOnClickListener { rolledNumberText.text = (1..6).random().toString() }



    }
}