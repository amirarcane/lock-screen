package com.amirarcane.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.amirarcane.lockscreen.activity.EnterPinActivity;

public class MainActivity extends AppCompatActivity {

    public static final String FONT_TEXT = "font/ALEAWB.TTF";
    public static final String FONT_NUMBER = "font/BLKCHCRY.TTF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button normal = (Button) findViewById(R.id.normal);
        Button setPin = (Button) findViewById(R.id.setPin);
        Button setFont = (Button) findViewById(R.id.setFont);
        Button setPinAndFont = (Button) findViewById(R.id.setPinAndFont);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // start the activity, It handles the setting and checking
                Intent intent = new Intent(MainActivity.this, EnterPinActivity.class);
                startActivity(intent);

            }
        });

        setPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // set pin instead of checking it
                Intent intent = EnterPinActivity.getIntent(MainActivity.this, true);
                startActivity(intent);

            }
        });

        setFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // setting font for library
                Intent intent = EnterPinActivity.getIntent(MainActivity.this, FONT_TEXT, FONT_NUMBER);
                startActivity(intent);
            }
        });

        setPinAndFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // setting font for library and set pin instead of checking it
                Intent intent = EnterPinActivity.getIntent(MainActivity.this, true, FONT_TEXT, FONT_NUMBER);
                startActivity(intent);
            }
        });

    }
}
