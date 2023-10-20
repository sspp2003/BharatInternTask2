package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView ctof,ctok,ftoc,ftok,ktoc,ktof;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctof = findViewById(R.id.ctof);
        ctok = findViewById(R.id.ctok);
        ftoc = findViewById(R.id.ftoc);
        ftok = findViewById(R.id.ftok);
        ktoc = findViewById(R.id.ktoc);
        ktof = findViewById(R.id.ktof);

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CtoF.class);
                startActivity(intent);
            }
        });
        ctok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CtoK.class);
                startActivity(intent);
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FtoC.class);
                startActivity(intent);
            }
        });
        ftok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FtoK.class);
                startActivity(intent);
            }
        });
        ktoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KtoC.class);
                startActivity(intent);
            }
        });
        ktof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KtoF.class);
                startActivity(intent);
            }
        });

    }
}