package com.mainafelix.androidtutorial2;

import android.app.IntentService
import android.content.Intent
import android.util.Log

class IntentServiceClass: IntentService("myIntentService") {
    // used to  process the intent from the service when it  started
    //stopping the intent-create a singleton object
init {
    instance = this
}
    companion object{
        private lateinit var  instance:IntentServiceClass
        var isRunning = true
        fun  stopService(){
            Log.d("myIntentService","sevice is stopping")
            isRunning = false
            instance.stopSelf()


        }
    }
    override fun onHandleIntent(p0: Intent?) {

        try {
isRunning= true
            while (isRunning){
               Log.d("myIntent servce"," Service is running")
                Thread.sleep(1000)
            }
        }catch (e:InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}
