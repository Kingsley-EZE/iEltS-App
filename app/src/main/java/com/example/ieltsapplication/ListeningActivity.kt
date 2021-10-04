package com.example.ieltsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieltsapplication.adapter.ViewPagerAdapter
import com.example.ieltsapplication.databinding.ActivityListeningBinding
import com.google.android.material.tabs.TabLayoutMediator

class ListeningActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListeningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListeningBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val tabLayout = binding.tabLayoutId
        val viewPg = binding.viewPagerId

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPg.adapter = adapter

        TabLayoutMediator(tabLayout,viewPg){tab,position ->
            when(position){
                0 ->{
                    tab.text = "Beginner"
                }
                1 ->{
                    tab.text = "Intermediate"
                }
                2 ->{
                    tab.text = "Advance"
                }
            }
        }.attach()
    }
}