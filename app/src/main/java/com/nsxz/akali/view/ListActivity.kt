package com.nsxz.akali.view

import android.arch.lifecycle.Observer
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsxz.akali.R
import com.nsxz.akali.adapter.CustomPageAdapter
import com.nsxz.akali.bean.DataRepository
import com.nsxz.akali.factory.CustomPageDataSourceFactory
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter=CustomPageAdapter()
        rvList.adapter=adapter

        val data=LivePagedListBuilder(CustomPageDataSourceFactory(DataRepository()),PagedList.Config.Builder()
                .setPageSize(20)
                .setEnablePlaceholders(true)
                .setInitialLoadSizeHint(20)
                .build()).build()

        data.observe(this, Observer { adapter.submitList(it) })
    }
}
