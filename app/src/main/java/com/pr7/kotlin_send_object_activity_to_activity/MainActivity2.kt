package com.pr7.kotlin_send_object_activity_to_activity

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //get Object
        val user = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("obj", User::class.java)
        } else {
            intent.getParcelableExtra<User>("obj")
        }
        val userdata= if (user is User){
            user
        } else {
            null
        }

        Log.d("PR77777", "onCreate: ${user?.fullname}")

        //get Arraylist
        val arraylist = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableArrayListExtra("objarraylist",User::class.java)
        } else {
            intent.getParcelableArrayListExtra<User>("objarraylist")
        }
        val array= if (arraylist is ArrayList<*>){
            arraylist
        } else {
            null
        }
        Log.d("PR77777", "onCreate: ${array?.size}")



    }
}