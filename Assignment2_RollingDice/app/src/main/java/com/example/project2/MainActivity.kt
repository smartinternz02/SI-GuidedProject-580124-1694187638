package com.example.project2

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import java.util.*


class MainActivity : ComponentActivity() {
    private lateinit var ResultText:TextView
    private lateinit var Roll:Button
    private lateinit var Result:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ResultText=findViewById(R.id.textView)
        Roll=findViewById(R.id.button)
        Result=findViewById(R.id.imageView)
        Roll.setOnClickListener{
            giveresult()
        }
    }
    private fun giveresult() {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val resultext = "Dice:$randomNumber"
        ResultText.text = resultext
        if(randomNumber==1)
        Result.setImageResource(R.drawable.dice1)
        else if(randomNumber==2)
            Result.setImageResource(R.drawable.dice2)
        else if(randomNumber==3)
            Result.setImageResource(R.drawable.dice3)
        else if(randomNumber==4)
            Result.setImageResource(R.drawable.dice4)
        else if(randomNumber==5)
            Result.setImageResource(R.drawable.dice5)
        else Result.setImageResource(R.drawable.dice6)

    }}

