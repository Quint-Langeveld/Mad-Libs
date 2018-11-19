package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class FillActivity extends AppCompatActivity {

    Story currentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill);
        Intent intent = getIntent();
        currentStory = (Story) intent.getSerializableExtra("clickedStory");
    }

    public void chooseWord(View view) {
        TextView getword = findViewById(R.id.editText);
        String word = getword.getText().toString();

        TextView showWords = findViewById(R.id.showWords);
        List<String> words = new List<String>();

        words.add(word);


        showWords.setText(word);
    }

}
