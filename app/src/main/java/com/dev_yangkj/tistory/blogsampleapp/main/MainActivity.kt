package com.dev_yangkj.tistory.blogsampleapp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.ActivityMainBinding
import com.dev_yangkj.tistory.blogsampleapp.selector_duration.SelectorDurationActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainSceneListAdapter

    private val sceneList = arrayOf(
        "Selector with duration"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

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
        }
    }

    private fun goToSelectorDurationActivity() {
        Log.d("KJTEST", "goToButtonBackgroundActivity")
        val intent = Intent(this, SelectorDurationActivity::class.java)
        startActivity(intent)
    }

}