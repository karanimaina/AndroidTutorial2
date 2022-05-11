package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout

class SlidableMenuActivity : AppCompatActivity() {
    //late init means we will initialize the variabble later on we don't have to give it a value
    lateinit var toggle :ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidable_menu)
        val drawerLayout = findViewById<ConstraintLayout>(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this,drawerLayout,)

    }
}