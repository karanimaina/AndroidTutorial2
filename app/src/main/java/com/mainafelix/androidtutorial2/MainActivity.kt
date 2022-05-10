package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.btnApply)
        Button.setOnClickListener {
          Intent(this,MainActivity2::class.java).also {
              val name = findViewById<EditText>(R.id.editTextTextPersonName)
              val age = findViewById<EditText>(R.id.editTextTextPersonName2)
              val country = findViewById<EditText>(R.id.editTextTextPersonName3)
              val name1 = name.text.toString()
              val age1 = age.text.toString().toInt()
              val country1 = country.text.toString()
              it.putExtra("name",name1)
              it.putExtra("age",age1)
              it.putExtra("country",country1)
              startActivity(it)
          }
        }
    }
}