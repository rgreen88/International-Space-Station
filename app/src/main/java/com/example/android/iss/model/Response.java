
package com.example.android.iss.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response implements Parcelable
{

    @SerializedName("risetime")
    @Expose
    private Object risetime;
    @SerializedName("duration")
    @Expose
    private Object duration;
    public final static Creator<Response> CREATOR = new Creator<Response>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Response createFromParcel(Parcel in) {
            return new Response(in);
        }

        public Response[] newArray(int size) {
            return (new Response[size]);
        }

    }
    ;

    protected Response(Parcel in) {
        this.risetime = ( in.readValue((Object.class.getClassLoader())));
        this.duration = ( in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param duration
     * @param risetime
     */
    public Response(Object risetime, Object duration) {
        super();
        this.risetime = risetime;
        this.duration = duration;
    }

    public Object getRisetime() {
        return risetime;
    }

    public void setRisetime(Object risetime) {
        this.risetime = risetime;
    }

    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(risetime);
        dest.writeValue(duration);
    }

    public int describeContents() {
        return  0;
    }

}
