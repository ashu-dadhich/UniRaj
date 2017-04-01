package com.uniraj.developer.uniraj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.uniraj.developer.uniraj.R;

/**
 * Created by happy on 08-07-2016.
 */
public class FAQs extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18;
    int click_counter1 = 0;
    int click_counter2 = 0;
    int click_counter3 = 0;
    int click_counter4 = 0;
    int click_counter5 = 0;
    int click_counter6 = 0;
    int click_counter7 = 0;
    int click_counter8 = 0;
    int click_counter9 = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_faq);
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView3);
        t3 = (TextView) findViewById(R.id.textView4);
        t4 = (TextView) findViewById(R.id.textView5);
        t5 = (TextView) findViewById(R.id.textView6);
        t6 = (TextView) findViewById(R.id.textView7);
        t7 = (TextView) findViewById(R.id.textView8);
        t8 = (TextView) findViewById(R.id.textView9);
        t9 = (TextView) findViewById(R.id.textView10);
        t10 = (TextView) findViewById(R.id.textView11);
        t11 = (TextView) findViewById(R.id.textView12);
        t12 = (TextView) findViewById(R.id.textView13);
        t13 = (TextView) findViewById(R.id.textView14);
        t14 = (TextView) findViewById(R.id.textView15);
        t15 = (TextView) findViewById(R.id.textView16);
        t16 = (TextView) findViewById(R.id.textView17);
        t17 = (TextView) findViewById(R.id.textView18);
        t18 = (TextView) findViewById(R.id.textView19);
        textClick();

    }

    public void textClick() {

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter1 == 0) {
                    t2.setText("Go to ‘Contact Us’ icon and then you will get list of options whom you want to contact.");
                    click_counter1=1;
                }
                else{
                    t2.setText("");
                    click_counter1=0;
                }
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter2 == 0) {
                    t4.setText("Click on ‘Department’ option and then select particular course to know about the faculty. Then you will be redirected to the sub-courses from where you will be able to select any one subcourse to know about the details of its respective faculty.");
                    click_counter2=1;
                }
                else{
                    t4.setText("");
                    click_counter2=0;
                }
            }

        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter3 == 0) {
                    t6.setText("People will set their own reminders on particular date and along with this, they will get automatic alerts about every important events and occasions.");
                    click_counter3=1;
                }
                else{
                    t6.setText("");
                    click_counter3=0;
                }


            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter4 == 0) {
                    t8.setText("Click on the icon named ‘Colleges’ . The eight colleges under Rajasthan University will going to be appear after clicking on the icon.   ");
                    click_counter4=1;
                }
                else{
                    t8.setText("");
                    click_counter4=0;
                }


            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter5 == 0) {
                    t10.setText("Select ‘Academic Calendar’ option on the screen and here you will get to know about all the sessional information.");
                    click_counter5=1;
                }
                else{
                    t10.setText("");
                    click_counter5=0;
                }

            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter6 == 0) {
                    t12.setText("This is the mobile application from where you will get all the essential details, alerts and information about each and every events, examination and holidays easily.");
                    click_counter6=1;
                }
                else{
                    t12.setText("");
                    click_counter6=0;
                }

            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter7 == 0) {
                    t14.setText("Select the icon named ‘Latest News’ and then click on refresh button to get updated about the latest  information  and useful events.");
                    click_counter7=1;
                }
                else{
                    t14.setText("");
                    click_counter7=0;
                }
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter8 == 0) {
                    t16.setText("Yes, you can also select any option by clicking on the upper leftmost corner of the application.");
                    click_counter8=1;
                }
                else{
                    t16.setText("");
                    click_counter8=0;
                }
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter9 == 0) {
                    t18.setText("Yes, you can. The only thing you have to do is click on the upper leftmost icon and then select share option from the given list. From this, you can share the link of this application.  ");
                    click_counter9=1;
                }
                else{
                    t18.setText("");
                    click_counter9=0;
                }
            }
        });
    }
}
