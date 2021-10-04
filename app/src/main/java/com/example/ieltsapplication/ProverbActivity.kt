package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.adapter.VocabularyAdapter
import com.example.ieltsapplication.databinding.ActivityProverbBinding
import com.example.ieltsapplication.model.Details
import java.util.*

class ProverbActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProverbBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProverbBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tts = TextToSpeech(this){
            Log.i("Vocabularies", "onCreate: $it")
        }
        tts.language = Locale.US

        val recyclerPro = binding.recyclerProverb
        recyclerPro.layoutManager = LinearLayoutManager(this)
        val details = ArrayList<Details>()

        details.add(Details("A bad excuse is better than none.", "Always give an excuse, even if its a poor one", R.drawable.ic_readbook))
        details.add(Details("A bad penny always turns up.", "An unwanted or disreputable person constantly comes back", R.drawable.ic_readbook))
        details.add(Details("A bad tree does not yield good fruit.", "A bad parent does not raise good children", R.drawable.ic_readbook))
        details.add(Details("A bird in hand is worth two in a bush.", "Be happy with what you have.(What you have is worth more than what you don't have)", R.drawable.ic_readbook))
        details.add(Details("A broken friendship maybe soldered but will never be sound.", "Friendship can be rebuilt after dispute but can never be as strong as before", R.drawable.ic_readbook))
        details.add(Details("Actions speak louder than words.", "Actions are a better reflection of one’s character because it’s easy to say things, but difficult to act on them and follow through", R.drawable.ic_readbook))

        val adapter = VocabularyAdapter(details, tts)
        recyclerPro.adapter = adapter

    }
}