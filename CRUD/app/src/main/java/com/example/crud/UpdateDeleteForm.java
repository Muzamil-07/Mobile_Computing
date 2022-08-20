package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class UpdateDeleteForm extends AppCompatActivity {

    EditText studentName;
    EditText rollNum;
    Switch enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete_form);
    studentName=findViewById(R.id.updateTextName);
    rollNum=findViewById(R.id.updateTextRollNumber);
    Intent i = getIntent();
    String name=i.getStringExtra("name");
    String rn=i.getStringExtra("rn");
    String isEnroll=i.getStringExtra("isEnroll");
    studentName.setText(name);
    rollNum.setText(rn);
    Toast.makeText(UpdateDeleteForm.this, String.valueOf(isEnroll.trim().length()), Toast.LENGTH_SHORT).show();

    if(isEnroll.trim()=="true"){
        enroll.setChecked(true);
    }

    }
}