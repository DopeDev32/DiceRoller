package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var diceImag : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = binding.btnrl

        btn.setOnClickListener{
//            Toast.makeText(this, "Rolling . . ", Toast.LENGTH_SHORT).show()
            rolldice()
        }
        diceImag = binding.diceimg
    }

    private fun rolldice() {
        // Generating Random number
        val randNum = Random.nextInt(6) + 1

        val numdic = when (randNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3  -> R.drawable.dice_3
            4  -> R.drawable.dice_4
            5  -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImag.setImageResource(numdic)
    }
}