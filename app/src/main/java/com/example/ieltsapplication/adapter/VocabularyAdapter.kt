package com.example.ieltsapplication.adapter

import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.Details
import de.hdodenhof.circleimageview.CircleImageView

class VocabularyAdapter( val details : ArrayList<Details>, private val tts: TextToSpeech) : RecyclerView.Adapter<VocabularyAdapter.ViewHolder> () {


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle1 : TextView = itemView.findViewById(R.id.tv_title3)
        var itemDetails1 : TextView = itemView.findViewById(R.id.tv_description3)
        var itemPicture1 : CircleImageView = itemView.findViewById(R.id.iv_image3)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.vocabulary_items,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val details : Details = details[position]
        holder.itemTitle1.text = details.title
        holder.itemDetails1.text = details.desc
        holder.itemPicture1.setImageResource(details.image!!)

        holder.itemView.setOnClickListener {
            tts.speak(holder.itemTitle1.text.toString(), TextToSpeech.QUEUE_FLUSH, null, holder.itemTitle1.text.toString())
        }
    }

    override fun getItemCount(): Int {
       return details.size
    }



}