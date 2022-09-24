package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.lab3.databinding.ActivityMainBinding

private var wrong_image: ImageView? = null
private lateinit var binding: ActivityMainBinding
private lateinit var listIntent: Intent

class WrongAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)



        wrong_image = findViewById(R.id.wrong_answer_image)
        wrong_image!!.setOnClickListener {
            // We've clicked, so now we need to do stuff
            listIntent = Intent(this, MainActivity::class.java)
            startActivity(listIntent)
        }
    }
}