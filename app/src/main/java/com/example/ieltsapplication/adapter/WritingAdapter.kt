package com.example.ieltsapplication.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.Details

class WritingAdapter(val detailsLists : ArrayList<Details>) : RecyclerView.Adapter<WritingAdapter.WritingViewHolder>() {

    inner class WritingViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val writingTitle = itemView.findViewById<TextView>(R.id.tv_title_writing)
        val writingDesc = itemView.findViewById<TextView>(R.id.tv_description_writing)
        val writingImage = itemView.findViewById<ImageView>(R.id.iv_image_writing)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WritingViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.writing_items,parent,false)
        return WritingViewHolder(v)
    }

    override fun onBindViewHolder(holder: WritingViewHolder, position: Int) {
        val details : Details = detailsLists[position]
        holder.writingTitle.text = details.title
        holder.writingDesc.text = details.desc
        holder.writingImage.setImageResource(details.image!!)

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("input", details.desc!!)
            Navigation.findNavController(holder.itemView).navigate(R.id.action_writinListFragment_to_writingDetailsFragment,bundle)
        }
    }

    override fun getItemCount(): Int {
       return detailsLists.size
    }
}