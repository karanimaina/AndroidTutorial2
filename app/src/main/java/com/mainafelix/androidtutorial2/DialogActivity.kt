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

        ///create a variable addcontact dialog and assign it to the AlertDialog Builder class ehich takes a context
        val addContactDialog = AlertDialog.Builder(this)
                // set the title of the AlertDialog
            .setTitle("Add contact")
                //set the message of the dialog
            .setMessage("Do you want to add Felix to your Contact List")
                // set the icon of the dialog
            .setIcon(R.drawable.ic_addcontact)
                //set a positive button such that onClick it displays a specific message
            .setPositiveButton("yes"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you added Felix to the contact List",Toast.LENGTH_LONG).show()
                     }
                // set a negative button such that onClick it it displays a toast message
            .setNegativeButton("No"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," Failed to add Felix to the contact List",Toast.LENGTH_LONG).show()
            }
                //  call the create button to create an alert Dialog
            .create()
     val btn1 = findViewById<Button>(R.id.btnDialog1)
        btn1.setOnClickListener{
            //set an onClickListener  for the Button and call the .show(method on the  add contact dialog to show the dialog
            addContactDialog.show()
        }
        //providing multiple items in a dialog where auser can select one Alternative
        val options = arrayOf(" first ","second","third")
        val singleDialog = AlertDialog.Builder(this)
            .setTitle("choose one option")
                //choose the functions that takes an array
                //0 is the selected item by default
                // create an onitem onclick listener"
            .setSingleChoiceItems(options,0){dialogInterface, i ->
                Toast.makeText(this,"you clicked on ${options[i]} ",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you accepted single choice dialog",Toast.LENGTH_LONG).show()
            }
            // set a negative button such that onClick it it displays a toast message
            .setNegativeButton("Deline"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you declined single choice dialog",Toast.LENGTH_LONG).show()
            }
            //  call the create button to create an alert Dialog
            .create()

        val btn2 = findViewById<Button>(R.id.btnDialog2)
        btn2.setOnClickListener{
            singleDialog.show()
        }

        val  = AlertDialog.Builder(this)
            .setTitle("choose one option")
            //choose the functions that takes an array
            //0 is the selected item by default
            // create an onitem onclick listener"
            .setSingleChoiceItems(options,0){dialogInterface, i ->
                Toast.makeText(this,"you clicked on ${options[i]} ",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you accepted single choice dialog",Toast.LENGTH_LONG).show()
            }
            // set a negative button such that onClick it it displays a toast message
            .setNegativeButton("Deline"){_,_  ->// dialogInterface, i -> //i describes which button was clicked
                Toast.makeText(this," you declined single choice dialog",Toast.LENGTH_LONG).show()
            }
            //  call the create button to create an alert Dialog
            .create()

        val btn2 = findViewById<Button>(R.id.btnDialog2)
        btn2.setOnClickListener{
            singleDialog.show()
        }
    }
}