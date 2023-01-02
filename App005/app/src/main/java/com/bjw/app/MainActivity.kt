package com.bjw.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bjw.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            val addActivityIntent = Intent(
                this@MainActivity,
                AddActivity::class.java
            )
            startActivity(addActivityIntent)
        }

    }
}