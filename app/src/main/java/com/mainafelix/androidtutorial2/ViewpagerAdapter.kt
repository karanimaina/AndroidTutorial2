package com.mainafelix.androidtutorial2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewpagerAdapter (
  var images :List<Int>// the added images  are in the drawable folder and they are reffered byId
):RecyclerView.Adapter<ViewpagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager2,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currImage =images[position]
      holder.itemView.apply {
          val image = findViewById<ImageView>(R.id.IvImage)
          image.setImageResource(currImage)
      }
    }

    override fun getItemCount(): Int {
        return  images.size
    }


}