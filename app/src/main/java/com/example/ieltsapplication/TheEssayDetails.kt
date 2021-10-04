package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieltsapplication.databinding.ActivityTheEssayDetailsBinding

class TheEssayDetails : AppCompatActivity() {

    private lateinit var binding: ActivityTheEssayDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTheEssayDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras

        binding.tvDesc1.text = bundle?.getString("Data")
    }
}