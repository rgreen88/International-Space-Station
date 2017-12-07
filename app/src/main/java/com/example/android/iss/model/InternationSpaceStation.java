
package com.example.android.iss.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InternationSpaceStation implements Parcelable
{

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    public final static Creator<InternationSpaceStation> CREATOR = new Creator<InternationSpaceStation>() {


        @SuppressWarnings({
            "unchecked"
        })
        public InternationSpaceStation createFromParcel(Parcel in) {
            return new InternationSpaceStation(in);
        }

        public InternationSpaceStation[] newArray(int size) {
            return (new InternationSpaceStation[size]);
        }

    }
    ;

    protected InternationSpaceStation(Parcel in) {
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.request = ((Request) in.readValue((Request.class.getClassLoader())));
        in.readList(this.response, (com.example.android.iss.model.Response.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public InternationSpaceStation() {
    }

    /**
     * 
     * @param response
     * @param message
     * @param request
     */
    public InternationSpaceStation(String message, Request request, List<Response> response) {
        super();
        this.message = message;
        this.request = request;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(message);
        dest.writeValue(request);
        dest.writeList(response);
    }

    public int describeContents() {
        return  0;
    }

}
