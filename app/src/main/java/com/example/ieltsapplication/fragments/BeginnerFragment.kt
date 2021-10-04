package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.R
import com.example.ieltsapplication.adapter.listenAdapter
import com.example.ieltsapplication.databinding.FragmentBeginnerBinding
import com.example.ieltsapplication.model.Details


class BeginnerFragment : Fragment() {

    private var _binding : FragmentBeginnerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBeginnerBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerListen = binding.recyclerBegin
        recyclerListen.layoutManager = LinearLayoutManager(activity)

        val detailList = ArrayList<Details>()

        detailList.add(Details("Lesson #1", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #2", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #3", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #4", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #5", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #6", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #7", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #8", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #9", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #10", getString(R.string.beginner),R.drawable.ic_quizimage))
        detailList.add(Details("Lesson #11", getString(R.string.beginner), R.drawable.ic_quizimage))

        val adapter = listenAdapter(detailList)
        recyclerListen.adapter = adapter

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}