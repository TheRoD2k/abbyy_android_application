package com.abbyy.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_page)
        this.setTitle("")
    }
}