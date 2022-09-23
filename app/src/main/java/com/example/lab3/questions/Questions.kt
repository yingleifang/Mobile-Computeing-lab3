package com.example.lab3.questions

class Questions (questionz : String, answerz : String, choices : Array<String>) {

    private val question = questionz;
    private val answer = answerz;
    private val answerChoices = choices;

    fun get_answer() : String {
        return answer;
    }

    fun get_question() : String {
        return question;
    }

    fun get_answer_choices() : Array<String> {
        return answerChoices;
    }

    fun is_mc() : Boolean {
        return (answerChoices.isNotEmpty());
    }

    fun is_written() : Boolean {
        return (answerChoices.isEmpty())
    }
}