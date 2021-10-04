package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.adapter.PhrasesAdapter
import com.example.ieltsapplication.databinding.ActivityCommonWordsBinding
import com.example.ieltsapplication.model.QuizModel
import com.example.ieltsapplication.model.Words
import java.util.*

class CommonWords : AppCompatActivity() {

    private lateinit var binding : ActivityCommonWordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommonWordsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tts = TextToSpeech(this){
            Log.i("Vocabularies", "onCreate: $it")
        }
        tts.language = Locale.US

        val recyclerWords = binding.recyclerCommon
        recyclerWords.layoutManager = LinearLayoutManager(this)

        val wordList = ArrayList<Words>()

        wordList.add(Words("Able", R.drawable.ic_bookimage))
        wordList.add(Words("About", R.drawable.ic_bookimage))
        wordList.add(Words("Above", R.drawable.ic_bookimage))
        wordList.add(Words("Accept", R.drawable.ic_bookimage))
        wordList.add(Words("Accident", R.drawable.ic_bookimage))
        wordList.add(Words("Accompany", R.drawable.ic_bookimage))
        wordList.add(Words("Actor", R.drawable.ic_bookimage))
        wordList.add(Words("Actually", R.drawable.ic_bookimage))
        wordList.add(Words("Add", R.drawable.ic_bookimage))
        wordList.add(Words("Address", R.drawable.ic_bookimage))
        wordList.add(Words("Adjective", R.drawable.ic_bookimage))
        wordList.add(Words("Adverb", R.drawable.ic_bookimage))
        wordList.add(Words("Advertisement", R.drawable.ic_bookimage))

        val adapter = PhrasesAdapter(wordList, tts)
        recyclerWords.adapter = adapter
    }
}