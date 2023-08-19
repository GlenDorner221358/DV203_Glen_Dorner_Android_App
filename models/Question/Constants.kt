package com.example.brainsurgeon.models.Question

import com.example.BrainSurgeon.R

object Constants {
    //array for the questions
    var arrQuestions = ArrayList<Question>()

    //function to populate questions
    fun getAllQuestions(){
        //Define all questions
        val que1 = Question(
            1,
            "How much do people with ADHD struggle with focusing?",
            R.drawable.conformity,
            "A Lot all the time",
            "It depends",
            "Never at all",
            "It depends"
        )
        val que2 = Question(
            id = 2,
            questionText = "Which of the following is true:",
            icon = R.drawable.crazedgunman,
            optionOne = "Autism is a spectrum",
            optionTwo = "Autism is a set of predetermined symptoms",
            optionThree = "Autism is a CIA conspiracy to sell more puzzle pieces",
            correctAnswer = "Autism is a spectrum"
        )
        val que3 = Question(
            3,
            "Which of these are symptoms of Generalized Anxiety Disorder?",
            R.drawable.joeofbiden,
            "General Anxiety",
            "Trouble focusing",
            "Big balls lmao",
            "General Anxiety"
        )
        val que4 = Question(
            4,
            "What is a telltale sign of depression?",
            R.drawable.predator,
            "Listening to sad music",
            "Losing interest in previous hobbies",
            "Telling everyone you have depression",
            "Losing interest in previous hobbies"
        )
        //Actually add questions to array because the above code doesn't lmao
        arrQuestions.add(que1)
        arrQuestions.add(que2)
        arrQuestions.add(que3)
        arrQuestions.add(que4)
    }
}