package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import java.text.FieldPosition

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val spMonths = findViewById<Spinner>(R.id.spMonths)
        //todo get the spMonths and set an onItem onItemSelectedListener then create an object that implements the AdapterView.onITem selected Listener
       spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
           override fun onItemSelected(AdapterView : AdapterView<*>?, view: View?,position:Int, id: Long) {
           Toast.makeText(applicationContext,"you selected ${AdapterView?.getItemIdAtPosition(position).toString()}",Toast.LENGTH_SHORT).show()
           }

           override fun onNothingSelected(AdapterView : AdapterView<*>?) {

           }


       }
    }
}