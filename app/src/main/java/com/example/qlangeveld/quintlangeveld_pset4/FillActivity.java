package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FillActivity extends AppCompatActivity {

    Story currentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill);
        Intent intent = getIntent();
        currentStory = (Story) intent.getSerializableExtra("clickedStory");
        TextView setWord = findViewById(R.id.editText);
        setWord.setText(currentStory.getNextPlaceholder());

        String upperText = "Type in your words, "+ currentStory.getPlaceholderRemainingCount() + " to go:";
        TextView countText = findViewById(R.id.countText);
        countText.setText(upperText);
    }

    public void chooseWord(View view) {
        // put chosen word in placeholder
        TextView setWord = findViewById(R.id.editText);
        String word = setWord.getText().toString();
//        word.
        currentStory.fillInPlaceholder(word);

        // change count of upper text
        String upperText = "Type in your words, "+ currentStory.getPlaceholderRemainingCount() + " to go:";
        TextView countText = findViewById(R.id.countText);
        countText.setText(upperText);

        // change text in textBar
        setWord.setText(currentStory.getNextPlaceholder());

//      if all placeholders are filled in, go to next interface with the text!
        if (currentStory.isFilledIn()) {
            Intent intent = new Intent(this, TextActivity.class);
            intent.putExtra("filledStory", currentStory);
            startActivity(intent);
        }
    }

}
