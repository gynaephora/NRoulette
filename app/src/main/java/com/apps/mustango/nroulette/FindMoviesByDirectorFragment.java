package com.apps.mustango.nroulette;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kalmaro on 07.12.2016.
 */

public class FindMoviesByDirectorFragment extends Fragment{
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

  /*  @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        super.onCreateOptionsMenu(menu,inflater);
        getActivity().setTitle("Find movies");
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.search_by_director_fragment, null);
    }
/*
        if (NetworkManager.isNetworkAvailable(getContext()))
            return inflater.inflate(R.layout.news_list_fragment,null);
        else return inflater.inflate(R.layout.news_list_fragment_empty,null);
    }*/

}
