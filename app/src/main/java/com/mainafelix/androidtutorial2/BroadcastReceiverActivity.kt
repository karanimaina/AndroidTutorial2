package com.mainafelix.androidtutorial2

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BroadcastReceiverActivity : AppCompatActivity() {
    lateinit var receiver:BroadCastAirPlaneChangeReciver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        receiver = BroadCastAirPlaneChangeReciver()
        setContentView(R.layout.activity_broadcast_receiver)
        //used to determine which Apps tp  recieve whch intent
       IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
           registerReceiver(receiver,it)

       }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}