package com.example.android.iss.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.iss.R;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_ITEMS = 30;

    //instantiating RecyclerView and Adapter
    private PassTimeAdapter mAdapter;
    private RecyclerView mNumberOfTimesPassed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding rv
        mNumberOfTimesPassed = findViewById(R.id.rv_recyclerView);

        //LinearLayoutManager for managing items in RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumberOfTimesPassed.setLayoutManager(layoutManager);
        //mNumberOfTimesPassed.setHasFixedSize(true); <--check later


    }
}
