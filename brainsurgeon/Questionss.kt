package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.BrainSurgeon.databinding.ActivityQuestionssBinding
import com.example.brainsurgeon.models.Question.Constants.arrQuestions
import com.example.brainsurgeon.models.Question.Constants.autQuestions
import com.example.brainsurgeon.models.Question.Constants.clearAllQuestions
import com.example.brainsurgeon.models.Question.Constants.clearAutQuestions
import com.example.brainsurgeon.models.Question.Constants.clearDepQuestions
import com.example.brainsurgeon.models.Question.Constants.depQuestions
import com.example.brainsurgeon.models.Question.Constants.getAllQuestions
import com.example.brainsurgeon.models.Question.Constants.getAutQuestions
import com.example.brainsurgeon.models.Question.Constants.getDepQuestions

class Questionss : AppCompatActivity() {

    lateinit var binding: ActivityQuestionssBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionssBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent?.getStringExtra("username")
        val questionNumber = intent.getIntExtra("questionNumber", 1)
        var score = intent.extras?.getInt("score", 0)

        val category = intent.extras?.getInt("catbut", 1)


//        check which button was pressed
        if (category == 1) {



            if(questionNumber == 1) {
                clearAllQuestions()
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
            if(currentQuestion.optionThree.isNullOrBlank()){
                binding.rb3.isVisible = false
            }else {
                binding.rb3.text = currentQuestion.optionThree
            }
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
                        intent.putExtra("catbut", 1)
                        intent.putExtra("totalQuestions", listOfQuestions.count())
                        intent.putExtra("username", username.toString())
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        val intent = Intent(this, Questionss::class.java)
                        intent.putExtra("catbut", 1)
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


        } else if (category == 2) {

            if(questionNumber == 1) {
                clearAutQuestions()
                getAutQuestions()
            }

            val listOfQuestions = autQuestions
            val currentQuestion = listOfQuestions[questionNumber-1]

            //        Display questions
            binding.tbTitle.title = "Question ${currentQuestion.id}"
            binding.queTitle.text = currentQuestion.questionText
            binding.queImg.setImageResource(currentQuestion.icon)
            binding.proggers.max = listOfQuestions.count()
            binding.rb1.text = currentQuestion.optionOne
            binding.rb2.text = currentQuestion.optionTwo
            if(currentQuestion.optionThree.isNullOrBlank()){
                binding.rb3.isVisible = false
            }else {
                binding.rb3.text = currentQuestion.optionThree
            }
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
                        intent.putExtra("catbut", 2)
                        intent.putExtra("totalQuestions", listOfQuestions.count())
                        intent.putExtra("username", username.toString())
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        val intent = Intent(this, Questionss::class.java)
                        intent.putExtra("catbut", 2)
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

        } else {

            if(questionNumber == 1) {
                clearDepQuestions()
                getDepQuestions()
            }

            val listOfQuestions = depQuestions
            val currentQuestion = listOfQuestions[questionNumber-1]

            //        Display questions
            binding.tbTitle.title = "Question ${currentQuestion.id}"
            binding.queTitle.text = currentQuestion.questionText
            binding.queImg.setImageResource(currentQuestion.icon)
            binding.proggers.max = listOfQuestions.count()
            binding.rb1.text = currentQuestion.optionOne
            binding.rb2.text = currentQuestion.optionTwo
            if(currentQuestion.optionThree.isNullOrBlank()){
                binding.rb3.isVisible = false
            }else {
                binding.rb3.text = currentQuestion.optionThree
            }
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
                        intent.putExtra("catbut", 3)
                        intent.putExtra("totalQuestions", listOfQuestions.count())
                        intent.putExtra("username", username.toString())
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        val intent = Intent(this, Questionss::class.java)
                        intent.putExtra("catbut", 3)
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
}