package com.nsxz.akali.adapter

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.nsxz.akali.R
import com.nsxz.akali.bean.DataBean

class CustomPageAdapter : PagedListAdapter<DataBean, CustomViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(parent)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<DataBean>() {
            override fun areItemsTheSame(oldConcert: DataBean,
                                         newConcert: DataBean): Boolean =
                    oldConcert.id == newConcert.id

            override fun areContentsTheSame(oldConcert: DataBean,
                                            newConcert: DataBean): Boolean =
                    oldConcert == newConcert
        }
    }

}


class CustomViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)) {
    private val nameView = itemView.findViewById<TextView>(R.id.tvItem)
    var item: DataBean? = null

    fun bindTo(item: DataBean?) {
        this.item = item
        nameView.text = item?.name
    }
}