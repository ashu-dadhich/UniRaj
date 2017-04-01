package Fragments;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.uniraj.developer.uniraj.MainActivity;
import com.uniraj.developer.uniraj.R;
import com.uniraj.developer.uniraj.ShowWebView;

import Custom_Items.CustomList1;

/**
 * Created by Harshit jain on 7/3/2016.
 */
public class Frag_AcaPrograms extends Fragment {

    String[] s ={
            "Ph.D. Programmes",
            "M.Phil. Programmes",
            "Post Postgraduate Diploma Programmes",
            "Postgraduate Programmes",
            "Postgraduate Diploma Programmes",
            "Five Year Integrated Programmes",
            "Undergraduate Programmes",
            "Post Diploma Programmes",
            "Diploma Programmes",
            "Certificate Programmes",
            "Letral Entry Programmes",
    };

    String[] link = {
            "http://www.uniraj.ac.in/index.php?mid=2201&ccid=1",
            "http://www.uniraj.ac.in/index.php?mid=2202&ccid=2",
            "http://www.uniraj.ac.in/index.php?mid=2203&ccid=3",
            "http://www.uniraj.ac.in/index.php?mid=2204&ccid=4",
            "http://www.uniraj.ac.in/index.php?mid=2205&ccid=5",
            "http://www.uniraj.ac.in/index.php?mid=2206&ccid=6",
            "http://www.uniraj.ac.in/index.php?mid=2207&ccid=7",
            "http://www.uniraj.ac.in/index.php?mid=2208&ccid=8",
            "http://www.uniraj.ac.in/index.php?mid=2209&ccid=9",
            "http://www.uniraj.ac.in/index.php?mid=2210&ccid=10",
            "http://www.uniraj.ac.in/index.php?mid=2211&ccid=11",
    };

    ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (isNetworkAvailable(getActivity())) {
            View v=inflater.inflate(R.layout.fragment_academic_programs, container, false);
            list=(ListView) v.findViewById(R.id.list_ap);
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
            return inflater.inflate(R.layout.fragment_academic_programs, container, false);
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

