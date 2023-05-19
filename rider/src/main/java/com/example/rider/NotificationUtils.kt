package com.example.rider

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

@SuppressLint("ObsoleteSdkInt")
fun sendNotification(context: Context, body: String, title: String, pendingIntent: PendingIntent) {

    val notificationManager =
        context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    val NOTIFICATION_CHANNEL_ID = BuildConfig.APPLICATION_ID + ".channel"

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val name = context.getString(R.string.app_name)

        val channel = NotificationChannel(
            NOTIFICATION_CHANNEL_ID, name, NotificationManager.IMPORTANCE_HIGH
        )

        notificationManager.createNotificationChannel(channel)


    }
    val notification = buildNotification(context,NOTIFICATION_CHANNEL_ID,title,body,pendingIntent)

    notificationManager.notify(getUniqueId(),notification)

}

fun getUniqueId(): Int {
    return (System.currentTimeMillis()%1000).toInt()

}

fun buildNotification(
    context: Context,
    channelId: String,
    title: String,
    content: String,
    pendingIntent: PendingIntent
): Notification {

    //Message in Big text Style
    val bigTextStyle = NotificationCompat.BigTextStyle()

    bigTextStyle.bigText(content)

    return NotificationCompat.Builder(context,channelId)
        .setSmallIcon(R.mipmap.ic_launcher)
        .setContentTitle(title)
        .setContentText(content)
        .setAutoCancel(true)
        .setContentIntent(pendingIntent)
        .setStyle(bigTextStyle)
        .build()


}
