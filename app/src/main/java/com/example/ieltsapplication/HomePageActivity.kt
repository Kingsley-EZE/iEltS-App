package com.example.ieltsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieltsapplication.databinding.ActivityHomePageBinding
import com.example.ieltsapplication.writing.WritingActivity

class HomePageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.readingCard.setOnClickListener {
            startActivity(Intent(this,ReadingPageActivity::class.java))
        }

        binding.writingCard.setOnClickListener {
            startActivity(Intent(this,WritingActivity::class.java))
        }

        binding.listeningCard.setOnClickListener {
            startActivity(Intent(this,ListeningActivity::class.java))
        }
    }
}