package com.mainafelix.androidtutorial2

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class NotificationActivity : AppCompatActivity() {
    //todo create  CHannel id
 val  CHANNEL_ID = "channelId "
    //todo create  channel Name
    private val CHANNE_NAME = "channelName"
    private val NOTIFICATION_ID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        // create a pending Intent thay will allow us to click on the notificaton shown on the status bar
        val  intent = Intent(this,NotificationActivity::class.java)
        val pendingIntent  =  TaskStackBuilder.create(this).run{
            // this will add this Activity that we will open on the notification click hence adding it to our activity back stack
            addNextIntentWithParentStack(intent)
            getPendingIntent(0,PendingIntent.FLAG_U PDATE_CURRENT)

        }



        createNotificationChannel()
        val notification = NotificationCompat.Builder(this,CHANNEL_ID)
            .setContentTitle("Awesome Notification")
            .setContentText("ths is the context text")
            .setSmallIcon(R.drawable.ic_notification)
                //priority  means how important the notification is
            .setPriority(NotificationCompat.PRIORITY_HIGH)
                // return anotification here
            .setContentIntent(pendingIntent)
            .build()
        val notificationManager = NotificationManagerCompat.from(this)
        val button = findViewById<Button>(R.id.noti)
        button.setOnClickListener {
            notificationManager.notify(NOTIFICATION_ID,notification)
        }
    }
    private fun createNotificationChannel(){
        //check if the build version is greater than android Oreo
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O) {
            //create a channel
            //sets the immportance- if the nnotificatiion should come with a sound
            val channel =NotificationChannel(CHANNEL_ID,CHANNE_NAME,
                NotificationManager.IMPORTANCE_HIGH).apply {
                    //make the led blink
                    lightColor = Color.GREEN

                enableLights(true)
            }
            //create a notification manager which wil create a notification channel
            // cast the maanager of anyObject tpe to Notification Manager
            val manager   = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)


        }
    }
}