package com.apps.mustango.nroulette;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by kalmaro on 06.10.2016.
 */

public class MoviesBox {


    private ArrayList<Movies> mMovies;

    private static MoviesBox sMoviesBox;
    private Context mAppContext;

    private MoviesBox(Context appContext){

        mAppContext=appContext;

    }


    public ArrayList<Movies> getMovies(){return mMovies;}


}
