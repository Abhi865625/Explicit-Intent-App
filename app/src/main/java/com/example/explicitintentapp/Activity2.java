package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Send Data Between Activities

        Intent i = getIntent();

        String k = i.getStringExtra("id");

        Toast.makeText(this, "We Passed: "+k, Toast.LENGTH_LONG).show();
    }
}