package com.example.ieltsapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ieltsapplication.fragments.AdvancedFragment
import com.example.ieltsapplication.fragments.BeginnerFragment
import com.example.ieltsapplication.fragments.IntermediateFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                BeginnerFragment()
            }
            1 -> {
                IntermediateFragment()
            }
            2 -> {
                AdvancedFragment()
            }
            else -> {
                Fragment()
            }
        }

    }
}