package com.example.android.iss.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.iss.R;
import com.example.android.iss.databinding.ActivityMainBinding;
import com.example.android.iss.model.Request;
import com.example.android.iss.viewmodel.DataRetrieval;

import static com.example.android.iss.BR.station;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_ITEMS = 30;

    //instantiating RecyclerView and Adapter
    private TimesPassedAdapter mAdapter;
    private RecyclerView mNumberOfTimesPassed;

    //data binder
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //setting data binding
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.number_of_passes_list);
        DataRetrieval dataRetrieval = new DataRetrieval(new Request(true, true,
                "altitude", 3, "datetime")); //need clearer understanding here
        activityMainBinding.setStation(dataRetrieval);

        //binding rv
        mNumberOfTimesPassed = findViewById(R.id.rv_recyclerView);

        //LinearLayoutManager for managing items in RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumberOfTimesPassed.setLayoutManager(layoutManager);
        mNumberOfTimesPassed.setHasFixedSize(true); //<--check later

        mAdapter = new TimesPassedAdapter(NUM_ITEMS);
        mNumberOfTimesPassed.setAdapter(mAdapter);

    }
}
