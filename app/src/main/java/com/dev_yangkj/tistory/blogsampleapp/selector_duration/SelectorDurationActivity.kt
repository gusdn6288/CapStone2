package com.dev_yangkj.tistory.blogsampleapp.selector_duration

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivitySelectorDurationBinding

class SelectorDurationActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectorDurationBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectorDurationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pressedEffectButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
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