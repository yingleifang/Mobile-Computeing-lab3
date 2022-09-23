package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.easyModeButton.setOnClickListener { launchEasy() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.hardModeButton.setOnClickListener { launchHard() }
    }

    private fun launchEasy() {
        startActivity(Intent(this@MainActivity, MultipleChoiceQuestionActivity::class.java))
    }

    private fun launchHard() {
        startActivity(Intent(this@MainActivity, MultipleChoiceQuestionActivity::class.java))
    }
}