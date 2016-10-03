package com.apps.mustango.nroulette;


import android.support.v4.app.Fragment;

/**
 * Created by kalmaro on 03.10.2016.
 */

public class MoviesListActivity extends SingleMoviesActivity {

    @Override
    protected Fragment createFragment(){return new MoviesListFragment();}
}
