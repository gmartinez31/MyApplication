package com.zoose.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { rollDice() }

        //extension fun
        fun String.lastChar(): Char = this.get(this.length - 1)
        "Gustavo".lastChar()
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked.", Toast.LENGTH_SHORT)
    }
}
