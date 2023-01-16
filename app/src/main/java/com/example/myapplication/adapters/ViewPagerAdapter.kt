package com.example.myapplication3.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.Home
import com.example.myapplication.Movies
import com.example.myapplication.Series

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) :FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3

    }

    override fun createFragment(position: Int): Fragment {
    return  when(position){
            0->{
                Home()
            }
            1->{
                Movies()
            }
            2->{
                Series()
            }
            else->{
                Fragment()
            }
        }
    }

}