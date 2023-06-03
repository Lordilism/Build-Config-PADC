package com.example.rider

import android.app.PendingIntent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.shared.showSnackBar
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            Log.d("firebase_token", it.result)
        }

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