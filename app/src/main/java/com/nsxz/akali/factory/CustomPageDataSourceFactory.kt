package com.nsxz.akali.factory

import android.arch.paging.DataSource
import com.nsxz.akali.bean.DataBean
import com.nsxz.akali.bean.DataRepository
import com.nsxz.akali.bean.datasource.CustompageDataSource

class CustomPageDataSourceFactory(val repository:DataRepository):DataSource.Factory<Int,DataBean>() {
    override fun create(): DataSource<Int, DataBean> {
        return CustompageDataSource(repository)
    }
}