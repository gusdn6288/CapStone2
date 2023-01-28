package com.dev_yangkj.tistory.blogsampleapp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivityMainBinding
import com.dev_yangkj.tistory.blogsampleapp.selector_duration.SelectorDurationActivity
import com.dev_yangkj.tistory.blogsampleapp.toss_transition.TossTransitionActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainSceneListAdapter

    private val sceneList = arrayOf(
        "Selector with duration",
        "Toss Transition"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MainSceneListAdapter(sceneList)
        adapter.onClickItemListener = ::onClickItem

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recyclerView.addItemDecoration(
            MainSceneListItemDecoration(
                dividerColor = getColor(R.color.list_item_divider),
                dividerHeight = 2f,
                dividerPadding = 0f
            )
        )

        adapter.notifyItemRangeChanged(0, sceneList.size)
    }

    private fun onClickItem(index: Int) {
        when(index) {
            0 -> goToSelectorDurationActivity()
            1 -> goToTossTransitionActivity()
        }
    }

    private fun goToSelectorDurationActivity() {
        Log.d("KJTEST", "goToSelectorDurationActivity")
        val intent = Intent(this, SelectorDurationActivity::class.java)
        startActivity(intent)
    }

    private fun goToTossTransitionActivity() {
        Log.d("KJTEST", "goToTossTransitionActivity")
        val intent = Intent(this, TossTransitionActivity::class.java)
        startActivity(intent)
    }

}