package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.BrainSurgeon.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent( this@Splash, MainActivity::class.java)
            Log.d("welcome", "app is working")
            startActivity(intent)
            finish()
        }, 2000)
    }
}