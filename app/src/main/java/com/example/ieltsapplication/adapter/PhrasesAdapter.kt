package com.example.ieltsapplication.adapter

import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.QuizModel
import com.example.ieltsapplication.model.Words
import de.hdodenhof.circleimageview.CircleImageView

class PhrasesAdapter(val phraseDetails : ArrayList<Words>, private val tts: TextToSpeech) : RecyclerView.Adapter<PhrasesAdapter.ViewHolder>() {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle : TextView = itemView.findViewById(R.id.tv_phrase_title)
        var itemPicture : CircleImageView = itemView.findViewById(R.id.iv_image_phrase)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.phrase_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val phraseDetails : Words = phraseDetails[position]
        holder.itemTitle.text = phraseDetails.title
        holder.itemPicture.setImageResource(phraseDetails.image!!)

        holder.itemView.setOnClickListener {
            tts.speak(holder.itemTitle.text.toString(), TextToSpeech.QUEUE_FLUSH, null, holder.itemTitle.text.toString())
        }
    }

    override fun getItemCount(): Int {
        return phraseDetails.size
    }
}