package com.example.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var diceImage : ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //references
        val rollButton: Button = findViewById(R.id.roll_button)
        val restablecerButton: Button = findViewById(R.id.restablecer)
        diceImage = findViewById(R.id.dice_image)

        //events
        rollButton.setOnClickListener { rollDice() }
        restablecerButton.setOnClickListener { restablecer() }
    }




    private fun rollDice() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }





    private fun restablecer() {
        diceImage.setImageResource(R.drawable.empty_dice)
    }


}