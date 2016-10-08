package com.apps.mustango.nroulette;

/**
 * Created by kalmaro on 06.10.2016.
 */

public class Movies {

    /*
    private static final String id="id";
    private static final String title="title";
    private static final int release_year;
*/

    private String mId;
    private String mTitle;
    private String mYear;
    private String mRating;
    private String mDirector;
    private String mSummary;
    private String mPosterUrl;

    public String getId(){return mId;}
    public String getTitle(){return mTitle;}
    public String getYear(){return  mYear;}
    public String getRating(){return mRating;}
    public String getDirector(){return mDirector;}
    public String getSummary(){return mSummary;}
    public String getPosterUrl(){return mPosterUrl;}

    public void setId(String id){mId=id;}
    public void setTitle(String title){mTitle=title;}
    public void setYear(String year) {mYear = year;}
    public void setRatin(String rating){mRating=rating;}
    public void setDirector(String director){mDirector=director;}
    public void setSummary(String summary){mSummary=summary;}
    public void setPosterUrl(String posterUrl){mPosterUrl=posterUrl;}

}
