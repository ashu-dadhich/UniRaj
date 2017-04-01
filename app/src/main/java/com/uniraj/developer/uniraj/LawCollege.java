package com.uniraj.developer.uniraj;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by happy on 13-07-2016.
 */
public class LawCollege extends AppCompatActivity {
    Button web;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_law);
        web = (Button) findViewById(R.id.button1);
        // final String url = "http://www.universitymaharajacollege.ac.in/";
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LawCollege.this, ShowWebView.class);
                i.putExtra("KeyLink", "http://www.universitylawcollege.ac.in/");
                startActivity(i);
            }
        });
    }

}
