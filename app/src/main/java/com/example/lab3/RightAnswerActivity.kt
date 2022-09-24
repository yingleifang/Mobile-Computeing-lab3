package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.lab3.databinding.ActivityMainBinding

private var correct_image: ImageView? = null
private lateinit var binding: ActivityMainBinding
private lateinit var listIntent: Intent

class RightAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_answer)




        correct_image = findViewById(R.id.imageViewCorrect)
        correct_image!!.setOnClickListener {
            // We've clicked, so now we need to do stuff
            listIntent = Intent(this, MainActivity::class.java)
            startActivity(listIntent)
        }
    }
}