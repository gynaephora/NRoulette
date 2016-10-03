package com.apps.mustango.nroulette;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

/**
 * Created by mustango on 04.10.2016.
 */

public class FindMoviesListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setHasOptionsMenu(true);
        // setMenuVisibility(true);

        setRetainInstance(true);

        //   mNewsTheme = getResources().getStringArray(R.array.news_url);
        //    mNewsItem = getResources().getStringArray(R.array.news_theme);
//
    }
   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      /*  return inflater.inflate(R.layout.news_list_fragment,null);

        if (NetworkManager.isNetworkAvailable(getContext()))
            return inflater.inflate(R.layout.news_list_fragment,null);
        else return inflater.inflate(R.layout.news_list_fragment_empty,null);
    }*/

}

