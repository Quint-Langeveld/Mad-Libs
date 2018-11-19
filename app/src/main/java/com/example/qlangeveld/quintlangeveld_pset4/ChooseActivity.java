package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.InputStream;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void onSimpleStoryClicked(View view) {
        InputStream simple = getResources().openRawResource(R.raw.madlib0_simple);
        Story Simple = new Story(simple);

        // Next Intent...
    }

    public void onTarzanStoryClicked(View view) {

    }

    public void onUniversityStoryClicked(View view) {

    }

    public void onClothesStoryClicked(View view) {

    }

    public void onDanceStoryClicked(View view) {

    }
}
