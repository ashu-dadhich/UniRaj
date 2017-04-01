package com.uniraj.developer.uniraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Custom_Items.Listmodel;


public class Activity_college_list extends AppCompatActivity {
    ListView listView;
    Listmodel listmodel;
    List<Listmodel> list;
    Frag_Colleges frag_colleges;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.college_list);
        listView = (ListView) findViewById(R.id.listView);
        int img[] = {R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon, R.drawable.college_icon};
        String name[] = {"University Commerce College", "University Maharaja College", "University Maharani College", "University Rajasthan College", "University Five Year Law College", "University Law College", "University Law College II", "R A Podar Institute of Management"};
        list = new ArrayList<Listmodel>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Activity_college_list.this, CommerceCollege.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(Activity_college_list.this, MaharajaCollege.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(Activity_college_list.this, MaharaniCollege.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(Activity_college_list.this, RajCollege.class);
                    startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(Activity_college_list.this, UniversityLaw.class);
                    startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(Activity_college_list.this, LawCollege.class);
                    startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(Activity_college_list.this, LawCollege2.class);
                    startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(Activity_college_list.this, PoddarCollege.class);
                    startActivity(i);
                }
            }
        });

        for (int i = 0; i < 8; i++) {
            listmodel = new Listmodel();
            listmodel.setImgpath(img[i]);
            listmodel.setName(name[i]);
            list.add(listmodel);
        }
        frag_colleges = new Frag_Colleges(Activity_college_list.this, list);
        listView.setAdapter(frag_colleges);


    }
}
