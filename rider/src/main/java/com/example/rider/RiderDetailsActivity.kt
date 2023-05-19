package com.example.rider

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RiderDetailsActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,RiderDetailsActivity::class.java)

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rider_details)
    }
}