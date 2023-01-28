package com.dev_yangkj.tistory.blogsampleapp.toss_transition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dev_yangkj.tistory.blogsampleapp.databinding.FragmentChartBinding

class ChartFragment: Fragment() {
    private lateinit var binding: FragmentChartBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChartBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }
}