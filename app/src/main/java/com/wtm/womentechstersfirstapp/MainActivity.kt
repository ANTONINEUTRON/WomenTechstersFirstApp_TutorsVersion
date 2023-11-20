package com.wtm.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Access the button on our UI
        val joinButton: Button = findViewById(R.id.joinNowButton)

        //Set a listener to the button
        joinButton.setOnClickListener{
            //Navigate user to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
        }
    }
}