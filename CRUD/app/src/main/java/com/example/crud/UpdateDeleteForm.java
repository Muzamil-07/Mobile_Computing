package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class UpdateDeleteForm extends AppCompatActivity {

    EditText studentName;
    EditText rollNum;
    Switch enroll;
    Button updateBtn;
    Button delBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete_form);
    studentName=findViewById(R.id.updateTextName);
    rollNum=findViewById(R.id.updateTextRollNumber);
    enroll=findViewById(R.id.switchUpdateStudent);
    updateBtn=findViewById(R.id.updateBtn);
    delBtn=findViewById(R.id.deleteBtn);


    Intent i = getIntent();
    String name=i.getStringExtra("name");
    String rn=i.getStringExtra("rn");
    String isEnroll=i.getStringExtra("isEnroll");
    int id=Integer.parseInt(i.getStringExtra("id"));

    studentName.setText(name);
    rollNum.setText(rn);
    Toast.makeText(UpdateDeleteForm.this, String.valueOf(isEnroll.trim().length()), Toast.LENGTH_SHORT).show();

    if(isEnroll.trim().matches("true")){
        enroll.setChecked(true);
    }


    updateBtn.setOnClickListener(new View.OnClickListener() {
        StudentModel studentModel;

        @Override
        public void onClick(View v) {
            try {
                studentModel = new StudentModel(studentName.getText().toString(), Integer.parseInt(rollNum.getText().toString()), enroll.isChecked(),id);
                //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
            }
            catch (Exception e){
                Toast.makeText(UpdateDeleteForm.this, "Error", Toast.LENGTH_SHORT).show();
            }
            DBHelper dbHelper  = new DBHelper(UpdateDeleteForm.this);
            dbHelper.updateStudent(studentModel);
        }
    });

    delBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            
        }
    });


    }



}