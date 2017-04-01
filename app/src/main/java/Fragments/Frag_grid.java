package Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.uniraj.developer.uniraj.Activity_college_list;
import com.uniraj.developer.uniraj.News_events;
import com.uniraj.developer.uniraj.Notification;
import com.uniraj.developer.uniraj.R;

import com.uniraj.developer.uniraj.FAQs;
import com.uniraj.developer.uniraj.ShowWebView;

import Custom_Items.CustomGrid;


public class Frag_grid extends Fragment {

    GridView gridView;
    String[] strings = {
            "  About\n  UniRaj",
            "Colleges",
            " Student\nCorner",
            "Academic\nProgramme",
            "Academic\nCalendar",
            "   Time\n   Table",
            "Notification",
            "  Latest\nNews",
            "   Maps",
            "ContactUs",
            "Faculty",
            "   FAQs"
    };
    int[] imageId = {
            R.drawable.header8,
            R.drawable.header3,
            R.drawable.st_corner,
            R.drawable.header1,
            R.drawable.header2,
            R.drawable.headert,
            R.drawable.notif,
            R.drawable.events1,
            R.drawable.header4,
            R.drawable.header7,
            R.drawable.faculty,
            R.drawable.faq_ic
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_grid, container, false);
        CustomGrid adapter = new CustomGrid(getActivity(), strings, imageId);
        gridView = (GridView)v.findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_About about = new Frag_About();
                    fragmentTransaction.replace(R.id.myframe,about);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==1){
                    Intent i =new Intent(getActivity(),Activity_college_list.class);
                    startActivity(i);
                }else if (position==2){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_Grid_student grid_student = new Frag_Grid_student();
                    fragmentTransaction.replace(R.id.myframe,grid_student);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==3){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_AcaPrograms acaPrograms=new Frag_AcaPrograms();
                    fragmentTransaction.replace(R.id.myframe,acaPrograms);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==4){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_callender callender=new Frag_callender();
                    fragmentTransaction.replace(R.id.myframe,callender);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==5){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_timetable timetable = new Frag_timetable();
                    fragmentTransaction.replace(R.id.myframe,timetable);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==6){
                    Intent i=new Intent(getActivity(),Notification.class);
                    startActivity(i);
                }
                else if(position==7){
                    Intent i=new Intent(getActivity(),News_events.class);
                    startActivity(i);
                }
                else if(position==8){
                    double latitude = 26.8886;
                    double longitude = 75.8138;
                    String label = "Rajasthan University";
                    String uriBegin = "geo:" + latitude + "," + longitude;
                    String query = latitude + "," + longitude + "(" + label + ")";
                    String encodedQuery = Uri.encode(query);
                    String uriString = uriBegin + "?q=" + encodedQuery + "&z=20";
                    Uri uri = Uri.parse(uriString);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position==9){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_contact_us contact_us = new Frag_contact_us();
                    fragmentTransaction.replace(R.id.myframe,contact_us);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                else if (position==10){
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    Frag_Faculty faculty = new Frag_Faculty();
                    fragmentTransaction.replace(R.id.myframe,faculty);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==11){
                    Intent i=new Intent(getActivity(),FAQs.class);
                    startActivity(i);
                }

            }
        });
        return v;

            }
        }



