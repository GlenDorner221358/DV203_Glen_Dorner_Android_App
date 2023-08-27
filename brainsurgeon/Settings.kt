package com.example.brainsurgeon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent?.getStringExtra("username")

        binding.btnReset.setOnClickListener() {
            //Reset scores
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.apply{
                putInt("last_ADHD_score", 0)
                putInt("last_Aut_score", 0)
                putInt("last_Dep_score", 0)
                apply() //actually saves the edits
            }

            //tell me the scores are rest
            Toast.makeText(this, "High scores successfully reset!", Toast.LENGTH_LONG).show()
        }

        binding.btnSettings2.setOnClickListener() {
            val intent = Intent(this@Settings, Categories::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }


    }
}