package com.example.brainsurgeon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.BrainSurgeon.R
import com.example.BrainSurgeon.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


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

//        view last score
        binding.lastscore.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            val lastUser = sharedPref.getString("last_user", "No user found")
            val lastScore = sharedPref.getInt("last_score", 0)

            Log.d("LAST USER FROM STORAGE: ", lastUser + lastScore.toString())

            val snack = Snackbar.make(it, lastUser!!, Snackbar.LENGTH_LONG)
            snack.setAction(lastScore.toString(), View.OnClickListener{
                //nothing
            })
            snack.show()
        }

    }
}