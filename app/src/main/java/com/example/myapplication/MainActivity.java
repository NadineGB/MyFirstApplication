package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppCompatImageButton button = findViewById(R.id.image);
        textView = findViewById(R.id.textfield);

        // erste möglichkeit
        button.setOnClickListener(this);

        // zweite möglichkeit
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("Neuer Text");
            }
        });

        // dritte möglichkeit
        button.setOnClickListener(clickListener);

        // vierte möglichketi
        button.setOnClickListener(new MyClickListener(this));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.image:
                textView.setText("Neuer Text");
            default:
                break;
        }
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.image:
                    textView.setText("Neuer Text");
                default:
                    break;
            }
        }
    };

}
