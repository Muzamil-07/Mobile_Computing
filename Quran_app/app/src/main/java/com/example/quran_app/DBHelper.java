package com.example.quran_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String TABLE = "tsurah";


    public DBHelper(@Nullable Context context) {
        super(context, "quran_database_new.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



    public ArrayList<SurahModel> getAllSurah() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + "tsurah", null);

        ArrayList<SurahModel> surahArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                surahArrayList.add(new SurahModel(cursorCourses.getString(0)
                        ,cursorCourses.getString(4)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return surahArrayList;
    }
public ArrayList<SurahDetailModel> getSurahDetail(String id) {

        SQLiteDatabase db = this.getReadableDatabase();
    String Tasmiah,TasmiahTarjma;

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + "tayah where SuraID="+id+ " ORDER BY AyaNo", null);

        ArrayList<SurahDetailModel> surahArrayList = new ArrayList<>();
    if(!id.matches("1")){
        Tasmiah = "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ";
        TasmiahTarjma = "شروع اللہ کا نام لے کر جو بڑا مہربان نہایت رحم والا ہے۔";
        surahArrayList.add(new SurahDetailModel(Tasmiah,TasmiahTarjma,"In the Name of Allah, the Most Beneficent, the Most Merciful."));
    }
        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {
                surahArrayList.add(new SurahDetailModel(cursorCourses.getString(3).trim(),cursorCourses.getString(4).trim(),cursorCourses.getString(6).trim()));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return surahArrayList;
    }

    public ArrayList<SurahDetailModel> getParahDetail(String id) {

        SQLiteDatabase db = this.getReadableDatabase();
    String Tasmiah,TasmiahTarjma;

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + "tayah where ParaID="+id+" ORDER BY AyaID",null);

        ArrayList<SurahDetailModel> surahArrayList = new ArrayList<>();

//        Tasmiah = "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ";
//        TasmiahTarjma = "شروع اللہ کا نام لے کر جو بڑا مہربان نہایت رحم والا ہے۔";
//        surahArrayList.add(new SurahDetailModel(Tasmiah,TasmiahTarjma,"In the Name of Allah, the Most Beneficent, the Most Merciful."));

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {

            do {
                if(cursorCourses.getString(2).trim().matches("1")){
                    Tasmiah = "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ";
                    TasmiahTarjma = "شروع اللہ کا نام لے کر جو بڑا مہربان نہایت رحم والا ہے۔";
                    surahArrayList.add(new SurahDetailModel(Tasmiah,TasmiahTarjma,"In the Name of Allah, the Most Beneficent, the Most Merciful."));
                }
                surahArrayList.add(new SurahDetailModel(cursorCourses.getString(3).trim(),cursorCourses.getString(4).trim(),cursorCourses.getString(6).trim()));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return surahArrayList;
    }




}