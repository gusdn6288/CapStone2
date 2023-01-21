package com.dev_yangkj.tistory.blogsampleapp.selector_duration

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivityMainBinding
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivitySelectorDurationBinding

class SelectorDurationActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectorDurationBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_selector_duration)

        binding.pressedEffectButton.setOnTouchListener { view, motionEvent ->
            when(motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    binding.pressedEffectButton.text = "PRESSED TRUE"
                }
                MotionEvent.ACTION_UP -> {
                    binding.pressedEffectButton.text = "PRESSED FALSE"
                }
            }
            return@setOnTouchListener false
        }

    }


}