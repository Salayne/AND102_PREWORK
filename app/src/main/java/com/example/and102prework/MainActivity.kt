package com.example.and102prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.hello_button)
        val introductionParagraph = findViewById<TextView>(R.id.introduction)


        getInfo(helloButton,introductionParagraph)
        Toast.makeText(applicationContext,"press here", Toast.LENGTH_SHORT).show()

    }

    private fun getInfo(button: Button,textView: TextView){
        button.setOnClickListener {
            textView.visibility = View.VISIBLE
        }

    }



}