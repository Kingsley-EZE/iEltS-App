package com.example.ieltsapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.model.Details
import com.example.ieltsapplication.R
import com.example.ieltsapplication.TheEssayDetails
import de.hdodenhof.circleimageview.CircleImageView

class DetailsAdapter(val details : ArrayList<Details>) : RecyclerView.Adapter<DetailsAdapter.ViewHolder> () {



    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle : TextView = itemView.findViewById(R.id.tv_title)
        val itemDetails : TextView = itemView.findViewById(R.id.tv_description)
        val itemPicture : CircleImageView = itemView.findViewById(R.id.iv_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_of_items_essay,parent,false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val details : Details = details[position]
        holder.itemTitle.text = details.title
        holder.itemDetails.text = details.desc
        holder.itemPicture.setImageResource(details.image!!)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TheEssayDetails::class.java)
            intent.putExtra("Data", details.desc!!)
            holder.itemView.context.startActivity(intent)
        }

        }


    override fun getItemCount(): Int {
        return details.size
    }


}
