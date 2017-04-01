package Fragments;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.uniraj.developer.uniraj.MainActivity;
import com.uniraj.developer.uniraj.R;
import com.uniraj.developer.uniraj.ShowWebView;

import Custom_Items.CustomList1;

/**
 * Created by Ashu on 01-07-2016.
 */
public class Frag_links extends Fragment {
    String[] s={
            "URATPG-2016",
            "Pre. B.PEd. Entrance Exam 2016",
            "CCT Admission 2016",
            "RULET-2016",
            "USIEF-Full Bright fellowship",
            "Online Examination Form-2015-16",
            "UG Admission 2016",
            "Pre. M.PEd. Entrance Exam 2016",
            "Univ. Law Entrance Test (ULET)- 2016",
            "Pre.M.Ed. Entrance Test (PMET)-2016",
            "Pre B.Ed.-M.Ed. Entrance Test-2016"
    };
    String[] link = {
            "http://www.uniraj.ac.in/index.php?mid=192&exid=10",
            "http://www.pbped2016.org/",
            "http://uniraj.edu.in/cct/",
            "http://www.uniraj.ac.in/index.php?mid=192&exid=5",
            "http://www.usief.org.in/Fellowship/Fellowships-for-Indian-Citizens.aspx",
            "http://www.uniraj.ac.in/index.php?mid=192&exid=16",
            "http://uniraj.edu.in/adm/",
            "http://www.pmped2016.org/",
            "http://www.uniraj.ac.in/index.php?mid=192&exid=6",
            "http://www.uniraj.ac.in/index.php?mid=192&exid=14",
            "http://www.uniraj.ac.in/index.php?mid=192&exid=17",
    };
    ListView list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (isNetworkAvailable(getActivity())) {
            View v=inflater.inflate(R.layout.fragment_links, container, false);
            list=(ListView) v.findViewById(R.id.list_link);
            CustomList1 adapter=new CustomList1(getActivity(),s);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String url = link[position].toString();
                    Intent i = new Intent(getActivity(), ShowWebView.class);
                    i.putExtra("KeyLink", url);
                    startActivity(i);
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
                    .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // if this button is clicked, close
                            // current activity
                            Intent i=new Intent(getActivity(),MainActivity.class);
                            startActivity(i);
                        }
                    });
            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            return inflater.inflate(R.layout.fragment_links,container,false);
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
