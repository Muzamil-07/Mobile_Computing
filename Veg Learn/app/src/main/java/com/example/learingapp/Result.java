package com.example.learingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Result extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        int marks=i.getIntExtra("marks",0);
        Log.d("@@",String.valueOf(marks));
       TextView t= findViewById(R.id.score);
       t.setText(String.valueOf(marks)+"/5");

    }
}