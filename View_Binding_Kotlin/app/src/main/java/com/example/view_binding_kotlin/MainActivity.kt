package com.example.view_binding_kotlin

import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(textView)
        {
            text = "10";
            setTextColor(getColor(R.color.teal_700));
            textSize = 20f;

        }

        editText.apply()
        {
            addTextChangedListener{
                Log.i("ViewBinding",it.toString());
            }
        }

        button2.setOnClickListener(View.OnClickListener {
            Toast.makeText(it.context,"Button 2 is clicked !!",Toast.LENGTH_LONG).show();
        });


    }

    fun showToast(v: View)
    {
        Toast.makeText(v.context,"Button 1 is clicked!!",Toast.LENGTH_LONG).show();
    }


}