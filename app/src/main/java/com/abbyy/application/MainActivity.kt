package com.abbyy.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle(getString(R.string.notes))

        val cardView = findViewById<CardView>(R.id.description)
        cardView.setOnClickListener {
            var intent = Intent(this, DetailsPage::class.java)
            startActivity(intent)
        }
    }

}