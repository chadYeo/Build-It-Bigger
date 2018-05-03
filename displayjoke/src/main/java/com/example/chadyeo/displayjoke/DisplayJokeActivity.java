package com.example.chadyeo.displayjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    private TextView jokeTextView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        jokeTextView = (TextView) findViewById(R.id.joke_textView);
        String jokeResult = getIntent().getStringExtra("jokeResult");
        jokeTextView.setText(jokeResult);
    }
}
