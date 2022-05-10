package com.mainafelix.androidtutorial2;

import java.io.Serializable
//todo create a class and make it serializable to help pass this class to an object that can be transferred  between activities and can be passed t oan Intent
// making the class serializable helps the class to pass its object to an Intent


data class person(val name : String, val age:Int, val country:String):Serializable {

}
