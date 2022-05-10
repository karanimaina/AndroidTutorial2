package com.mainafelix.androidtutorial2

import android.view.View
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class RecyclerTodoAdapter {
    //todo  create an inner class" viewholder for holding our views
    //it takes a pqram of View Type  and inherits fro the RecyclerViewHolder  which  receives the view  from the ViewHolder custom class
    inner class RecViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

}