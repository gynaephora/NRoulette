package com.apps.mustango.nroulette;


import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by kalmaro on 03.10.2016.
 */

public class MoviesListFragment extends ListFragment {
    final static String ARG_NEWS_NUMBER="number";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
        setMenuVisibility(true);

        setRetainInstance(true);

     //   mNewsTheme = getResources().getStringArray(R.array.news_url);
    //    mNewsItem = getResources().getStringArray(R.array.news_theme);
//
        }


}
