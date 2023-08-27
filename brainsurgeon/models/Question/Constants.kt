package com.example.brainsurgeon.models.Question

import com.example.BrainSurgeon.R

object Constants {
    //array for the questions
    var arrQuestions = ArrayList<Question>()
    //fixes the progress number error
    fun clearAllQuestions(){
        arrQuestions.clear()
    }


    //array for the autism questions
    var autQuestions = ArrayList<Question>()
    //fixes the progress number error
    fun clearAutQuestions(){
        autQuestions.clear()
    }


    //array for the autism questions
    var depQuestions = ArrayList<Question>()
    //fixes the progress number error
    fun clearDepQuestions(){
        depQuestions.clear()
    }

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
            optionOne = "The H in ADHD stands for Hyperactive",
            optionTwo = "People with ADHD are always active",
            optionThree = "",
            correctAnswer = "The H in ADHD stands for Hyperactive"
        )
        val que3 = Question(
            3,
            "ADHD symptoms can be alleviated by:",
            R.drawable.joeofbiden,
            "Yelling at the person experiencing symptoms",
            "Ignoring them",
            "Getting Diagnosed and treated",
            "Getting Diagnosed and treated"
        )
        val que4 = Question(
            4,
            "Which is a symptom of ADHD?",
            R.drawable.predator,
            "Impending sense of doom at all times",
            "Sleeping a lot in the evenings",
            "Forgetting what other people asked you to do",
            "Forgetting what other people asked you to do"
        )
        //Actually add questions to array because the above code doesn't lmao
        arrQuestions.add(que1)
        arrQuestions.add(que2)
        arrQuestions.add(que3)
        arrQuestions.add(que4)
    }


    //function to populate questions
    fun getAutQuestions(){
        //Define all questions
        val autque1 = Question(
            1,
            "Which of the following is true?",
            R.drawable.conformity,
            "Autistic people have trouble with social interactions",
            "Autistic people have trouble controlling their muscles",
            "Autistic people cannot read or write",
            "Autistic people have trouble with social interactions"
        )
        val autque2 = Question(
            id = 2,
            questionText = "Which of the following is False?",
            icon = R.drawable.crazedgunman,
            optionOne = "Autism is a spectrum",
            optionTwo = "Symptoms of Autism vary from person to person",
            optionThree = "Autism is a CIA conspiracy to sell more puzzle pieces",
            correctAnswer = "Autism is a CIA conspiracy to sell more puzzle pieces"
        )
        val autque3 = Question(
            3,
            "People with Autism are more prone to having perfect pitch",
            R.drawable.joeofbiden,
            "False",
            "True",
            "",
            "True"
        )
        val autque4 = Question(
            4,
            "What percent of people today are diagnosed with ASD worldwide?",
            R.drawable.predator,
            "9.29%",
            "5%",
            "1%",
            "1%"
        )
        val autque5 = Question(
            4,
            "Which is NOT a symptom of ASD?",
            R.drawable.gangstalker,
            "Being a nonverbal communicator",
            "Profound learning disability",
            "A strong morning routine, which when broken can make them upset",
            "Profound learning disability"
        )
        //Actually add questions to array because the above code doesn't lmao
        autQuestions.add(autque1)
        autQuestions.add(autque2)
        autQuestions.add(autque3)
        autQuestions.add(autque4)
        autQuestions.add(autque5)
    }


    //function to populate questions
    fun getDepQuestions(){
        //Define all questions
        val depque1 = Question(
            1,
            "What percentage of people suffer from Depression worldwide?",
            R.drawable.conformity,
            "14%",
            "4.5%",
            "5%",
            "5%"
        )
        val depque2 = Question(
            id = 2,
            questionText = "How many people take their own lives worldwide per year?",
            icon = R.drawable.crazedgunman,
            optionOne = "150 million",
            optionTwo = "700 000",
            optionThree = "475 000",
            correctAnswer = "700 000"
        )
        val depque3 = Question(
            3,
            "Which of these are NOT symptoms of depression?",
            R.drawable.joeofbiden,
            "Poor concentration",
            "Frequent urination",
            "Disrupted sleep",
            "Frequent urination"
        )
        val depque4 = Question(
            4,
            "What is a telltale sign of depression?",
            R.drawable.predator,
            "Listening to sad music",
            "Losing interest in previous hobbies",
            "Telling everyone you have depression",
            "Losing interest in previous hobbies"
        )
        val depque5 = Question(
            4,
            "If you suffer from depression, how can you perform self-care?",
            R.drawable.gangstalker,
            "Exercise regularly",
            "Rest and stay inside",
            "Stay up a little later than usual",
            "Exercise regularly"
        )
        val depque6 = Question(
            4,
            "Which of the following is FALSE?",
            R.drawable.crazedgunman,
            "MEN are more likely to be diagnosed than WOMEN",
            "There is effective treatment for mild, moderate and even severe depression",
            "Depression is a common mental disorder",
            "MEN are more likely to be diagnosed than WOMEN"
        )
        //Actually add questions to array because the above code doesn't lmao
        depQuestions.add(depque1)
        depQuestions.add(depque2)
        depQuestions.add(depque3)
        depQuestions.add(depque4)
        depQuestions.add(depque5)
        depQuestions.add(depque6)
    }

}