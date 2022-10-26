package com.alejandrokantun.mytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.alejandrokantun.mytestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val drawableResource = when (RollingDice()){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_main)
        RollDice()
    }
    fun RollDice(){
        binding.btnHola.setOnClickListener {
            val diceValue = RollingDice()
            binding.tvResult.text = "Result of dice rolled: $diceValue"

            val drawableResource = when (diceValue){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else ->R.drawable.dice_6
            }
            binding.ivDiceImage.setImageResource(drawableResource)
        }
    }

    fun RollingDice():Int{
        return  (1..6).random()
    }


}