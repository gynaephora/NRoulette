package com.apps.mustango.nroulette.SQDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kalmaro on 01.10.2016.
 */

public class NRouletteDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME="NROULETTE"; //database name
    private static final int DB_VERSION=1; //database version

    NRouletteDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE NROULETTE ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "SHOW_TITLE TEXT,"
                    + "RELEASE_YEAR TEXT,"
                    + "RATING REAL,"
                    + "DIRECTOR TEXT,"
                    + "SUMMARY TEXT,"
                    + "POSTER STRING);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
