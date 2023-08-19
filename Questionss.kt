package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.BrainSurgeon.databinding.ActivityQuestionssBinding
import com.example.brainsurgeon.models.Question.Constants.arrQuestions
import com.example.brainsurgeon.models.Question.Constants.getAllQuestions

class Questionss : AppCompatActivity() {

    lateinit var binding: ActivityQuestionssBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionssBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent?.getStringExtra("username")
        val questionNumber = intent.getIntExtra("questionNumber", 1)
        Log.d("Welcome: ", username.toString())
        var score = intent.extras?.getInt("score", 0)
        Log.d("USER SCORE: ", score.toString())

//        call questions
        if(questionNumber == 1) {
            getAllQuestions()
        }

        val listOfQuestions = arrQuestions
        val currentQuestion = listOfQuestions[questionNumber-1]

//        Display questions
        binding.tbTitle.title = "Question ${currentQuestion.id}"
        binding.queTitle.text = currentQuestion.questionText
        binding.queImg.setImageResource(currentQuestion.icon)
        binding.proggers.max = listOfQuestions.count()
        binding.rb1.text = currentQuestion.optionOne
        binding.rb2.text = currentQuestion.optionTwo
        binding.rb3.text = currentQuestion.optionThree
        binding.proggers.progress = currentQuestion.id
        binding.proggerstxt.text = "${questionNumber}/${listOfQuestions.count()}"

        //        Navigate to next question
        binding.btnNext.setOnClickListener {
            val selectedAnswer: Int = binding.rgOptions.checkedRadioButtonId

            if(selectedAnswer != -1) {
                val selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)

                if(selectedAnswerValue.text == currentQuestion.correctAnswer) {
                    score = score!! + 1
                }

//                navigate to results screen after final question
                if(questionNumber == listOfQuestions.count()) {
                    Log.d("Final Score: ", score.toString())
                    val intent = Intent(this, Results::class.java)
                    intent.putExtra("totalQuestions", listOfQuestions.count())
                    intent.putExtra("username", username.toString())
                    intent.putExtra("score", score)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this, Questionss::class.java)
                    intent.putExtra("questionNumber", questionNumber+1)
                    intent.putExtra("username", username.toString())
                    intent.putExtra("score", score)
                    startActivity(intent)
                    finish()
                }

            } else {
                Toast.makeText(this, "Please choose an answer", Toast.LENGTH_LONG).show()
            }
        }
    }
}