package Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.uniraj.developer.uniraj.R;

/**
 * Created by Ashu on 26-07-2016.
 */
public class Frag_enquiry extends Fragment {
    String g_list[] = {
            "Complain",
            "Ragging",
            "Other"
    };
    Spinner s;
    EditText name;
    EditText num;
    EditText query;
    Button btn;
    View v;
    String subject;
    String body = "";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frag_enquiry, container, false);
        s = (Spinner) v.findViewById(R.id.g_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, g_list);
        s.setAdapter(adapter);
        btn = (Button) v.findViewById(R.id.g_btn);
        query = (EditText) v.findViewById(R.id.g_query_et);
        name = (EditText) v.findViewById(R.id.g_name_et);
        num = (EditText) v.findViewById(R.id.g_num_et);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(), "hi", Toast.LENGTH_SHORT).show();

                subject = s.getSelectedItem().toString()+" " +name.getText().toString() + " " + num.getText().toString();
                body = query.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "maninderbhui@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
        return v;
    }
}
