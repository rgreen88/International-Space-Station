package com.example.android.iss.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rynel on 12/7/2017.
 */

public class PassTimeAdapter {

    //creating private int mNumberOfTimesPassed
    private int mNumberOfTimesPassed;

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
