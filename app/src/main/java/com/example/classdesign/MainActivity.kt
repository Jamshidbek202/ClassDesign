package com.example.classdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgList = ArrayList<Int>()

        imgList.add(R.drawable.crocodile)
        imgList.add(R.drawable.castle)
        imgList.add(R.drawable.maserati1)
        imgList.add(R.drawable.maserati2)

        val viewpagerAdapter = ViewPagerAdapter(this, imgList)
        binding.eventViewpager.adapter = viewpagerAdapter

        val recyclerViewAdapter = RecyclerViewAdapter(imgList)
        binding.rvEvents.adapter = recyclerViewAdapter
        binding.rvYourTurn.adapter = recyclerViewAdapter
    }
}