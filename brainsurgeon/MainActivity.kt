package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : ConstraintLayout = binding.root
        setContentView(binding.root)

        binding.btnStart.setOnClickListener() {
            var username = binding.username.text
            if (username != null) {
                if (username.isBlank()) {
                    Log.d("bababooie Invalid username", "Please actually type username")
                    Toast.makeText(this, "Please enter a username", Toast.LENGTH_SHORT).show()
                } else {
                    Log.d("bababooie Thank you ", username.toString())
                    val intent = Intent(this@MainActivity, Categories::class.java)

                    intent.putExtra("username", username.toString())
                    startActivity(intent)
                }
            }

        }

    }
}