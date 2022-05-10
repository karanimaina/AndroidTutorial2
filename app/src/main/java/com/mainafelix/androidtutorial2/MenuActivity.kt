package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    // oveeride the oncreate menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //menu inflater is similar to layout inflater
        menuInflater.inflate(R.menu.tool_barmenu,menu)
     //this shows we have inflated our own menu
        return true
    }
    // return a function that will dipllay some characteristics when the in the menyu are selected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
      when(item.itemId){
          R.id.miContacts ->Toast.makeText(this," contacts selected",Toast.LENGTH_LONG).show()
          R.id.miSetting ->Toast.makeText(this," setting selected",Toast.LENGTH_LONG).show()
          R.id.miFeedback ->Toast.makeText(this," feedback selected",Toast.LENGTH_LONG).show()
          R.id.mifavorites ->Toast.makeText(this," favorites  selected",Toast.LENGTH_LONG).show()
          R.id.miClose ->finish()
      }

        return true
    }
}