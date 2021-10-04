package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.R
import com.example.ieltsapplication.adapter.WritingAdapter
import com.example.ieltsapplication.databinding.FragmentWritinListBinding
import com.example.ieltsapplication.model.Details


class WritingListFragment : Fragment() {

    private var _binding : FragmentWritinListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentWritinListBinding.inflate(inflater, container, false)
        val view = binding.root

        val recycle = binding.recyclerWrite
        recycle.layoutManager = LinearLayoutManager(activity)

        val detailList = ArrayList<Details>()

        detailList.add(Details("Introduction", "Welcome to IELTS Writing. A lot of students find the IELTS writing test to be difficult because of the allotted time" +
                " limit to write the full-length essay and description of the graph or a letter. Here we will to help you out with that.", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #1", "In some countries young people are encouraged to work or travel for a year between finishing \n" +
                "high school and starting university studies. Discuss the advantages and disadvantages for young \n" +
                "people who decide to do this.\n", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #2", "Today more people are travelling than ever before. Why is this the case? What are the benefits of \n" +
                "travelling for the traveller?", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #3", "Some people argue that capital punishment is good for a country. To what extent do you agree or \n" +
                "disagree?", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #4", "Some people think that a sense of competition in children should be encouraged. Others believe \n" +
                "that children who are taught to co-operate rather than compete become more useful adults.\n" +
                "Discuss both these views and give your own opinion.", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #5", "In some countries young people are encouraged to work or travel for a year between finishing \n" +
                "high school and starting university studies. Do the advantages outweigh the disadvantages for \n" +
                "young people who decide to do this?", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #6", "Nowadays the way many people interact with each other has changed because of technology. In \n" +
                "what ways has technology affected the types of relationships people make? Has this become a \n" +
                "positive or negative development?\n", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #7", "Nowadays the way many people interact with each other has changed because of technology. In \n" +
                "what ways has technology affected the types of relationships people make? Has this become a \n" +
                "positive or negative development?\n", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #8", "Nowadays the way many people interact with each other has changed because of technology. In \n" +
                "what ways has technology affected the types of relationships people make? Has this become a \n" +
                "positive or negative development?\n", R.drawable.ic_readbook))
        detailList.add(Details("IELTS Writing Sample #9", "Nowadays the way many people interact with each other has changed because of technology. In \n" +
                "what ways has technology affected the types of relationships people make? Has this become a \n" +
                "positive or negative development?\n", R.drawable.ic_readbook))

        val adapter = WritingAdapter(detailList)
        recycle.adapter = adapter

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}