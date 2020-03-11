package com.example.myapplication;

import android.view.View;

public class MyClickListener implements View.OnClickListener {

    private MainActivity activity;

    public MyClickListener(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        activity.textView.setText("Neuer Text");
    }
}
