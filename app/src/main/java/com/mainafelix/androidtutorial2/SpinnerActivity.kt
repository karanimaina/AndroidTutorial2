package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val spMonths = findViewById<Spinner>(R.id.spMonths)
        //todo get the spMonths and set an onItem onItemSelectedListener then create an object that implements the AdapterView.onITem selected Listener
       spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
           override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               TODO("Not yet implemented")
           }

           override fun onNothingSelected(p0: AdapterView<*>?) {
               TODO("Not yet implemented")
           }


       }
    }
}