package com.example.android.iss.data;

import com.example.android.iss.model.Request;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class RetrofitHelper {

    public static final String BASE_URL = "http://api.open-notify.org/";

    public static Retrofit create() {
        Retrofit retrofitPasses = new Retrofit.Builder()
                .baseUrl( BASE_URL )
                .addConverterFactory(GsonConverterFactory.create() )
                .build();

        return retrofitPasses;
    }


    public static Call<Request> getRequestLat(String version ) {
        Retrofit retrofit = create();
        RetrofitService service = retrofit.create( RetrofitService.class );

        return service.getLatitude( version );
    }

    public static Call<Request> getRequestLong(String version ) {
        Retrofit retrofit = create();
        RetrofitService service = retrofit.create( RetrofitService.class );

        return service.getLongitude( version );
    }

    public static Call<Request> getRequestPasses(String version ) {
        Retrofit retrofit = create();
        RetrofitService service = retrofit.create( RetrofitService.class );

        return service.getPasses( version );
    }

    public interface RetrofitService {

        @GET("iss-pass.json?lat=LAT&lon=LON")
        Call<Request> getLatitude( @Path("lat") String version);

        @GET("iss-now.json")
        Call<Request> getPasses( @Path("passes") String version);

        @GET("iss-pass.json?lat=LAT&lon=LON")
        Call<Request> getLongitude( @Path("long") String version);
    }

}
