package com.uniraj.developer.uniraj;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.text.SimpleDateFormat;
import java.util.Date;

import Fragments.Frag_Contactuni;
import Fragments.Frag_Credits;
import Fragments.Frag_Development;
import Fragments.Frag_UniMap;
import Fragments.Frag_blank;
import Fragments.Frag_enquiry;
import Fragments.Frag_grid;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //public ScheduleClient scheduleClient1;

    Fragment fragment;

    public boolean onCreateoptionMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }

    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "FB");
        {
            mnu1.setIcon(R.drawable.header1);
            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //scheduleClient1=new ScheduleClient(this);
        //scheduleClient1.doBindService();
        date_checker();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setDefaultFragment();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        }
        super.onBackPressed();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        fragment = new Frag_blank();
        Intent chooser = null;
        String share = "Check the Rajathan University App:\n http://cegrajasthan.in/testapp/";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, share);
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
        chooser = Intent.createChooser(intent, "Share");
        startActivity(chooser);




        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Home) {
            fragment = new Frag_grid();
        } else if (id == R.id.contact_us) {
            fragment = new Frag_Contactuni();
        } else if (id == R.id.uni_map) {
            fragment = new Frag_UniMap();

        } else if (id == R.id.Team) {
            fragment = new Frag_Development();
        } else if (id == R.id.Credits) {
            fragment = new Frag_Credits();
        } else if (id == R.id.nav_share) {
            fragment = new Frag_blank();
            Intent chooser = null;
            String share = "Check the Rajathan University App:\n http://cegrajasthan.in/testapp/";
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, share);
            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
            chooser = Intent.createChooser(intent, "Share");
            startActivity(chooser);
        }
        else if(id==R.id.enquiry){
//            Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
            fragment = new Frag_enquiry();
        }

        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.myframe, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void date_checker() {
        Date cDate = new Date();
        String todaysDate = new SimpleDateFormat("yyyy-MM-dd").format(cDate);
        Log.d("Date", todaysDate);
        String tDate = "2016-07-08";
        String educationalSessionStart = "2016-07-01";
        String InogrationOfStudentUnion = "2016-12-31";
        String UniversityEnrollmentDate = "2016-07-30";
        String EndingOfSupplymentryExams = "2016-09-15";
        String RegistrationDateForPrivateStudent = "2016-11-02";
        String Convocation = "2016-07-07";
        String DiwaliVacationStart = "2016-10-21";
        String DiwaliVacationEnd = "2016-11-1";
        String SemExams = "2016-11";
        String WinterVacationsStart = "2016-12-24";
        String WinterVacationsEnd = "2016-12-31";
        String EducationalTourEnd = "2017-02-15";
        String PracticalExamsEnd = "2017-02-28";
        String AnnualExams = "2017-03";
        String SemExam = "2017-05";
        String LastWorkingDay = "2017-04-30";
        String SummerVacationStart = "2017-05-16";
        String SummerVacationEnd = "2017-06-30";
        String Result = "2017-06-15";
        String NewSesssion = "2017-07-01";
        if (todaysDate.equals(tDate)) {
            custom_notify("test");
        } else if (todaysDate.equals(educationalSessionStart)) {
            custom_notify("educationalSessionStart");
        } else if (todaysDate.equals(InogrationOfStudentUnion)) {
            custom_notify("InogrationOfStudentUnion");
        } else if (todaysDate.equals(UniversityEnrollmentDate)) {
            custom_notify("UniversityEnrollmentDate");
        } else if (todaysDate.equals(EndingOfSupplymentryExams)) {
            custom_notify("EndingOfSupplymentryExams");
        } else if (todaysDate.equals(RegistrationDateForPrivateStudent)) {
            custom_notify("RegistrationDateForPrivateStudent");
        } else if (todaysDate.equals(Convocation)) {
            custom_notify("Convocation");
        } else if (todaysDate.equals(DiwaliVacationStart)) {
            custom_notify("DiwaliVacationStart");
        } else if (todaysDate.equals(DiwaliVacationEnd)) {
            custom_notify("DiwaliVacationEnd");
        } else if (todaysDate.equals(SemExams)) {
            custom_notify("SemExams");
        } else if (todaysDate.equals(WinterVacationsStart)) {
            custom_notify("WinterVacationsStart");
        } else if (todaysDate.equals(WinterVacationsEnd)) {
            custom_notify("WinterVacationsEnd");
        } else if (todaysDate.equals(EducationalTourEnd)) {
            custom_notify("EducationalTourEnd");
        } else if (todaysDate.equals(PracticalExamsEnd)) {
            custom_notify("PracticalExamsEnd");
        } else if (todaysDate.equals(AnnualExams)) {
            custom_notify("AnnualExams");
        } else if (todaysDate.equals(SemExam)) {
            custom_notify("SemExam");
        } else if (todaysDate.equals(LastWorkingDay)) {
            custom_notify("LastWorkingDay");
        } else if (todaysDate.equals(SummerVacationStart)) {
            custom_notify("SummerVacationStart");
        } else if (todaysDate.equals(SummerVacationEnd)) {
            custom_notify("SummerVacationEnd");
        } else if (todaysDate.equals(Result)) {
            custom_notify("Result");
        } else if (todaysDate.equals(NewSesssion)) {
            custom_notify("NewSesssion");
        }
    }

    public void custom_notify(String text) {
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        // Build notification
        // Actions are just fake
        android.app.Notification noti = new android.app.Notification.Builder(this)
                .setContentTitle("Notification")
                .setContentText(text).setSmallIcon(R.drawable.header)
                .setContentIntent(pIntent).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // hide the notification after its selected
        noti.flags |= android.app.Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, noti);
    }

    //    protected void onStop() {
//        // When our activity is stopped ensure we also stop the connection to the service
//        // this stops us leaking our activity into the system *bad*
//        if (scheduleClient1 != null)
//            scheduleClient1.doUnbindService();
//        super.onStop();
//    }
    public void setDefaultFragment() {
        Fragment fragment = new Frag_grid();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.myframe, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}


