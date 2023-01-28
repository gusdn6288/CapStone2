package com.dev_yangkj.tistory.blogsampleapp.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.dev_yangkj.tistory.blogsampleapp.databinding.CellMainSceneBinding


class MainSceneListCell @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: CellMainSceneBinding = CellMainSceneBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var sceneName: String = ""
        set(value) {
            field = value
            binding.sceneNameTextView.text = value
        }

}