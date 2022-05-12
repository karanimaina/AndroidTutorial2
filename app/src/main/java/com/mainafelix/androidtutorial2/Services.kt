package com.mainafelix.androidtutorial2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class Services : Service() {

   override fun onBind(p0: Intent?): IBinder? = null
   //intent Service runs on a separate thread and does not support  multithreading
   //service class supports multithreading but it will run in thw main thrread by default
   //todo manually start a thread
   val Tag = "My service"
   init {
       Log.d(Tag,"service is running")
   }
 //used to deliver the intent we started the service with
  // we can also attach data to that intent to communicate from our activity to our service
   override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    val dataString = intent?.getStringExtra("Extra_Data")
    dataString?.let {
       Log.d(Tag,dataString )
    }
    /// if the anddroid system kills the service it wont recreate it
     // return START_NOT_STICKY
    // will be created if possible
    return START_STICKY
    //used to illustrate
  //  return START_REDELIVER_INTENT
   }




}