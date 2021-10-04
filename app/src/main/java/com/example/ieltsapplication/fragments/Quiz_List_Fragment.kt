package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.R
import com.example.ieltsapplication.adapter.QuizListAdapter
import com.example.ieltsapplication.databinding.FragmentQuizListBinding
import com.example.ieltsapplication.model.QuizModel


class Quiz_List_Fragment : Fragment() {

    private var _binding : FragmentQuizListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_quiz__list_, container, false)

        _binding = FragmentQuizListBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerViewQuiz = binding.quizRecycler
        recyclerViewQuiz.layoutManager = LinearLayoutManager(activity)

        val quizList = ArrayList<QuizModel>()

        quizList.add(QuizModel("Quiz 1","What country does this flag belong to?", "Nigeria", "Brazil", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 2","What capital of Germany?", "Berlin", "London", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 3","What country does this flag belong to?", "Nigeria", "Brazil", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 4","What capital of Germany?", "Berlin", "London", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 5","What country does this flag belong to?", "Nigeria", "Brazil", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 6","What capital of Germany?", "Berlin", "London", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 7","What country does this flag belong to?", "Nigeria", "Brazil", "America", "Ghana"))
        quizList.add(QuizModel("Quiz 8","What capital of Germany?", "Berlin", "London", "America", "Ghana"))

        val adapter = QuizListAdapter(quizList)
        recyclerViewQuiz.adapter = adapter
        recyclerViewQuiz.setHasFixedSize(true)

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}