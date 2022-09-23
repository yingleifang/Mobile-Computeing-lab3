package com.example.lab3.questions


object HarderQuestions {

    val questions : List<Questions> = listOf(
        Questions(
            "(8*6)/(4*4)",
            "6",
            arrayOf<String>()
        ),
        Questions(
            "(810-81*10)/801)",
            "2",
            arrayOf("1", "10", "0", "8")
        ),
        Questions(
            "27*3/(1/2)",
            "162",
            arrayOf<String>()
        ),
        Questions(
            "11*11-2",
            "1",
            arrayOf("121", "119", "130", "142")
        ),
        Questions(
            "(-1*(1-(17*3))",
            "50",
            arrayOf<String>()
        ),
        Questions(
            "9*9-8*8+3*3-1",
            "0",
            arrayOf("25", "17", "16", "34")
        ),
        Questions(
            "17*4*2/6",
            "17",
            arrayOf<String>()
        ),
        Questions(
            "2^7",
            "2",
            arrayOf("32", "64", "128", "256")
        ),
        Questions(
            "4!",
            "24",
            arrayOf<String>()
        ),
        Questions(
            "(8/4)*(10/5)*(24/6)",
            "1",
            arrayOf("8", "16", "32", "64")
        ),
    )
}