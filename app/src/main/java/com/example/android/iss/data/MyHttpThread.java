package com.example.android.iss.data;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class MyHttpThread implements Runnable{

    public static final String TAG = "ISS http thread tag";

    String BaseURL; //ISS base api url
    HttpURLConnection urlConnection;

    public MyHttpThread(String BaseURL) {
        this.BaseURL = BaseURL;
    }

    @Override
    public void run() {
        try {
            //convert string url to url object
            URL url = new URL( BaseURL );

            //open connection with the passed url
            urlConnection = (HttpURLConnection) url.openConnection();

            //get the response with an input stream
            InputStream inputStream = new BufferedInputStream( urlConnection.getInputStream() );

            //read the response using a scanner
            Scanner scanner = new Scanner( inputStream );

            while( scanner.hasNext() )
                Log.d(TAG, "run: " + scanner.nextLine() );

            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
