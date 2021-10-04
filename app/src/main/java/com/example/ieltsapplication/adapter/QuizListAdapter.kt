package com.example.ieltsapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsapplication.R
import com.example.ieltsapplication.model.QuizModel
import de.hdodenhof.circleimageview.CircleImageView

class QuizListAdapter(val quizDetails : ArrayList<QuizModel>) : RecyclerView.Adapter<QuizListAdapter.ViewHolder>() {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var title : TextView = itemView.findViewById(R.id.quiz_tv_title1)
        var question : TextView = itemView.findViewById(R.id.quiz_question)
        var option1 : TextView = itemView.findViewById(R.id.option_one)
        var option2 : TextView = itemView.findViewById(R.id.option_two)
        var option3 : TextView = itemView.findViewById(R.id.option_three)
        var option4 : TextView = itemView.findViewById(R.id.option_four)
        var linear_wrapper : LinearLayout = itemView.findViewById(R.id.linear_wrapper)
        var expandableWrapper : RelativeLayout = itemView.findViewById(R.id.expandable_wrapper)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.quiz_items_list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quizDetail : QuizModel = quizDetails[position]
        holder.title.text = quizDetail.title
        holder.question.text = quizDetail.question
        holder.option1.text = quizDetail.optionOne
        holder.option2.text = quizDetail.optionTwo
        holder.option3.text = quizDetail.optionThree
        holder.option4.text = quizDetail.optionFour

        val isExpandable : Boolean = quizDetails[position].expandable
        holder.expandableWrapper.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linear_wrapper.setOnClickListener {
            val question = quizDetails[position]
            question.expandable = !question.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return quizDetails.size
    }
}