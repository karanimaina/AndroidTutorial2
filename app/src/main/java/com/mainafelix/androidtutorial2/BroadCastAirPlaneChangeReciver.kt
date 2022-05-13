package com.mainafelix.androidtutorial2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

// broadcast
class BroadCastAirPlaneChangeReciver :BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
       val isAirplaneEnabled = intent?.getBooleanExtra("state", false)?:return
        if (isAirplaneEnabled) {
            Toast.makeText(context, "Airplane mode enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airplane mode disabled",Toast.LENGTH_LONG).show()

        }
    }
}