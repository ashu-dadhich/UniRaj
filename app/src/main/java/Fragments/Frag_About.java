package Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniraj.developer.uniraj.R;

/**
 * Created by Harshit jain on 7/3/2016.
 */
public class Frag_About extends Fragment {
    TextView t1, t2;
    ImageView im;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/k010.TTF");
        t1 = (TextView) view.findViewById(R.id.textsanskrit);
        t1.setTypeface(typeface);
        t2 = (TextView) view.findViewById(R.id.textsanskrit);
        t2.setText("/keksZfo'oL; txr% izfr\"Bk");
        im = (ImageView) view.findViewById(R.id.mail_id);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "vcuorj@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        return view;

    }


}
