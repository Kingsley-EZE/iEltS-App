 package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.adapter.VocabularyAdapter
import com.example.ieltsapplication.databinding.ActivityVocabulariesBinding
import com.example.ieltsapplication.model.Details
import java.util.*
import kotlin.collections.ArrayList

 class Vocabularies : AppCompatActivity() {

     private lateinit var binding: ActivityVocabulariesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVocabulariesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tts = TextToSpeech(this){
            Log.i("Vocabularies", "onCreate: $it")
        }
        tts.language = Locale.US

        val recyclerVoc = binding.recyclerVoca
        recyclerVoc.layoutManager = LinearLayoutManager(this)
        val details = ArrayList<Details>()

        details.add(Details("Abandon", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia.\n" +
                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia.\n" +
                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia.", R.drawable.ic_menu_book))
        details.add(Details("Abstract", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.ic_menu_book))
        details.add(Details("Academy", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia", R.drawable.ic_menu_book))
        details.add(Details("Access", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia", R.drawable.ic_menu_book))
        details.add(Details("Accommodate", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia", R.drawable.ic_menu_book))
        details.add(Details("Accompany", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia", R.drawable.ic_menu_book))
        details.add(Details("Accumulate", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia", R.drawable.ic_menu_book))
        details.add(Details("Accurate", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.ic_menu_book))

        val adapter = VocabularyAdapter(details, tts)
        recyclerVoc.adapter = adapter
    }
}