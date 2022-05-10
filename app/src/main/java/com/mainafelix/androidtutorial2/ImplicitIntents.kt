package com.mainafelix.androidtutorial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImplicitIntents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intents)
        // explicit intents specify the intents  and activity
        //implicit intents just Specify an intent
   val btn  = findViewById<Button>(R.id.btnAddImage)
        btn .setOnClickListener {
            //provide an Action to the intent
            //getContent is too general narrow it Down
            Intent(Intent.ACTION_GET_CONTENT).also {
              //get an image yhe / means to look for the type, available image options are jpeg, png,* lookks for all types etc
                it.type= "image/*"
                //start Activity and get theresult from the gallery app
                startActivityForResult(it,0) // requesCode means we have away to differentiate several Activities that were started for result

            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //check if the result was successful && requestcode == 0
         if (resultCode == RESULT_OK&&requestCode==0){
             // we can get the data inform of an intent , we can get
         // the actual path path from the  image that we just chose
             //the path to aresource is considered as uri
             val uri = data?.data  //first data refers to the intent , second data refers to the reslt collected from the previous intent
             val fvPhoto = findViewById<ImageView>(R.id.imageView)

             fvPhoto.setImageURI(uri)

         }
    }
}