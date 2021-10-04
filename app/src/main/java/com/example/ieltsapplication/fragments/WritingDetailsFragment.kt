package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsapplication.databinding.FragmentWritingDetailsBinding


class WritingDetailsFragment : Fragment() {

    private var _binding : FragmentWritingDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_writing_details, container, false)

        _binding = FragmentWritingDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        val args = this.arguments
        val inputData = args?.get("input")
        binding.writingDetailDesc.text = inputData.toString()

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}