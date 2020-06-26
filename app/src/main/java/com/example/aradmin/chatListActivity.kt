package com.example.aradmin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat_list.*

class chatListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        view2.setOnClickListener {
            val intent = Intent(this, treatmentActivity::class.java)
            startActivity(intent)
        }
    }
}