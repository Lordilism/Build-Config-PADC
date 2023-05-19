package com.example.rider

import android.app.PendingIntent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("This is From rider")

    }

    override fun onResume() {
        super.onResume()
        sendNotification(
            this,
            "This is the basic test of notification in android.Using notification manager",
            "Hello",
            pendingIntent = PendingIntent.getActivity(
                this, 0, RiderDetailsActivity.newIntent(this),PendingIntent.FLAG_UPDATE_CURRENT
            )
        )


    }
}