package com.example.learingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.ArrayList;


public class Quiz extends AppCompatActivity {

    String[] key= {"Mushroom","Corn","Egg plant","Radish","Carrot"};
    int count = 0;
    ArrayList<String> correct = new ArrayList<String>();

    Button submitBtn;
    RadioGroup g1,g2,g3,g4,g5;
    RadioButton btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        g1=(RadioGroup)findViewById(R.id.g1);
        g2=(RadioGroup)findViewById(R.id.g2);
        g3=(RadioGroup)findViewById(R.id.g3);
        g4=(RadioGroup)findViewById(R.id.g4);
        g5=(RadioGroup)findViewById(R.id.g5);
        submitBtn = findViewById(R.id.submitBtn);

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn1=findViewById(i);
                correct.add((String) btn1.getText());
            }
        });
        g2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn2=findViewById(i);
                correct.add((String) btn2.getText());
            }
        });
        g3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn3=findViewById(i);
                correct.add((String) btn3.getText());
            }
        });
        g4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn4=findViewById(i);
                correct.add((String) btn4.getText());
            }
        });
        g5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn5=findViewById(i);
                correct.add((String) btn5.getText());
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < correct.size(); i++) {
                    if(correct.get(i).matches(key[i])){
                        count++;
                    }
                }
                Intent intent = new Intent(Quiz.this, Result.class);
                intent.putExtra("marks",count);
                startActivity(intent);
            }
        });
    }
}