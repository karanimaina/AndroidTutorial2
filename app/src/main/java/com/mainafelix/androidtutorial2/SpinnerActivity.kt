package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import java.text.FieldPosition

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val customList = arrayOf("Mon","tue","wed","thur","fri")
        val  adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
        val spMonths = findViewById<Spinner>(R.id.spMonths)
        spMonths.adapter = adapter
        //todo get the spMonths and set an onItem onItemSelectedListener then create an object that implements the AdapterView.onITem selected Listener
       spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
           override fun onItemSelected(AdapterView : AdapterView<*>?, view: View?,position:Int, id: Long) {
               // the reason we use the Application context is because we use an an interface here
           Toast.makeText(applicationContext,"you selected ${AdapterView?.getItemIdAtPosition(position).toString()}",Toast.LENGTH_SHORT).show()
           }

           override fun onNothingSelected(AdapterView : AdapterView<*>?) {

           }


       }
    }
}