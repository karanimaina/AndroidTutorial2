package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog2)
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Felix to your Contact List")
            .setIcon(R.drawable.ic_addcontact)
            .setPositiveButton("yes"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you added Felix to the contact List",Toast.LENGTH_LONG).show()
                     }
            .setNegativeButton("No"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," Failed to add Felix to the contact List",Toast.LENGTH_LONG).show()
            }
            .create()
     val btn1 = findViewById<Button>(R.id.btnDialog1)
        btn1.setOnClickListener{
            addContactDialog.show()
        }
    }
}