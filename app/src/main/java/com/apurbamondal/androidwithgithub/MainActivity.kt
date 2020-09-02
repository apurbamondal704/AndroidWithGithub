package com.apurbamondal.androidwithgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //our First project on Github
        val text = findViewById<TextView>(R.id.text_view)
        val btn = findViewById<Button>(R.id.btn)
        val image = findViewById<ImageView>(R.id.image)
    }
}