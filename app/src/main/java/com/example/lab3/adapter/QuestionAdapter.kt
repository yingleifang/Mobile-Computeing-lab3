package com.example.lab3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.MainActivity.Companion.curQuestions
import com.example.lab3.R

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
        val question: TextView = view!!.findViewById(R.id.questionText)
        val choice1: TextView = view!!.findViewById(R.id.radioButton2)
        val choice2: TextView = view!!.findViewById(R.id.radioButton3)
        val choice3: TextView = view!!.findViewById(R.id.radioButton4)
        val choice4: TextView = view!!.findViewById(R.id.radioButton5)

    }

    class WrittenQuestionViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val question: TextView = view!!.findViewById(R.id.questionText)
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
        }else if (holder is WrittenQuestionViewHolder){
            holder.question.text = question.get_question()
        }


    }
}
