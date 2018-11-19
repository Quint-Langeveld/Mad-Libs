package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    Story currentStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Intent intent = getIntent();
        currentStory = (Story) intent.getSerializableExtra("filledStory");
        TextView storyText = findViewById(R.id.storyText);
        storyText.setText(currentStory.toString());
    }
}
