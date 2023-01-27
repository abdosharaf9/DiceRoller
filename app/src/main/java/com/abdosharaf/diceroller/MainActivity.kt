package com.abdosharaf.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = findViewById(R.id.ivDice)
        val button: Button = findViewById(R.id.btnRoll)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        val image = when(Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        dice.setImageResource(image)
    }
}