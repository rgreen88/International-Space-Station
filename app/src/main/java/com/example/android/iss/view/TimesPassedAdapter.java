package com.example.android.iss.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.iss.R;

/**
 * Created by rynel on 12/7/2017.
 */

public class TimesPassedAdapter extends RecyclerView.Adapter<TimesPassedAdapter.NumberOfPassesViewHolder>{

    //creating private int mNumberOfTimesPassed
    private int mNumberOfTimesPassed;

    //constructor
    public TimesPassedAdapter(int numOfPasses){
        mNumberOfTimesPassed = numOfPasses;
    }

    //RecyclerView methods
    @Override
    public NumberOfPassesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForTimesPassed = R.layout.number_of_passes_list;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean attachImmediately = false;

        //inflating view
        View view = inflater.inflate(layoutIdForTimesPassed, viewGroup, attachImmediately);
        NumberOfPassesViewHolder viewHolder = new NumberOfPassesViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NumberOfPassesViewHolder holder, int position) {

        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberOfTimesPassed;
    }

    class NumberOfPassesViewHolder extends RecyclerView.ViewHolder{

        TextView listNumberOfPassesView;

        public NumberOfPassesViewHolder(View itemView){
            super(itemView);
        }

        public void bind (int listIndex){

            listNumberOfPassesView.setText(String.valueOf(listIndex));

        }
    }
}
