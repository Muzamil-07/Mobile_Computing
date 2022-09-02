package com.example.quran_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public static final String STUDENT_ID = "StudentID";
    public static final String STUDENT_NAME = "StudentName";
    public static final String STUDENT_ROLL = "StudentRollNumber";
    public static final String STUDENT_ENROLL = "IsEnrolled";
    public static final String STUDENT_TABLE = "StudentTable";


    public DBHelper(@Nullable Context context) {
        super(context, "MyDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



    public ArrayList<StudentModel> getAllStudents() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + STUDENT_TABLE, null);

        ArrayList<StudentModel> studentArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                studentArrayList.add(new StudentModel(cursorCourses.getString(1),
                        cursorCourses.getInt(2),
                        cursorCourses.getInt(3) == 1 ? true : false,cursorCourses.getInt(0)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return studentArrayList;
    }

}