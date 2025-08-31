package com.example.loginquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val tvUsername = findViewById<TextView>(R.id.tvUsername_DetailsActivity)
        val tvAge = findViewById<TextView>(R.id.tvAge_DetailsActivity)
        val tvRollNo = findViewById<TextView>(R.id.tvRollNo_DetailsActivity)
        val tvPhoneNumber = findViewById<TextView>(R.id.tvPhoneNumber_DetailsActivity)
        val btnGotoHome = findViewById<Button>(R.id.btnGotoHome_DetailsActivity)

        tvUsername.text = "Username: " + intent.getStringExtra("Username")
        tvAge.text = "Age: " + intent.getStringExtra("Age")
        tvRollNo.text = "Roll no: " + intent.getStringExtra("RollNumber")
        tvPhoneNumber.text = "Phone: " + intent.getStringExtra("PhoneNumber")

        btnGotoHome.setOnClickListener {
            val intent = Intent(this, FrameActivity::class.java)
            startActivity(intent)
        }
    }
}