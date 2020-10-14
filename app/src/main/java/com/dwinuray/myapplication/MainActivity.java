package com.dwinuray.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
*   Developed by dwinuray - 15 Oct 2020
*   - fb : facebook.com/dwinuray
*   - github : github.com/dwinuray
*
*   Dwi Nur Cahyo
* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}
