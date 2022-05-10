package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        val country = intent.getStringExtra("country")
        val person =" $name  is $age and lives in $country"

    }
}