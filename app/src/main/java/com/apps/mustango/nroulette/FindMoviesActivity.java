package com.apps.mustango.nroulette;

import android.support.v4.app.Fragment;

/**
 * Created by mustango on 04.10.2016.
 */

public class FindMoviesActivity extends SingleMoviesActivity {
    @Override
    protected Fragment createFragment(){return new FindMoviesListFragment();}
}
