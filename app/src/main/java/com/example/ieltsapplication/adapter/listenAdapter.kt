package com.example.ieltsapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.HomePageActivity
import com.example.ieltsapplication.ListenNotesActivity
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.Details

class listenAdapter(val mDetail : ArrayList<Details>) : RecyclerView.Adapter<listenAdapter.ListenViewHolder>()  {


    class ListenViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val listeningTitle = itemView.findViewById<TextView>(R.id.tv_title_writing)
        val listeningDesc = itemView.findViewById<TextView>(R.id.tv_description_writing)
        val listeningImage = itemView.findViewById<ImageView>(R.id.iv_image_writing)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListenViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.writing_items,parent,false)
        return ListenViewHolder(v)
    }

    override fun onBindViewHolder(holder: ListenViewHolder, position: Int) {
        val detail : Details = mDetail[position]
        holder.listeningTitle.text = detail.title
        holder.listeningDesc.text = detail.desc
        holder.listeningImage.setImageResource(detail.image!!)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ListenNotesActivity::class.java)
            intent.putExtra("value", detail.desc!!)
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
       return mDetail.size
    }
}