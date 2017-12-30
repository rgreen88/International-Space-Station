package com.example.android.iss.viewmodel;

import android.widget.TextView;

import com.example.android.iss.data.MyHttpThread;
import com.example.android.iss.data.RetrofitHelper;
import com.example.android.iss.data.util.Constants;
import com.example.android.iss.model.Request;


public class DataRetrieval {

    //TODO: need to call these methods commented before and store in TextView for the coordinates
    //TODO: and passes into the recyclerview

    private Boolean latitude;
    private Boolean longitude;
    private Integer passes;

    //Set each TextView using .setText().toString() after retrieving data
    TextView mLatitude, mLongitude, mPasses;

    //retrieval for requested data regarding station position
    public DataRetrieval(Request request){

        this.latitude = request.getLatitude();
        this.longitude = request.getLongitude();
        this.passes = request.getPasses();

    }

    public Boolean getLatitude() {
        return latitude;
    }

    public void setLatitude(Boolean latitude) {
        this.latitude = latitude;
    }

    public Boolean getLongitude() {
        return longitude;
    }

    public void setLongitude(Boolean longitude) {
        this.longitude = longitude;
    }

    public Integer getPasses() {
        return passes;
    }

    public void setPasses(Integer passes) {
        this.passes = passes;
    }

    //http thread -- should these methods below be in viewmodel?
    public static void setMyHttpThreadPasses() {
        MyHttpThread myHttpThread = new MyHttpThread(Constants.URLS.BASE_URL);
        Thread threadPasses = new Thread(myHttpThread);
        threadPasses.start();
    }

    public static void setMyHttpThreadLocation() {
        MyHttpThread myHttpThread = new MyHttpThread(Constants.URLS.BASE_URL);
        Thread threadLocation = new Thread(myHttpThread);
        threadLocation.start();
    }

    //add retrofit2 calls -- should this be in viewmodel as well?

}