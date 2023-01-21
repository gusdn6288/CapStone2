package com.dev_yangkj.tistory.blogsampleapp.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev_yangkj.tistory.blogsampleapp.R


class MainSceneListAdapter(
    private val dataSet: Array<String>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER = 0
    private val TYPE_ITEM = 1

    var onClickItemListener: ((Int) -> Unit)? = null

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    inner class CellViewHolder(view: MainSceneListCell) : RecyclerView.ViewHolder(view)
    internal class HeaderViewHolder(headerView: View) : RecyclerView.ViewHolder(headerView)

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        when(viewType) {
            TYPE_HEADER -> {
                val itemView = LayoutInflater
                    .from(viewGroup.context)
                    .inflate(R.layout.cell_header_main_scene, viewGroup, false)

                return HeaderViewHolder(itemView)
            }
            TYPE_ITEM -> {
                val itemView = MainSceneListCell(viewGroup.context)
                itemView.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                return CellViewHolder(itemView)
            }
            else -> {
                val itemView = MainSceneListCell(viewGroup.context)
                itemView.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                return CellViewHolder(itemView)
            }
        }



    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        when(viewHolder) {
            is CellViewHolder -> {
                val view = viewHolder.itemView as MainSceneListCell
                view.sceneName = dataSet[position - 1]
                view.setOnClickListener {
                    onClickItemListener?.invoke(position - 1)
                }
            }
            else -> {

            }
        }


    }

    // Return the size of your dataset (invoked by the layout manager) + header
    override fun getItemCount() = dataSet.size + 1

    override fun getItemViewType(position: Int): Int {
        return if(position == 0) {
            TYPE_HEADER
        } else {
            TYPE_ITEM
        }
    }

}
