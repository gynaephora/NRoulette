package com.apps.mustango.nroulette;


import android.support.v4.app.Fragment;

/**
 * Created by kalmaro on 07.12.2016.
 */

public class FindMoviesByDirector extends SingleMoviesActivity{
    @Override
    protected Fragment createFragment(){return new FindMoviesByDirectorFragment();}

}
