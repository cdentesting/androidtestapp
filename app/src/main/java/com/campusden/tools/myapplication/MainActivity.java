package com.campusden.tools.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer answer = 5;

        TextView answerDisplay = (TextView) findViewById(R.id.answer);
        answerDisplay.setText(answer);
    }
}
