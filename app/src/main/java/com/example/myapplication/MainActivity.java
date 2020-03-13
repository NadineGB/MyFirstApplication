package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView textView;

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());

        final AppCompatImageButton button = findViewById(R.id.image);
        textView = findViewById(R.id.textfield);

        // erste möglichkeit
        button.setOnClickListener(this);
    }

    private void startSecondActivity() {
        final Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image:
                startSecondActivity();
                // textView.setText(String.format("%d", ++counter));
            default:
                break;
        }
    }

}
