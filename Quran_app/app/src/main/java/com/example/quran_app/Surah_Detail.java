package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Surah_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_detail);

        Intent i = getIntent();
        String id = i.getStringExtra("surahId");
        String name = i.getStringExtra("name");
setTitle(name);
        ListView l = findViewById(R.id.listViewSurahDetail);

        DBHelper dbHelper=new DBHelper(Surah_Detail.this);
        List<SurahDetailModel> list = dbHelper.getSurahDetail(id);


        ArrayAdapter ad = new ArrayAdapter(Surah_Detail.this,android.R.layout.simple_list_item_1,list);
        l.setAdapter(ad);


    }
}