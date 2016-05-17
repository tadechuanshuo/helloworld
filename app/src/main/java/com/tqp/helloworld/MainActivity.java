package com.tqp.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tqp.library.MatchTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MatchTextView textView = (MatchTextView)findViewById(R.id.view);
    }
}
