package com.ibrokhimjon.cleanhouse.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ibrokhimjon.cleanhouse.R
import com.ibrokhimjon.cleanhouse.databinding.Fragment1Binding
import com.ibrokhimjon.cleanhouse.databinding.FragmentViewPagerBinding

class Fragment_1 : Fragment() {

    private var _binding : Fragment1Binding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = requireActivity().findViewById<ViewPager2>(R.id.viewPager)
        binding.title.setOnClickListener {
            viewPager.currentItem = 1
        }
    }
}