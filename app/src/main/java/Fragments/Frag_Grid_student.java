package Fragments;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.uniraj.developer.uniraj.Activity_college_list;
import com.uniraj.developer.uniraj.MainActivity;
import com.uniraj.developer.uniraj.Notification;
import com.uniraj.developer.uniraj.R;
import com.uniraj.developer.uniraj.ShowWebView;

import Custom_Items.CustomGrid;

/**
 * Created by Harshit jain on 15-Jul-16.
 */
public class Frag_Grid_student extends Fragment {
    GridView gridView;
    String[] strings = {
            "  About",
            " Syllabi",
            "UG\nAdmissions",
            " Sports\n Activities",
            "Special\nContacts",
            "    RTI\n    Info",
            "  Results",

    };
    int[] imageId = {
            R.drawable.header8,
            R.drawable.syllabus,
            R.drawable.ug,
            R.drawable.sports,
            R.drawable.spc,
            R.drawable.rti,
            R.drawable.res_1

    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (isNetworkAvailable(getActivity())) {
            View v = inflater.inflate(R.layout.frag_gridstudent, container, false);
            CustomGrid adapter = new CustomGrid(getActivity(), strings, imageId);
            gridView = (GridView) v.findViewById(R.id.grid_student);
            gridView.setAdapter(adapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Intent i = new Intent(getActivity(), ShowWebView.class);
                        i.putExtra("KeyLink", "http://www.uniraj.ac.in/index.php?mid=3110");
                        startActivity(i);
                    } else if (position == 1) {
                        Intent i = new Intent(getActivity(), ShowWebView.class);
                        i.putExtra("KeyLink", "http://www.uniraj.ac.in/index.php?mid=3102");
                        startActivity(i);
                    } else if (position == 2) {
                        Intent i = new Intent(getActivity(), ShowWebView.class);
                        i.putExtra("KeyLink", "http://www.uniraj.ac.in/index.php?mid=192&exid=11");
                        startActivity(i);

                    } else if (position == 3) {
                        Intent i = new Intent(getActivity(), ShowWebView.class);
                        i.putExtra("KeyLink", "http://www.uniraj.ac.in/index.php?mid=104");
                        startActivity(i);

                    } else if (position == 4) {
                        FragmentManager manager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = manager.beginTransaction();
                        Frag_SpecialContect contect = new Frag_SpecialContect();
                        fragmentTransaction.replace(R.id.myframe, contect);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    } else if (position == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uniraj.ac.in/rti-related/pdf/RTI25-Aug-2012.pdf"));
                        startActivity(i);

                    } else if (position == 6) {
                        Intent i = new Intent(getActivity(), ShowWebView.class);
                        i.putExtra("KeyLink", "http://result.uniraj.ac.in/");
                        startActivity(i);

                    }
                }
            });
            return v;
        } else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    getActivity());

            // set title
            alertDialogBuilder.setTitle("Connectivity");

            // set dialog message
            alertDialogBuilder
                    .setMessage("Internet Connectivity not found.\nClick OK to exit!")
                    .setCancelable(false)
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // if this button is clicked, close
                            // current activity
                            Intent i = new Intent(getActivity(), MainActivity.class);
                            startActivity(i);
                        }
                    });
            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            return inflater.inflate(R.layout.frag_gridstudent, container, false);
        }

    }


    public boolean isNetworkAvailable(final Context context) {
        return ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
