package com.mainafelix.androidtutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
// create a  List of class objects to display
        var todoList = mutableListOf(
         RecyClerTodo("follow me",false),
         RecyClerTodo("follow me1",false),
         RecyClerTodo("follow me2",false),
         RecyClerTodo("follow me3",false),
         RecyClerTodo("follow me4",false)
        )
        //the recyclerAdapter takes the List ofRecyclerTodo objects
        val adapter = RecyclerTodoAdapter(todoList)
       // find the recycelr vew byId
        val  rvTodo = findViewById<RecyclerView>(R.id.rvView)
        //pass the LIST TO THE RECYCLer view Adapter
        rvTodo.adapter = adapter
        //linear layout manager helps display the item on the screen when it should be recycled
        rvTodo.layoutManager =LinearLayoutManager(this)
        val btn = findViewById<Button>(R.id.btnAddTodo)
        btn.setOnClickListener{
            val  edx = findViewById<EditText>(R.id.edTxt)
            val  title = edx.text.toString()
            //creating a recViewObject
            val toDo = RecyClerTodo(title,false)
            //add  it to the todoListAdapter Class
            todoList.add(toDo)
            ////  update the last ebtry
            adapter.notifyItemInserted(todoList.size-1)

        }

    }
}