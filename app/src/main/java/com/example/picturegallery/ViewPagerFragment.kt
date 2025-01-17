package com.example.picturegallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.picturegallery.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater,container,false)

        val viewPageItem = arguments?.getSerializable("vp") as Picture
        binding.viewPagerNamePictureTV.text = viewPageItem.title
        binding.viewPagerNameAuthorTV.text = viewPageItem.author
        binding.viewPagerImageView.setImageResource(viewPageItem.imageView)

        return binding.root
    }

}