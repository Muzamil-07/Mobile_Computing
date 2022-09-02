package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Surah_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_detail);

        Intent i = getIntent();
        String id = i.getStringExtra("surahId");

        TextView t=findViewById(R.id.textView2);
        t.setText(id);

    }
}