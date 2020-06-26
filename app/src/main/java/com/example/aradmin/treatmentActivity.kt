package com.example.aradmin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_treatment.*

class treatmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment)

        backBtn.setOnClickListener{
            finish()
        }

        imageView4.setOnClickListener {
            val intent = Intent(this, patientDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}