package com.dev_yangkj.tistory.blogsampleapp.toss_transition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivityTossTransitionBinding

class TossTransitionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTossTransitionBinding

    private val fragments = listOf(
        HomeFragment(),
        ChartFragment(),
        SettingsFragment()
    )

    // animation 방향 계산을 위해 현재 위치 값 저장
    private var currentPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_toss_transition)


        // 첫 화면 초기화 HomeFragment
        supportFragmentManager.beginTransaction()
            .replace(binding.frameLayout.id, fragments[0])
            .commit()

        // BottomNavigation 아이템 선택 콜백
        binding.bottomNavigationView.setOnItemSelectedListener {
            val transaction = supportFragmentManager.beginTransaction()
            when(it.itemId) {
                R.id.bottom_navigation_item_home -> {
                    transaction.setCustomAnimations(R.anim.anim_slide_in_from_right_fade_in, R.anim.anim_fade_out)
                    transaction.replace(binding.frameLayout.id, fragments[0])
                    transaction.commit()
                    currentPosition = 0
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_navigation_item_chart -> {

                    if(currentPosition < 1) {
                        transaction.setCustomAnimations(R.anim.anim_slide_in_from_left_fade_in, R.anim.anim_fade_out)
                    } else {
                        transaction.setCustomAnimations(R.anim.anim_slide_in_from_right_fade_in, R.anim.anim_fade_out)
                    }
                    transaction.replace(binding.frameLayout.id, fragments[1])
                    transaction.commit()
                    currentPosition = 1
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_navigation_item_settings -> {
                    transaction.setCustomAnimations(R.anim.anim_slide_in_from_left_fade_in, R.anim.anim_fade_out)
                    transaction.replace(binding.frameLayout.id, fragments[2])
                    transaction.commit()
                    currentPosition = 2
                    return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false
        }

    }


}