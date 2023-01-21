package com.dev_yangkj.tistory.blogsampleapp.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.dev_yangkj.tistory.blogsampleapp.R
import com.dev_yangkj.tistory.blogsampleapp.databinding.CellMainSceneBinding


class MainSceneListCell @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: CellMainSceneBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        R.layout.cell_main_scene,
        this,
        true
    )

    var sceneName: String = ""
        set(value) {
            field = value
            binding.sceneNameTextView.text = value
        }

}