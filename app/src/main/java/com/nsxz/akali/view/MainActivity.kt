package com.nsxz.akali.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsxz.akali.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHello.setOnClickListener { val intent= Intent(this,ListActivity().javaClass)
        startActivity(intent)}



    }



}
