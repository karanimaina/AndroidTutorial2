package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)
         val buttonStart = findViewById<Button>(R.id.btnIntent)
         val buttonStop = findViewById<Button>(R.id.btnService)
        val tvService  = findViewById<TextView>(R.id.tvService)
        buttonStart.setOnClickListener {
            Intent(this,IntentServiceClass::class.java).also{
                startService(it)
                tvService.text = "service is running"
            }
        }
        buttonStop.setOnClickListener {
          IntentServiceClass.stopService()
            tvService.text =" service stopped"
            //add Intent service to the manifest class

        }
    }
}