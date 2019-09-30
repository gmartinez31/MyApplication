package com.zoose.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // best practice to use lateinit with fields that hold views just like this guy to avoid calling the costly findviewbyid
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        diceImage = findViewById(R.id.dice_image)

        button.setOnClickListener { rollDice(diceImage) }

        //extension fun
        fun String.lastChar(): Char = this.get(this.length - 1)
        "Gustavo".lastChar()
    }

    private fun rollDice(diceImage: ImageView) {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
