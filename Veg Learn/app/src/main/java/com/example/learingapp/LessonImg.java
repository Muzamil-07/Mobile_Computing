package com.example.learingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonImg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_img);

        Intent intent = getIntent();
        String src = intent.getStringExtra("img");
        String msg = intent.getStringExtra("text");
        ImageView img= (ImageView) findViewById(R.id.imageView2);
        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText(msg);
        int j = getResources().getIdentifier(src, "drawable", getPackageName());
        img.setImageResource(j);
    }
}