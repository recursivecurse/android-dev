package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(textView2)
        {
            text = "Hello World"

        }

        checkBox.setOnClickListener(View.OnClickListener {
            if(it.checkBox.isChecked())
                Toast.makeText(it.context,"The checkbox is checked!!",Toast.LENGTH_LONG).show()
            else
                Toast.makeText(it.context,"The checkbox is not checked!!",Toast.LENGTH_LONG).show()
        })

        radioGroup.setOnCheckedChangeListener{groups, checkedId->
            when(checkedId)
            {
                R.id.radioButton->{
                    Toast.makeText(groups.context,"${groups.radioButton.text} is checked",Toast.LENGTH_LONG).show()
                }
                R.id.radioButton2->{
                    Toast.makeText(groups.context,"${groups.radioButton2.text} is checked",Toast.LENGTH_LONG).show()
                }
                R.id.radioButton3->{
                    Toast.makeText(groups.context,"${groups.radioButton3.text} is checked",Toast.LENGTH_LONG).show()
                }
            }
        }

        toggleButton.setOnClickListener(View.OnClickListener {
            if(it.toggleButton.isChecked())
                it.toggleButton.text="ON"
            else
                it.toggleButton.text="OFF"
        })
    }
}