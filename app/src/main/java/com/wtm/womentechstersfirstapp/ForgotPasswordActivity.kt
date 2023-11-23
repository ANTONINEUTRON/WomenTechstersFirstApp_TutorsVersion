package com.wtm.womentechstersfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val sendBtn: Button = findViewById(R.id.send)
        val emailEdt: EditText = findViewById(R.id.email)

        sendBtn.setOnClickListener {
            val userEmailEntered: String = emailEdt.text.toString()
            var message = "";

            if(!userEmailEntered.matches(Regex("^[a-zA-Z0-9.a-zA-Z0-9.!#$%&'*+-/=?^_`{|}~]+@[a-zA-Z0-9]+\\.[a-zA-Z]+"))){
                message = "You need to enter an email address"
            }else{
                message = "A recovery email has been sent to $userEmailEntered"
            }

            Snackbar
                .make(
                    findViewById(R.id.layout),
                    message,
                    Snackbar.LENGTH_LONG
                )
                .show()
        }
    }
}