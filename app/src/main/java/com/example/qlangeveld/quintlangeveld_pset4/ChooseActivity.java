package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    // For every story, there's a different button, that saves the right story in an intent.
    public void onSimpleStoryClicked(View view) {
        InputStream simple = getResources().openRawResource(R.raw.madlib0_simple);
        Story Simple = new Story(simple);

        Intent simpleIntent = new Intent(this, FillActivity.class);
        simpleIntent.putExtra("clickedStory", Simple);
        startActivity(simpleIntent);
    }

    public void onTarzanStoryClicked(View view) {
        InputStream tarzan = getResources().openRawResource(R.raw.madlib1_tarzan);
        Story Tarzan = new Story(tarzan);

        Intent tarzanIntent = new Intent(this, FillActivity.class);
        tarzanIntent.putExtra("clickedStory", Tarzan);
        startActivity(tarzanIntent);
    }

    public void onUniversityStoryClicked(View view) {
        InputStream university = getResources().openRawResource(R.raw.madlib2_university);
        Story University = new Story(university);

        Intent universityIntent = new Intent(this, FillActivity.class);
        universityIntent.putExtra("clickedStory", University);
        startActivity(universityIntent);
    }

    public void onClothesStoryClicked(View view) {
        InputStream clothes = getResources().openRawResource(R.raw.madlib3_clothes);
        Story Clothes = new Story(clothes);

        Intent clothesIntent = new Intent(this, FillActivity.class);
        clothesIntent.putExtra("clickedStory", Clothes);
        startActivity(clothesIntent);
    }

    public void onDanceStoryClicked(View view) {
        InputStream dance = getResources().openRawResource(R.raw.madlib4_dance);
        Story Dance = new Story(dance);

        Intent danceIntent = new Intent(this, FillActivity.class);
        danceIntent.putExtra("clickedStory", Dance);
        startActivity(danceIntent);
    }
}
