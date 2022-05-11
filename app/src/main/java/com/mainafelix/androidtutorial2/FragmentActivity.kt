package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        //initialing the firstFRANEBT
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
      //todo  to inflate the content of our frame layout we need to use a frament transaction
        supportFragmentManager.beginTransaction().apply {
        // replace the fragment that with flFragment
            replace(R.id.flFragment,firstFragment)
            //commit applies the changes to our transaction
            commit()
        }
        val btn1 = findViewById<Button>(R.id.btnFragment1)
        val btn2 = findViewById<Button>(R.id.btnFragment2)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                // replace the fragment that with flFragment
                replace(R.id.flFragment,firstFragment)
                //commit applies the changes to our transaction
                commit()
            }
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                // replace the fragment that with flFragment
                replace(R.id.flFragment,secondFragment)
                //commit applies the changes to our transaction
                commit()
            }
        }
    }
}