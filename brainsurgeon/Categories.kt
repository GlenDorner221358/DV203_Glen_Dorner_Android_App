package com.example.brainsurgeon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.BrainSurgeon.databinding.ActivityCategoriesBinding
import com.google.android.material.snackbar.Snackbar

class Categories : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val lastADHDScore = sharedPref.getInt("last_ADHD_score", 0)
        val lastAutScore = sharedPref.getInt("last_Aut_score", 0)
        val lastDepScore = sharedPref.getInt("last_Dep_score", 0)


        val username = intent?.getStringExtra("username")
        binding.userDisplay.text = "Hi $username! Choose a category to get started!"

        var score = intent.extras?.getInt("score", 0)

        binding.btnAdhd.setText("ADHD: " + lastADHDScore.toString() + "/4")
        binding.btnTism.setText("AUTISM: " + lastAutScore.toString() + "/5")
        binding.btnDepro.setText("DEPRESSION: " + lastDepScore.toString() + "/6")


        binding.btnAdhd.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
//            store/pass username
            intent.putExtra("username", username.toString())
            intent.putExtra("catbut", 1)
            startActivity(intent)
            finish()
        }
        binding.btnTism.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catbut", 2)
            startActivity(intent)
            finish()
        }
        binding.btnDepro.setOnClickListener() {
            val intent = Intent(this@Categories, Questionss::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catbut", 3)
            startActivity(intent)
            finish()
        }
        binding.btnSettings.setOnClickListener() {
            val intent = Intent(this@Categories, Settings::class.java)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }
    }
}