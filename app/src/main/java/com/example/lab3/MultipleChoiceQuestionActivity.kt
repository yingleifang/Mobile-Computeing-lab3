package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityMultipleChoiceQuestionBinding
import com.example.lab3.questions.EasyQuestions
import com.example.lab3.questions.Questions
import kotlin.random.Random

class MultipleChoiceQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMultipleChoiceQuestionBinding

    var curQuestions: List<Questions> = EasyQuestions.questions


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMultipleChoiceQuestionBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_multiple_choice_question)
        var index = Random.nextInt(0, curQuestions.size)
        binding.textView2.text = curQuestions[index].get_question()
        var choices = curQuestions[index].get_answer_choices()
        binding.radioButton2.text = choices[0]
        binding.radioButton3.text = choices[1]
        binding.radioButton4.text = choices[2]
        binding.radioButton5.text = choices[3]
    }
}