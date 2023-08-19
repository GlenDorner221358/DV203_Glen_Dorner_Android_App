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
        var score = intent.extras?.getInt("score", 0)


//        update ui
        if (score == totalQuestions) {
            binding.username2.text = "Congratulations " + username.toString() + "!"
        }else{
            binding.graphix.setImageResource(R.drawable.finishline)
            binding.username2.text = "So close " + username.toString() + "!"
        }

        binding.finalscore.text = "You scored: " + score.toString() + "/" + totalQuestions.toString()

//        save results
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString("last_user", username)
            putInt("last_score", score!!)
            apply() //actually saves the edits
        }

        binding.back2Cat.setOnClickListener() {
            val intent = Intent(this@Results, Categories::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }

    }
}