package com.dev_yangkj.tistory.blogsampleapp.toss_transition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.FragmentChartBinding
import com.dev_yangkj.tistory.blogsampleapp.databinding.FragmentHomeBinding

class ChartFragment: Fragment() {
    private lateinit var binding: FragmentChartBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_chart,
            container,
            false
        )
        return binding.root
    }
}