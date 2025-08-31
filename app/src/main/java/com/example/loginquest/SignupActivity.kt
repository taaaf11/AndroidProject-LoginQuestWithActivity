package com.example.loginquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val etUsername = findViewById<EditText>(R.id.etUsername_SignupActivity)
        val etAge = findViewById<EditText>(R.id.etAge_SignupActivity)
        val etRollNumber = findViewById<EditText>(R.id.etRollNo_SignupActivity)
        val etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber_SignupActivity)

        val checkButton = findViewById<Button>(R.id.btnCheck_SignupActivity)
        val ivBackButton = findViewById<ImageView>(R.id.ivBackButton_LoginActivity)

        ivBackButton.setOnClickListener {
            val intent = Intent(this, FrameActivity::class.java)
            startActivity(intent)
        }

        checkButton.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)

            intent.putExtra("Username", etUsername.text.toString())
            intent.putExtra("Age", etAge.text.toString())
            intent.putExtra("RollNumber", etRollNumber.text.toString())
            intent.putExtra("PhoneNumber", etPhoneNumber.text.toString())

            startActivity(intent)
        }

    }
}