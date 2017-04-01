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
 * Created by Harshit jain on 06-Jul-16.
 */
public class Frag_Faculty extends Fragment {
    String[] Dept = {

            "Faculty of Arts",
            "Faculty of Commerce",
            "Faculty of Education",
            "Faculty of Fine Arts",
            "Faculty of Law",
            "Faculty of Management",
            "Faculty of Science",
            "Faculty of SocialScience",
    };
    String[] link = {
            "http://www.uniraj.ac.in/index.php?mid=4101&did=301",
            "http://www.uniraj.ac.in/index.php?mid=4201&did=307",
            "http://www.uniraj.ac.in/index.php?mid=4301&did=310",
            "http://www.uniraj.ac.in/index.php?mid=4401&did=314",
            "http://www.uniraj.ac.in/index.php?mid=4501&did=318",
            "http://www.uniraj.ac.in/index.php?mid=4601&did=201",
            "http://www.uniraj.ac.in/index.php?mid=4701&did=319",
            "http://www.uniraj.ac.in/index.php?mid=4801&did=329",
    };
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (isNetworkAvailable(getActivity())) {
            View v = inflater.inflate(R.layout.frag_faculty, container, false);
            list = (ListView) v.findViewById(R.id.list_faculty);
            CustomList1 adapter = new CustomList1(getActivity(), Dept);
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
            return inflater.inflate(R.layout.frag_faculty, container, false);
        }

    }


    public boolean isNetworkAvailable(final Context context) {
        return ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Dept));
        //   CustomList customList=new CustomList(get)
    }

}

