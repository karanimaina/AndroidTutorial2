package com.mainafelix.androidtutorial2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class SharedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared)
        // create the name of the shared PReference
       // getsharedPReferebnces takes 2 values the string reference  and  the mode
        // there are 3 modes public,append and private the public  can be accessed throghout the program and the private is inaccesible by other classes
        // append appends the shared preferences
      //  the value of mode is fetched from  the context
       val sharedPref = getSharedPreferences("myPref",Context.MODE_PRIVATE)
        // to write to shared pref we need an editor
        val editor = sharedPref.edit()
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnLoad = findViewById<Button>(R.id.btnLoad)
        val edName = findViewById<EditText>(R.id.edName1)
        val edAge = findViewById<EditText>(R.id.edName2)
        val  chec = findViewById<CheckBox>(R.id.cBox)

        btnSave.setOnClickListener {
            val  name =edName.text.toString()
            val  age = edAge.text.toString().toInt()
            val cbAdult = chec.isChecked
            editor.apply {
                // provide key  value pairs for saving
                putString("name",name)
                putInt("age",age)
                putBoolean("isChecked",cbAdult)
                //call the apply function for the Editor, we can use commit() too
                apply()
            }
            btnLoad.setOnClickListener {
                //get String parameter takes the  key of the value and the default value .  if the  key is null the default value
                val savedName = sharedPref.getString("name",null)
                val savedAge = sharedPref.getInt("age",0)
                val savedAdult = sharedPref.getBoolean("isChecked",false)
                edName.setText(savedName)
                edAge.setText(savedAge)
                chec .isChecked = savedAdul
            }

        }


    }
}