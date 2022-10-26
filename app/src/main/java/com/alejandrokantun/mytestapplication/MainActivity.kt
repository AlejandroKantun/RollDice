package com.alejandrokantun.mytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.alejandrokantun.mytestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_main)
        RollDice()
    }
    fun RollDice(){
        binding.btnHola.setOnClickListener {
        binding.tvResult.text = "Result of dice rolled: "+ RollingDice().toString()
        }
    }

    fun RollingDice():Int{
        return  (1..6).random()
    }
}