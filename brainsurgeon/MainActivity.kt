package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : ConstraintLayout = binding.root
        setContentView(R.layout.activity_main)

        binding.btnStart.setOnClickListener{
            val username = binding.username.text
            if (username != null) {
                if (username.isBlank()) {
                    Log.d("Invalid username", "Please actually type a name")
                } else {
                    Log.d("Thank you ", username.toString())
                    val intent = Intent(this, Categories::class.java)

                    intent.putExtra("username", username.toString())
                    startActivity(intent)
                }
            }

        }

    }
}