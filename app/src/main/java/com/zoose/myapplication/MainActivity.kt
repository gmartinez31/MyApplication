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
        val textView = findViewById<TextView>(R.id.text)
        val textView2 = findViewById<TextView>(R.id.text2)

        button.setOnClickListener { rollDice(textView, textView2) }

        //extension fun
        fun String.lastChar(): Char = this.get(this.length - 1)
        "Gustavo".lastChar()
    }

    private fun rollDice(textView: TextView, textView2: TextView) {
        Toast.makeText(this, "button clicked.", Toast.LENGTH_SHORT).show()
        textView.text = getString(R.string.dice_rolled)
    }
}
