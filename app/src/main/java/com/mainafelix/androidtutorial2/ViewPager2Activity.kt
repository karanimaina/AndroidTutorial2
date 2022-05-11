package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPager2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)
       val images = listOf(
          R.drawable.chat3,
          R.drawable.chat6 ,
          R.drawable.chat4,
          R.drawable.chat7,
          R.drawable.chat
       )
        val adapter  = ViewpagerAdapter(images)
        //set the type of view to ViewPager2
         val view = findViewById<ViewPager2>(R.id.viewPager)
        view.adapter = adapter
       // set vertical swipe
//        view.orientation= ViewPager2.ORIENTATION_VERTICAL
//        //set programmatic dragging
//        view.beginFakeDrag()
//        //-10 is an offset ofhow string we want to drag
//        view.fakeDragBy(-10f)// - means we want to drag to the lft
//        view.endFakeDrag()
val  tablayout = findViewById<TabLayout>(R.id.tbTabLayout)
     //tab layout connects our viewpager and
        TabLayoutMediator(tablayout,view){tab , position ->
            tab.text= "Tab ${position+1}"
        }.attach()
        //responding to touch click events
                                     // an anonymous class
        tablayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
           Toast.makeText(applicationContext,"tab selected",Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(applicationContext,"tab Unselected",Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(applicationContext,"tab reselected",Toast.LENGTH_SHORT).show()

            }

        })

    }
}