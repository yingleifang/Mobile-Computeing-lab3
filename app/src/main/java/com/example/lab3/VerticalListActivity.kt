package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.adapter.QuestiondAdapter
import com.example.lab3.databinding.VerticalQuestionListBinding
import com.example.lab3.questions.EasyQuestions

class VerticalListActivity : AppCompatActivity() {

    var CurQuestion = EasyQuestions.questions[0]

    private lateinit var binding: VerticalQuestionListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = VerticalQuestionListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = QuestiondAdapter(applicationContext)

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}