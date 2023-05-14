package com.pr7.kotlin_send_object_activity_to_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button1)
        val arraylist=ArrayList<User>()
        arraylist.add(User(fullname = "Coleman Reilly", lastname = "Shelly Cantu"))
        arraylist.add(User(fullname = "Kimberley Horton", lastname = "Ferdinand Perkins"))
        arraylist.add(User(fullname = "Karin Norman", lastname = "Dan Page"))

        val user=User(fullname = "Rigoberto Reese", lastname = "Tonya Stein")
        button.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("obj",user)
            intent.putParcelableArrayListExtra("objarraylist",arraylist)
            startActivity(intent)
        }

    }
}