package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.BrainSurgeon.databinding.ActivityCategoriesBinding

class Categories : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent?.getStringExtra("username")
        binding.userDisplay.text = "Hello, $username! Choose a category to get started!"

        var score = intent.extras?.getInt("score", 0)

        binding.btnAdhd.setText("ADHD: 0/3")
        binding.btnTism.setText("AUTISM 0/3")
        binding.btnDepro.setText("DEPRESSION: 0/3")


        binding.btnAdhd.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
//            store/pass username
            intent.putExtra("username", username.toString())
            startActivity(intent)
            finish()
        }
        binding.btnTism.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
            intent.putExtra("username", username.toString())
            startActivity(intent)
            finish()
        }
        binding.btnDepro.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
            intent.putExtra("username", username.toString())
            startActivity(intent)
            finish()
        }
        binding.btnSettings.setOnClickListener() {
            val intent = Intent(this@Categories, Settings::class.java)
            startActivity(intent)
        }
    }
}