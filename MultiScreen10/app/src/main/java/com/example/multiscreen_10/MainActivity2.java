package com.example.multiscreen_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String val = intent.getStringExtra(MainActivity.EXTRA_STR);
        txtView.setText(val);
    }
}