package com.dev_yangkj.tistory.blogsampleapp.main

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView

class MainSceneListItemDecoration(
    private val dividerHeight: Float,
    private val dividerPadding: Float,
    private val cellTopPadding: Int = 0,
    private val cellLeftPadding: Int = 20,
    private val cellRightPadding: Int = 20,
    private val cellBottomPadding: Int = 20,
    @ColorInt
    private val dividerColor: Int
) : RecyclerView.ItemDecoration() {

//    private val dividerPaint = Paint()

    init {
//        dividerPaint.color = dividerColor
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val itemIndex = parent.indexOfChild(view)

        if (itemIndex != 0) {
            // 마지막 아이템 그림자
            outRect.left = cellLeftPadding
            outRect.right = cellRightPadding
            outRect.top = cellTopPadding
            outRect.bottom = cellBottomPadding
        }
    }
//    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
//        val left = parent.paddingStart + dividerPadding
//        val right = parent.width - parent.paddingEnd - dividerPadding
//
//        for (i in 0 until parent.childCount) {
//            if(i != 0) {
//                val child = parent.getChildAt(i)
//                val params = child.layoutParams as RecyclerView.LayoutParams
//
//                val top = (child.bottom + params.bottomMargin).toFloat()
//                val bottom = top + dividerHeight
//
//                c.drawRect(left, top, right, bottom, dividerPaint)
//            }
//
//        }
//    }
}