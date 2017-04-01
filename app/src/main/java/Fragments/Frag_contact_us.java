package Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.uniraj.developer.uniraj.R;

import Custom_Items.CustomList;

/**
 * Created by Ashu on 01-07-2016.
 */
public class Frag_contact_us extends Fragment {
    String num[] = {
            "tel:01412708824",
            "tel:01412707863",
            "tel:01412706813",
            "tel:01412710978",
            "tel:01412708824",
            "tel:01412710548",
            "tel:01412711070",
            "tel:01412710995",
            "tel:01412707866",
    };
    ListView list;
    String c[] = {
            "Examination Enquiry No:\n0141-2708824",
            "Vice-Chancellor Office\tContact No: \n" +
                    "0141-2707863, 2710465",
            "Registrar Office\tContact No: \n" +
                    "0141-2706813",
            "Controller of Finance & Financial Advisor\tContact No:\t\t\t" +
                    "2710978",
            "Controller of Examinations\tContact No:\n" +
                    "0141-2708824",
            "University Engineer\tContact No:\n" +
                    "0141-2710548",
            "Public Relation Office\tContact No:\n" +
                    "0141-2711070",
            "Student Advisory Bureau\tContact No:\n" +
                    "0141-2710995",
            "Central Library\tContact No:\n" +
                    "0141-2707866"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact_us, container, false);
        CustomList adapter = new
                CustomList(getActivity(), c);
        list = (ListView) v.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "Calling", Toast.LENGTH_SHORT).show();
                String temp = num[position];
                Uri number = Uri.parse(temp);
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
