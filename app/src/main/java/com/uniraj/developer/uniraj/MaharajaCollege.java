package com.uniraj.developer.uniraj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by happy on 04-07-2016.
 */
public class MaharajaCollege extends AppCompatActivity {
    TextView t;
    Button web;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_maharaja);
        web = (Button)findViewById(R.id.button1);
       // final String url = "http://www.universitymaharajacollege.ac.in/";
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MaharajaCollege.this,ShowWebView.class);
                i.putExtra("KeyLink","http://www.universitymaharajacollege.ac.in/");
                startActivity(i);
            }
        });
    }
    public  void btn_email(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","info@universitymaharajacollege.ac.in", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }
}
