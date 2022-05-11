package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout

class SlidableMenuActivity : AppCompatActivity() {
    //late init means we will initialize the variabble later on we don't have to give it a value
    lateinit var toggle :ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidable_menu)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        //assign toggle to the Action Bar drawe object
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open, R.string.close)
        //add a drawer listener
        drawerLayout.addDrawerListener(toggle)
        // tell toggle to sync its state, to make it ready to use
        toggle.syncState()
// support action bar produces a back arrow that closses the nav bar
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return  true
        }
        return super.onOptionsItemSelected(item)
    }
}