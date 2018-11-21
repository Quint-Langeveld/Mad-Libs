package com.example.qlangeveld.quintlangeveld_pset4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FillActivity extends AppCompatActivity {

    Story currentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill);
        Intent intent = getIntent();
        currentStory = (Story) intent.getSerializableExtra("clickedStory");
        TextView sortText = findViewById(R.id.sortWord);
        String inFrontOfTextBar = (currentStory.getNextPlaceholder() + ":");
        sortText.setText(inFrontOfTextBar);

        String upperText = "Type in your words, "+ currentStory.getPlaceholderRemainingCount() + " to go:";
        TextView countText = findViewById(R.id.countText);
        countText.setText(upperText);
    }

    public void chooseWord(View view) {
        // put chosen word in placeholder
        TextView setWord = findViewById(R.id.editText);
        String word = setWord.getText().toString();
        currentStory.fillInPlaceholder(word);

        // change count of upper text
        String upperText = "Type in your words, "+ currentStory.getPlaceholderRemainingCount() + " to go:";
        TextView countText = findViewById(R.id.countText);
        countText.setText(upperText);

        // change text in front of textBar and clear out textBar
        TextView sortText = findViewById(R.id.sortWord);
        String inFrontOfTextBar = (currentStory.getNextPlaceholder() + ":");
        sortText.setText(inFrontOfTextBar);


        String inTextBar = "";
        setWord.setText(inTextBar);

        // if all placeholders are filled in, go to next interface with the text!
        if (currentStory.isFilledIn()) {
            Intent intent = new Intent(this, TextActivity.class);
            intent.putExtra("filledStory", currentStory);
            startActivity(intent);
            finish();
        }
    }

}
