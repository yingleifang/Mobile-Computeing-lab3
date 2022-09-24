package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityMainBinding
import com.example.lab3.questions.EasyQuestions
import com.example.lab3.questions.HarderQuestions
import com.example.lab3.questions.Questions

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        var curQuestions: List<Questions> = EasyQuestions.questions
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.easyModeButton.setOnClickListener { launchEasy() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.hardModeButton.setOnClickListener { launchHard() }
    }

    private fun launchEasy() {
        setUpDisplay()
    }

    private fun launchHard() {
        curQuestions= HarderQuestions.questions
        setUpDisplay()
    }

    private fun setUpDisplay(){
        startActivity(Intent(this@MainActivity, VerticalListActivity::class.java))
    }
}