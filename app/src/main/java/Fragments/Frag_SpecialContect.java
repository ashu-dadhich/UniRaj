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
 * Created by Harshit jain on 14-Jul-16.
 */
public class Frag_SpecialContect extends Fragment {
    String num[] = {
                    "tel:01412362100",
                    "tel:01412201898",
                    "tel:108",
                    "tel:01412610633",
                    "tel:7891091111",
                    "tel:01412204536",
                    "tel:01412207906"
    };
    ListView list;
    String c[] = {
                  "Police Station Gandhi Circle\n0141-2362100",
                  "Fire\n0141-2201898",
                  "Ambulance\n108",
                  "Nearest Police Station\n0141-2610633",
                  "Garima Helpline Number\n(91)-7891091111",
                  "Railway Station\n0141-2204536",
                  "Bus Station\n0141-2207906"

    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_specialcontect, container, false);
        CustomList adapter = new
                CustomList(getActivity(), c);
        list = (ListView) v.findViewById(R.id.listView_sc);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "Calling", Toast.LENGTH_SHORT).show();
                String temp=num[position];
                Uri number = Uri.parse(temp);
                Intent call = new Intent(Intent.ACTION_DIAL, number);
                startActivity(call);
            }
        });
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
