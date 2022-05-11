package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)
      // creating fragment holders
        val home = HomeFragment()
        val message  = MessageFragment()
        val profile = ProfileFragment()
        setCurrentFragment(home)
        val bottomView   = findViewById<BottomNavigationView>(R.id.BottomNavigationView)
        bottomView.setOnNavigationItemReselectedListener {
            when(it.itemId){
                //set the menuIcons to  Specific fragments
                R.id.miHome -> setCurrentFragment(home)
                R.id.miMessage -> setCurrentFragment(message)
                R.id.miProfile -> setCurrentFragment(profile)
            }
            true
        }
     // use the get or create badge to show the message Count
        bottomView.getOrCreateBadge(R.id.miMessage).apply {
            number =10
            isVisible= true
        }

    }
    //create a function that replaces our current frag
    // ment with a new one
    private fun  setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace (R.id.flBottomFragment,fragment)
        commit()
    }
}