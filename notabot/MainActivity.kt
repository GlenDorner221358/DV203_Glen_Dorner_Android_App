package com.example.notabot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.notabot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    //this makes 1 screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : ConstraintLayout = binding.root
        //this defines which xml layout is on front end
        setContentView(R.layout.activity_main)

        binding.username.setText("Text update working")

        binding.btnStart.setText("Button text updated")

        binding.btnStart.setOnClickListener{
            var username = binding.username.text
            if (username != null) {
                Log.d("AAA Invalid username", msg: "Please fill in username")
            } else {
                Log.d("AAA Captured Username ", username.toString())
                val intent = Intent(this, QuestionActivity::class.java)

                intent.putExtra("username", username)
                startActivity(intent)
            }

        }

    }
}