package com.example.picturegallery

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.picturegallery.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this, Picture.viewPagerList)
        binding.viewPagerVP.adapter = adapter
    }
}