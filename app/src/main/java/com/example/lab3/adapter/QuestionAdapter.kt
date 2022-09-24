package com.example.lab3.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.MainActivity.Companion.curQuestions
import com.example.lab3.R
import com.example.lab3.RightAnswerActivity
import com.example.lab3.WrongAnswerActivity


/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class QuestiondAdapter(
    private val context: Context?,
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * Initialize view elements
     */
    class MultipleChoiceViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val curView: View? = view
        val question: TextView = view!!.findViewById(R.id.questionText)
        val choice1: RadioButton = view!!.findViewById(R.id.radioButton2)
        val choice2: RadioButton = view!!.findViewById(R.id.radioButton3)
        val choice3: RadioButton = view!!.findViewById(R.id.radioButton4)
        val choice4: RadioButton = view!!.findViewById(R.id.radioButton5)

        private val submitButton: Button = view!!.findViewById(R.id.submit_button)

        fun updateEvent(answer: String, view: View?){
            submitButton.setOnClickListener {
                val curChoice = when{
                    choice1.isChecked ->0
                    choice2.isChecked ->1
                    choice3.isChecked ->2
                    else ->3

                }
                Log.d("", curChoice.toString())
                Log.d("", answer)
                if (curChoice == answer.toInt()){
                    view!!.getContext().startActivity(Intent(view.getContext(), RightAnswerActivity::class.java));
                }else{
                    view!!.getContext().startActivity(Intent(view.getContext(), WrongAnswerActivity::class.java));
                }
            }
        }
    }

    class WrittenQuestionViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {

        private val submitButton: Button = view!!.findViewById(R.id.submit_button)
        val question: TextView = view!!.findViewById(R.id.questionText)
        val curChoice: EditText = view!!.findViewById(R.id.answerInput)

        fun updateEvent(answer: String, context: Context?){
            submitButton.setOnClickListener {
                if (curChoice.text.toString() == answer){
                    context?.startActivity(Intent(context, RightAnswerActivity::class.java));

                }else{
                    context?.startActivity(Intent(context, WrongAnswerActivity::class.java));
                }
            }
        }
    }


    override fun getItemViewType(position: Int): Int {
        return if (curQuestions[position].is_mc()) {
            0
        }else {
            1
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var curLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_multiple_choice_question, parent, false)
        if (viewType == 1){
            curLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_written_question, parent, false)
            return WrittenQuestionViewHolder(curLayout)
        }
        return MultipleChoiceViewHolder(curLayout)
    }

    override fun getItemCount(): Int = curQuestions.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val resources = context?.resources
        val question = curQuestions[position]
        if (holder is MultipleChoiceViewHolder){
            holder.question.text = question.get_question()
            holder.choice1.text = question.get_answer_choices()[0]
            holder.choice2.text = question.get_answer_choices()[1]
            holder.choice3.text = question.get_answer_choices()[2]
            holder.choice4.text = question.get_answer_choices()[3]
            holder.updateEvent(question.get_answer(), holder.curView)
        }else if (holder is WrittenQuestionViewHolder){
            holder.question.text = question.get_question()
            holder.updateEvent(question.get_answer(), context)
        }


    }
}
