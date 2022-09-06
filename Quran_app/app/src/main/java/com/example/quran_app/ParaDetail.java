package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ParaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_detail);

        Intent i = getIntent();
        String id = i.getStringExtra("paraId");
        String name = i.getStringExtra("name");
        setTitle(name);
        ListView l = findViewById(R.id.listViewParaDetail);

        DBHelper dbHelper=new DBHelper(ParaDetail.this);
        List<SurahDetailModel> list = dbHelper.getParahDetail(id);


        ArrayAdapter ad = new ArrayAdapter(ParaDetail.this,android.R.layout.simple_list_item_1,list);
        l.setAdapter(ad);



    }
}