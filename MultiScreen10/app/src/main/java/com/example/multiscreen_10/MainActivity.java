package com.example.multiscreen_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText txt;
    public static final String EXTRA_STR = "com.example.multiscreen_10.EXTRA_STRN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showScreen(View v)
    {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        txt = findViewById(R.id.editText);
        String name = txt.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(this.EXTRA_STR,name);
        startActivity(intent);

    }
}