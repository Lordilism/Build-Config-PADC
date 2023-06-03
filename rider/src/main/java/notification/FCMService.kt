package notification

import android.app.PendingIntent
import android.util.Log
import com.example.rider.RiderDetailsActivity
import com.example.rider.sendNotification
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FCMService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("firebase token", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        sendNotification(
            this,
            body = message.data["body"]?: "",
            title = message.data["title"] ?: "",
            PendingIntent.getActivity(
                this,
                0,
                RiderDetailsActivity.newIntent(this),
                PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}