package com.example.ieltsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieltsapplication.databinding.ActivityReadingPageBinding

class ReadingPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityReadingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.essayButton.setOnClickListener {
            startActivity(Intent(this, TheEssay::class.java))
        }

        binding.storyButton.setOnClickListener {
            startActivity(Intent(this, StoryActivity::class.java))
        }

        binding.Vocabulary.setOnClickListener {
            startActivity(Intent(this, Vocabularies::class.java))
        }

        binding.theQuizButton.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }

        binding.phrasesButton.setOnClickListener {
            startActivity(Intent(this, CommonPhrases::class.java))
        }

        binding.commonWordsButton.setOnClickListener {
            startActivity(Intent(this, CommonWords::class.java))
        }



        binding.proverbsBtn.setOnClickListener {
            startActivity(Intent(this, ProverbActivity::class.java))
        }
    }
}