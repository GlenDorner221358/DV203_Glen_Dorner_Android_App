package com.example.brainsurgeon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivityResultsBinding

class Results : AppCompatActivity() {
    lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        get results
        val username = intent?.extras?.getString("username")
        val totalQuestions = intent.getIntExtra("totalQuestions", 0)
        var score = intent.getIntExtra("score", 0)
        val category = intent.extras?.getInt("catbut", 1)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val lastADHDScore = sharedPref.getInt("last_ADHD_score", 0)
        val lastAutScore = sharedPref.getInt("last_Aut_score", 0)
        val lastDepScore = sharedPref.getInt("last_Dep_score", 0)


//        update ui
        if (score == totalQuestions) {
            binding.username2.text = "Congratulations " + username.toString() + "!"
        }else{
            binding.graphix.setImageResource(R.drawable.finishline)
            binding.username2.text = "So close " + username.toString() + "!"
        }

        binding.finalscore.text = "You scored: " + score.toString() + "/" + totalQuestions.toString()

//        save results
        if (category == 1) {
            if (lastADHDScore < score) {
                val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.apply {
                    putInt("last_ADHD_score", score!!)
                    apply() //actually saves the edits
                }
            }

            //nothing

        } else if (category == 2) {
            if (lastAutScore < score) {
                val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.apply{
                    putInt("last_Aut_score", score!!)
                    apply() //actually saves the edits
                }
            }
            //nothing
        } else {
            if (lastDepScore < score) {
                val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.apply {
                    putInt("last_Dep_score", score!!)
                    apply() //actually saves the edits
                }
            }
            //nothing
        }


        binding.back2Cat.setOnClickListener() {
            val intent = Intent(this@Results, Categories::class.java)
            intent.putExtra("username", username.toString())
            startActivity(intent)
            finish()
        }

    }
}