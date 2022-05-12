package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        val btnStart =  findViewById<Button>(R.id.btnIntentService)
        val BtnStop =  findViewById<Button>(R.id.btnServiceService)
        val BtnSend =  findViewById<Button>(R.id.buttonService)
        val tvText = findViewById<TextView>(R.id.tvService)


        btnStart.setOnClickListener {
            Intent(this, Services::class.java).also {
                startService(it)
                tvText.text= "  service is crrently running"


            }

        }
        BtnStop.setOnClickListener {
            Intent(this, Services::class.java).also {
             stopService(it)
                tvText.text= "  service stopped"
            }

        }
        BtnSend.setOnClickListener {
            Intent(this, Services::class.java).also {
            val edx = findViewById<EditText>(R.id.edxService)
                 val  dataString = edx.text.toString()
                it.putExtra("Extra_Data",dataString)
                startService(it)



                startService(it)
            }

        }


    }

}