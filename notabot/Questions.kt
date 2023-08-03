package com.example.notabot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val username = intent?.getStringExtra("username")

        Log.d("AAA Welcome: ", username.toString())
    }
}