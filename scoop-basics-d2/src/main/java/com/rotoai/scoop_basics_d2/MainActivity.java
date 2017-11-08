package com.rotoai.scoop_basics_d2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crumbsandcoffee.scoop_basics_d2.R;
import com.lyft.scoop.Scoop;

public class MainActivity extends AppCompatActivity {

    private Scoop activityScoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
