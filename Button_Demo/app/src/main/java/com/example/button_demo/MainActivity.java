package com.example.button_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtA, txtB;
    private Button btnA , btnB, finishbtn;
    public int A_score = 0;
    public int B_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA = findViewById(R.id.button);
        btnB = findViewById(R.id.button2);
        txtA  = findViewById(R.id.textView);
        txtB  = findViewById(R.id.textView2);
        finishbtn = findViewById(R.id.button3);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Team A", Toast.LENGTH_SHORT).show();
                A_score = A_score +1;
                txtA.setText(Integer.toString(A_score));
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Team B", Toast.LENGTH_SHORT).show();
                B_score = B_score +1;
                txtB.setText(Integer.toString(B_score));
            }
        });

        finishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(A_score > B_score)
                    Toast.makeText(MainActivity.this, "Team A Wins", Toast.LENGTH_SHORT).show();
                if(A_score < B_score)
                    Toast.makeText(MainActivity.this, "Team B Wins", Toast.LENGTH_SHORT).show();
                if(A_score == B_score)
                    Toast.makeText(MainActivity.this, "Its a Tie", Toast.LENGTH_SHORT).show();
            }
        });

    }
}