
package com.example.android.iss.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request implements Parcelable
{

    @SerializedName("latitude")
    @Expose
    private Boolean latitude;
    @SerializedName("longitude")
    @Expose
    private Boolean longitude;
    @SerializedName("altitude")
    @Expose
    private Object altitude;
    @SerializedName("passes")
    @Expose
    private Integer passes;
    @SerializedName("datetime")
    @Expose
    private Object datetime;
    public final static Creator<Request> CREATOR = new Creator<Request>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Request createFromParcel(Parcel in) {
            return new Request(in);
        }

        public Request[] newArray(int size) {
            return (new Request[size]);
        }

    }
    ;

    protected Request(Parcel in) {
        this.latitude = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.longitude = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.altitude = ((Object) in.readValue((Object.class.getClassLoader())));
        this.passes = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.datetime = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Request() {
    }

    /**
     * 
     * @param altitude
     * @param longitude
     * @param passes
     * @param latitude
     * @param datetime
     */
    public Request(Boolean latitude, Boolean longitude, Object altitude, Integer passes, Object datetime) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.passes = passes;
        this.datetime = datetime;
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

    public Object getAltitude() {
        return altitude;
    }

    public void setAltitude(Object altitude) {
        this.altitude = altitude;
    }

    public Integer getPasses() {
        return passes;
    }

    public void setPasses(Integer passes) {
        this.passes = passes;
    }

    public Object getDatetime() {
        return datetime;
    }

    public void setDatetime(Object datetime) {
        this.datetime = datetime;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(altitude);
        dest.writeValue(passes);
        dest.writeValue(datetime);
    }

    public int describeContents() {
        return  0;
    }

}
