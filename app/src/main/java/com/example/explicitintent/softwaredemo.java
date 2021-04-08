package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class softwaredemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softwaredemo);
        Intent i = getIntent();
        String cn = i.getStringExtra("Classname");
        int s = i.getIntExtra("Class strength", 28);
        TextView T1 = findViewById(R.id.textview);
        T1.setText(cn + String.valueOf(i));

    }
}