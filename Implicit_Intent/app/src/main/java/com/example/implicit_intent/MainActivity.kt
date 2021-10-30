package com.example.implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mailBtn.setOnClickListener(View.OnClickListener {
            val mailId = editText.text
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:${mailId}")
            startActivity(i)
        })

        browseBtn.setOnClickListener(View.OnClickListener {
            val addr = editText.text
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$addr")
            startActivity(i)
        })

        dialBtn.setOnClickListener(View.OnClickListener {
            val num = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$num")
            startActivity(i)
        })
    }
}