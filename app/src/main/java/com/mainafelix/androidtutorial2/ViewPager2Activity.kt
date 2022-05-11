package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

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
        view.orientation= ViewPager2.ORIENTATION_VERTICAL
        //set programmatic dragging
        view.beginFakeDrag()
        //-10 is an offset ofhow string we want to drag
        view.fakeDragBy(-10f)// - means we want to drag to the lft
        view.endFakeDrag()
    }
}