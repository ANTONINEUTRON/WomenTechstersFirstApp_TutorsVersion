package com.wtm.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNewAccount)
        createNAButton.setOnClickListener {
            var i = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(i)
        }

        val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)
        forgotPasswordBtn.setOnClickListener {
            var i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }

        val loginBtn: Button = findViewById(R.id.loginButton)
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)

        loginBtn.setOnClickListener{
            var usernameTxt: String = username.text.toString()
            var passwordTxt: String = password.text.toString()
            var message: String = ""

            //perform validation checks
            if(usernameTxt != "Fauziyat"){
                message = "Wrong Username"
            }else if(passwordTxt != "demo"){
                message = "Invalid Password"
            }

            //show message or take user to homepage
            if(message.isNotEmpty()){
                Snackbar.make(
                    findViewById(R.id.layout),
                    message,
                    Snackbar.LENGTH_LONG
                ).show()
            }else {
                navigateToLoginPage()
            }
        }
    }

    private fun navigateToLoginPage() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}