package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.adapter.PhrasesAdapter
import com.example.ieltsapplication.databinding.ActivityCommonPhrasesBinding
import com.example.ieltsapplication.model.QuizModel
import com.example.ieltsapplication.model.Words
import java.util.*

class CommonPhrases : AppCompatActivity() {

    private lateinit var binding: ActivityCommonPhrasesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommonPhrasesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tts = TextToSpeech(this){
            Log.i("Vocabularies", "onCreate: $it")
        }
        tts.language = Locale.US

        val recyclerPhrase = binding.recyclerPhrase
        recyclerPhrase.layoutManager = LinearLayoutManager(this)

        val phraseList = ArrayList<Words>()

        phraseList.add(Words("A few", R.drawable.ic_bookimage))
        phraseList.add(Words("A little", R.drawable.ic_bookimage))
        phraseList.add(Words("A long time ago", R.drawable.ic_bookimage))
        phraseList.add(Words("A one way ticket", R.drawable.ic_bookimage))
        phraseList.add(Words("A round trip", R.drawable.ic_bookimage))
        phraseList.add(Words("About 300 kilometers", R.drawable.ic_bookimage))
        phraseList.add(Words("Across from the post office", R.drawable.ic_bookimage))
        phraseList.add(Words("All day", R.drawable.ic_bookimage))
        phraseList.add(Words("Am i pronouncing it correctly?", R.drawable.ic_bookimage))
        phraseList.add(Words("And you?", R.drawable.ic_bookimage))
        phraseList.add(Words("Anything else?", R.drawable.ic_bookimage))
        phraseList.add(Words("Are they the same?", R.drawable.ic_bookimage))

        val adapter = PhrasesAdapter(phraseList, tts)
        recyclerPhrase.adapter = adapter

    }
}