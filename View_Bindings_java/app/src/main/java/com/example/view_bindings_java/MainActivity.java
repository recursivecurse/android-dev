package com.example.view_bindings_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button 2 is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onButtonClicked(View v) {

        Toast.makeText(getApplicationContext(), "button is clicked", Toast.LENGTH_SHORT).show();
    }
}