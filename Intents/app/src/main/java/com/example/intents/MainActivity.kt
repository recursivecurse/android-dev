package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

const val KEY_1 = "Name"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = editText.text
        Log.i("Adi",name.toString())


        button.setOnClickListener(View.OnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(KEY_1,name.toString())
            startActivity(i)
        })
    }
}