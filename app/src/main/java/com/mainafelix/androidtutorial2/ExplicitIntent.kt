package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.btnApply)
        Button.setOnClickListener {
          Intent(this,ExplicitIntents2::class.java).also {
              val name = findViewById<EditText>(R.id.editTextTextPersonName)
              val age = findViewById<EditText>(R.id.editTextTextPersonName2)
              val country = findViewById<EditText>(R.id.editTextTextPersonName3)
              val name1 = name.text.toString()
              val age1 = age.text.toString().toInt()
              val country1 = country.text.toString()

              val person = person(name1,age1,country1)
//              it.putExtra("name",name1)
//              it.putExtra("age",age1)
//              it.putExtra("country",country1)
              it.putExtra("person",person) //passing the class  as a serializable
              startActivity(it)

              // create a serializable data class
              //take the data from the views and genrate a class object
              //then use it .putExtra("Strinf  reference", class object)
              //on the otber Activity createe a variable and use Intent.getSerislizbleExtra("pass the referenceString" then cast this serializable class to  the Data class
              //set the text  of the text to  the person instance"
          }
        }
    }
}