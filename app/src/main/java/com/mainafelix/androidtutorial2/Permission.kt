package com.mainafelix.androidtutorial2

import android.app.Activity
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.ActivityChooserView
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class Permission : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val btn  = findViewById<Button>(R.id.btnPermissions)
        btn.setOnClickListener {
            requestPermission()
        }
    }
    ///create a functioon that checks if the permission is granted
    private fun readOrWriteExternalStorage()=
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED

    private fun locationPermissiom()=
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)== PackageManager.PERMISSION_GRANTED
     @RequiresApi(Build.VERSION_CODES.Q)
     private fun readOrBsckGroundLocation()=//check if the user uses android Q orherwise app will crash
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)== PackageManager.PERMISSION_GRANTED

    // request permissiom
    //put  all permissions in the String Array
    @RequiresApi(Build.VERSION_CODES.Q)
    private  fun requestPermission(){
        //create a mutable List
        var permissionToRequest = mutableListOf<String>()// create  an empty Array  of Strings
        if( readOrWriteExternalStorage()){
            //if permission hasn't been granted add  the Permission to the permission to requestArray
            permissionToRequest.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if(!readOrWriteExternalStorage()){
            permissionToRequest.add(android.Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if(!readOrWriteExternalStorage()){
            permissionToRequest.add(android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }
        if (permissionToRequest.isNotEmpty()){
            ActivityCompat.requestPermissions(this,permissionToRequest.toTypedArray(),0)
        }
//        create function thataccept the user to grant Requests
//        > if permission have not been granted create a mutable List and add the permssions
//        > check if the mutable lIst is not Emptyrequest  permission and convert the mutable List to TypedArray

    }
//
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    if (requestCode ==0 && grantResults.isNotEmpty()){
        for (i in grantResults.indices)//(similar to grant Result.size-1)
        {
            if (grantResults[i]==PackageManager.PERMISSION_GRANTED){
                Log.d("permissionRequests","${permissions[i]} granted")
            }
        }    }

    }
}