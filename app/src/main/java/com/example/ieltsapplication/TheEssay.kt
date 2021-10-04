package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.adapter.DetailsAdapter
import com.example.ieltsapplication.databinding.ActivityTheEssayBinding
import com.example.ieltsapplication.model.Details

class TheEssay : AppCompatActivity(){

    private lateinit var binding : ActivityTheEssayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTheEssayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerV = binding.recyclerRv1

        recyclerV.layoutManager = LinearLayoutManager(this)

        val details = ArrayList<Details>()
        details.add(
            Details("Air Pollution", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(
            Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))
        details.add(Details("Function of dancing", "Lorem ipsum dolor sit amet consectetur adipisicing elit.", R.drawable.ic_readbook))

        val adapter = DetailsAdapter(details)
        recyclerV.adapter = adapter
    }
}