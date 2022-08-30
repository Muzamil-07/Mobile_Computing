package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonViewAll;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.viewBtn);
        editName = findViewById(R.id.TextName);
        editRollNumber = findViewById(R.id.TextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                List<StudentModel> list = dbHelper.getAllStudents();
                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
                listViewStudent.setAdapter(arrayAdapter);

            }
        });
listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String currData = adapterView.getItemAtPosition(position).toString();
        String arr[] = currData.split(",");
        String name = arr[0].split(":")[1];
        String rn = arr[1].split(":")[1];
        Boolean isEnroll = Boolean.parseBoolean(arr[2].split(":")[1]);


        Intent i = new Intent(MainActivity.this,UpdateDeleteForm.class);
        i.putExtra("name",name);
        i.putExtra("rn",rn);
        i.putExtra("isEnroll",arr[2].split(":")[1]);
        i.putExtra("id",arr[3].split(":")[1]);
        startActivity(i);


    }
});



    }
}
