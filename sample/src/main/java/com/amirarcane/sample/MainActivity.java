package com.amirarcane.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amirarcane.lockscreen.activity.EnterPinActivity;

public class MainActivity extends AppCompatActivity {

    private static final String FONT_TEXT = "font/ALEAWB.TTF";
    private static final String FONT_NUMBER = "font/BLKCHCRY.TTF";

    private static final int REQUEST_CODE = 123;

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
//                startActivity(intent);

                // for handling back press
                startActivityForResult(intent, REQUEST_CODE);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CODE:
            if (resultCode == EnterPinActivity.RESULT_BACK_PRESSED) {
                Toast.makeText(MainActivity.this, "back pressed", Toast.LENGTH_LONG).show();
            }
            break;
        }
    }
}
