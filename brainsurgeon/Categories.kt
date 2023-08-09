package com.example.brainsurgeon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivityCategoriesBinding

class Categories : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(R.layout.activity_categories)

        val username = intent?.extras?.getString("username")

        binding.userDisplay.text = "Hi, $username"

        Log.d("Hi : ", username.toString())




    }
}