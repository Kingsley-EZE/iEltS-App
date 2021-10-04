package com.example.ieltsapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.Details
import de.hdodenhof.circleimageview.CircleImageView

class StoryAdapter(val details : ArrayList<Details>) : RecyclerView.Adapter<StoryAdapter.ViewHolder> () {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle1 : TextView = itemView.findViewById(R.id.tv_title1)
        val itemDetails1 : TextView = itemView.findViewById(R.id.tv_description1)
        val itemPicture1 : CircleImageView = itemView.findViewById(R.id.iv_image1)

        init {
            itemView.setOnClickListener { v : View ->
                val position : Int = adapterPosition
                Toast.makeText(itemView.context, "You Clicked on Item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_items,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val details : Details = details[position]
        holder.itemTitle1.text = details.title
        holder.itemDetails1.text = details.desc
        holder.itemPicture1.setImageResource(details.image!!)

        holder.itemView.setOnClickListener {
            val bundle = bundleOf("detail" to details.desc!!)
            holder.itemView.findNavController().navigate(R.id.action_storyListFragment_to_storyDetailsFragment, bundle)
        }

    }

    override fun getItemCount(): Int {
        return details.size
    }


}