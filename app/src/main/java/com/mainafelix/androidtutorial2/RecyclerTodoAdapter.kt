package com.mainafelix.androidtutorial2

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class RecyclerTodoAdapter(
    //pass the items of our recycler todo Items int the constructor
var  todos :List<RecyClerTodo>
// inherit from the recycler view .viewholder
):RecyclerView.Adapter<RecyclerTodoAdapter.RecViewHolder>() {
    //todo  create an inner class" viewholder for holding our views
    //it takes a pqram of View Type  and inherits fro the RecyclerViewHolder  which  receives the view  from the ViewHolder custom class
    inner class RecViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder {
     // called  to crete a viewholder for as pecific item
        // using  the view from the parent ViewGroup; pass the id of the tdo Lidt of item
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_to_do,parent,false)
        return RecViewHolder(view)// pass the view to the RecViewHolder

    }

    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {
    holder.itemView.apply {
        // access  the views and set the position  of the todos item to the
        val title = findViewById<TextView>(R.id.tvTitle)
        val check = findViewById<CheckBox>(R.id.ChDone)
        title.text  = todos[position].title
        check.isChecked = todos[position].isChecked

    }

    }

    override fun getItemCount(): Int {
       return  todos.size
    }

}