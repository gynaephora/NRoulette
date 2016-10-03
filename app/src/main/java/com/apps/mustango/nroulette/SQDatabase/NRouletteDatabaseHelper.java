package com.apps.mustango.nroulette.SQDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kalmaro on 01.10.2016.
 */

public class NRouletteDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME="NROULETTE"; //database name
    private static final int DB_VERSION=1; //database version

    public NRouletteDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE FILMS ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "SHOW_TITLE TEXT,"
                    + "RELEASE_YEAR INTEGER,"
                    + "RATING REAL,"
                    + "DIRECTOR TEXT,"
                    + "SUMMARY TEXT,"
                    + "POSTER STRING);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    private static void insertFilm(SQLiteDatabase db, String show_title, int realese_year,float rating,String director,String summary,String poster){
        ContentValues filmValues=new ContentValues();

        filmValues.put("SHOW_TITLE",show_title);
        filmValues.put("RELEASE_YEAR",realese_year);
        filmValues.put("RATING",rating);

        filmValues.put("DIRECTOR",director);
        filmValues.put("SUMMARY",summary);
        filmValues.put("POSTER",poster);

        db.insert("FILMS",null,filmValues);
    }



}
