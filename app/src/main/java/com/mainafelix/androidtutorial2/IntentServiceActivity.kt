package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)
         val buttonStart = findViewById<Button>(R.id.bt)
    }
}