package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsapplication.databinding.FragmentStoryDetailsBinding
import com.example.ieltsapplication.databinding.FragmentStoryListBinding


class StoryDetailsFragment : Fragment() {

    private var _binding : FragmentStoryDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_story_details, container, false)

        _binding = FragmentStoryDetailsBinding.inflate(inflater,container, false)
        val view = binding.root

        binding.storyDetailTv.text = arguments?.getString("detail")


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}