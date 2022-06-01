package com.example.learingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lesson extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        findViewById(R.id.carrotRow).setOnClickListener(this);
        findViewById(R.id.potatoRow).setOnClickListener(this);
        findViewById(R.id.radishRow).setOnClickListener(this);
        findViewById(R.id.greenpepperRow).setOnClickListener(this);
        findViewById(R.id.tomatoRow).setOnClickListener(this);
        findViewById(R.id.cornRow).setOnClickListener(this);
        findViewById(R.id.garlicRow).setOnClickListener(this);
        findViewById(R.id.eggplantRow).setOnClickListener(this);
        findViewById(R.id.mushroomRow).setOnClickListener(this);
        findViewById(R.id.onionRow).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;
        String message , src ;
        switch (view.getId()) {

            case R.id.carrotRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "carrot";
                i.putExtra("text", "Carrot");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.potatoRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "potato";
                i.putExtra("text", "Potato");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.tomatoRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "tomato";
                i.putExtra("text", "Tomato");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.radishRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "radish";
                i.putExtra("text", "Radish");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.greenpepperRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "greenpepper";
                i.putExtra("text", "Green Pepper");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.cornRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "corn";
                i.putExtra("text", "Corn");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.garlicRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "garlic";
                i.putExtra("text", "Garlic");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.eggplantRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "eggplant";
                i.putExtra("text", "Egg Plant");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.mushroomRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "mushroom";
                i.putExtra("text", "Mushroom");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.onionRow:
                i = new Intent(Lesson.this, LessonImg.class);
                src = "onion";
                i.putExtra("text", "Onion");
                i.putExtra("img", src);
                startActivity(i);
                break;

        }
    }
}