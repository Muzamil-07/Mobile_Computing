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

}