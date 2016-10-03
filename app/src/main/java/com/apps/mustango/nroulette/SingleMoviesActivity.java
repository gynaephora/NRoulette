package com.apps.mustango.nroulette;


import android.content.Intent;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by kalmaro on 03.10.2016.
 */

public abstract class SingleMoviesActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();
    private DrawerLayout mDrawerLayout;
    private String[] mMoviesAction;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        mMoviesAction = getResources().getStringArray(R.array.movies_action);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mMoviesAction));

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

      //  setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_drawer);
        mDrawerToggle=new ActionBarDrawerToggle(this, mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){


            /** Called when a drawer has settled in a completely closed state.*/
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely open state.*/
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // Set the list's click listener
                mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        Bundle args = new Bundle();

        // Insert the fragment by replacing any existing fragment
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null){

            //fragment = createFragment();
           // args.putInt(NewsListFragment.ARG_NEWS_NUMBER,0);
            fragment.setArguments(args);
            fm.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
        }


    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id){
            selectItem(position);
        }
    }
    /** Swaps fragments in the main content view */
    private void selectItem(int position) {
        // Create a new fragment and specify the planet to show based on position

        Bundle args = new Bundle();
        args.putInt(MoviesListFragment.ARG_NEWS_NUMBER,position);

        // Insert the fragment by replacing any existing fragment
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment != null){
            fragment = createFragment();
            args.putInt(MoviesListFragment.ARG_NEWS_NUMBER,position);
            fragment.setArguments(args);

            if(position!=10 && position!=11){fm.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
                setTitle(mMoviesAction[position]);

            }
           /* else if(position==11){

               Intent intent = new Intent(this, AboutProgramActivity.class);
                startActivity(intent);

            }*/
        }
        // Highlight the selected item, update the title, and close the drawer
        if (position!=10) {
            mDrawerList.setItemChecked(position, true);
            mDrawerLayout.closeDrawer(mDrawerList);
        }
    }

}


