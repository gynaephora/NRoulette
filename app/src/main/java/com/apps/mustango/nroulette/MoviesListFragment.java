package com.apps.mustango.nroulette;


import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import java.sql.SQLDataException;

import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.apps.mustango.nroulette.SQDatabase.NRouletteDatabaseHelper;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by kalmaro on 03.10.2016.
 */

public class MoviesListFragment extends ListFragment {
    final static String ARG_NEWS_NUMBER="number";

    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

/*        ListView listFilms=getListView();

        try{
            SQLiteOpenHelper rouletteDatabaseHelper=new NRouletteDatabaseHelper(getActivity());
            SQLiteDatabase db=rouletteDatabaseHelper.getReadableDatabase();
            Cursor cursor=db.query("FILMS", new String[]{"_id", "SHOW_TITLE"},null,null,null,null,null);
            CursorAdapter listAdapter=new SimpleCursorAdapter(getActivity(),android.R.layout.simple_list_item_1,cursor,new String[]{"SHOW_TITLE"}, new int[]{android.R.id.text1},0);

            listFilms.setAdapter(listAdapter);

        }catch(SQLiteException e){
                Toast toast=Toast.makeText(getActivity(),"Database unavailable", Toast.LENGTH_SHORT);
                toast.show();
        }*/

        }

     @Override
    public void onDestroy(){
         super.onDestroy();
         cursor.close();
         db.close();
     }
}
