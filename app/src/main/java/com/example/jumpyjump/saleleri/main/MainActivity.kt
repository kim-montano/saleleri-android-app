package com.example.jumpyjump.saleleri.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jumpyjump.saleleri.R

class MainActivity : AppCompatActivity(), MainView  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showFeed() {

    }

    override fun showFeed(page: Int) {

    }

    override fun showError() {

    }

    override fun showEmpty() {

    }
}
