package com.example.android.iss.viewmodel;

import android.widget.TextView;

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
}