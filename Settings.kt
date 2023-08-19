package com.example.brainsurgeon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnSettings2.setOnClickListener() {
            val intent = Intent(this@Settings, Categories::class.java)
            startActivity(intent)
        }


    }
}