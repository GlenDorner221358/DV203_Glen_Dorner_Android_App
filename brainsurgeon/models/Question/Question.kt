package com.example.brainsurgeon.models.Question
//Blueprint
data class Question(
    val id: Int,
    val questionText: String,
    val icon: Int,  //Images are stored as an integer value
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String?,   // '?' means this value can be null or nothing
    val correctAnswer: String
)
