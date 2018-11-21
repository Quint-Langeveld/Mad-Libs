package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    // go to the choose menu
    public void onStartClick(View view) {
        Intent intent = new Intent(StartActivity.this, ChooseActivity.class);
        startActivity(intent);
    }
}
