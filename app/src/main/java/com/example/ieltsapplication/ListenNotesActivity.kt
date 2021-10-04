package com.example.ieltsapplication

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.ieltsapplication.databinding.ActivityListenNotesBinding
import java.util.*

class ListenNotesActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding : ActivityListenNotesBinding
    private var tts : TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListenNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this,this)

        val bundle = intent
        val text = bundle.getStringExtra("value")
        val details = binding.tvListenDetails
        details.text = text

        binding.fab.setOnClickListener {
            tts!!.speak(details.text.toString(), TextToSpeech.QUEUE_FLUSH, null, "")
            binding.fab.visibility = View.GONE
            binding.fab2.visibility = View.VISIBLE

        }

        binding.fab2.setOnClickListener {
            tts!!.stop()
            binding.fab2.visibility = View.GONE
            binding.fab.visibility = View.VISIBLE

        }

    }

    override fun onInit(status: Int) {

        if (status == TextToSpeech.SUCCESS){
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Toast.makeText(this@ListenNotesActivity, "The language is not supported", Toast.LENGTH_SHORT).show()
            }
            }else{
            Toast.makeText(this@ListenNotesActivity, "No Text To Speech on your device", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroy() {
        if (tts != null){
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
}