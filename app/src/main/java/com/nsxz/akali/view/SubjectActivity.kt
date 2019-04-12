package com.nsxz.akali.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsxz.akali.R
import kotlinx.android.synthetic.main.activity_subject.*

class SubjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)
        tvName.text="你好"
    }
}

