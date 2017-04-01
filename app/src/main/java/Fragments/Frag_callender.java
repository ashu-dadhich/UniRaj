package Fragments;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uniraj.developer.uniraj.R;

/**
 * Created by Ashu on 01-07-2016.
 */
public class Frag_callender extends Fragment {
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25;
    TextView t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_academic_callender, container, false);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/k010.TTF");
        t1 = (TextView) view.findViewById(R.id.textView1);
        t1.setTypeface(typeface);
        t2 = (TextView) view.findViewById(R.id.textView2);
        t2.setTypeface(typeface);
        t3 = (TextView) view.findViewById(R.id.textView3);
        t3.setTypeface(typeface);
        t27 = (TextView) view.findViewById(R.id.textView27);
        t27.setTypeface(typeface);
        t4 = (TextView) view.findViewById(R.id.textView4);
        t4.setTypeface(typeface);
        t5 = (TextView) view.findViewById(R.id.textView5);
        t5.setTypeface(typeface);
        t6 = (TextView) view.findViewById(R.id.textView6);
        t6.setTypeface(typeface);
        t7 = (TextView) view.findViewById(R.id.textView7);
        t7.setTypeface(typeface);
        t8 = (TextView) view.findViewById(R.id.textView8);
        t8.setTypeface(typeface);
        t31 = (TextView) view.findViewById(R.id.textView31);
        t31.setTypeface(typeface);
        t9 = (TextView) view.findViewById(R.id.textView9);
        t9.setTypeface(typeface);
        t32= (TextView) view.findViewById(R.id.textView32);
        t32.setTypeface(typeface);
        t10 = (TextView) view.findViewById(R.id.textView10);
        t10.setTypeface(typeface);
        t11 = (TextView) view.findViewById(R.id.textView11);
        t11.setTypeface(typeface);
        t33 = (TextView) view.findViewById(R.id.textView33);
        t33.setTypeface(typeface);
        t12 = (TextView) view.findViewById(R.id.textView12);
        t12.setTypeface(typeface);
        t13 = (TextView) view.findViewById(R.id.textView13);
        t13.setTypeface(typeface);
        t34 = (TextView) view.findViewById(R.id.textView34);
        t34.setTypeface(typeface);
        t14 = (TextView) view.findViewById(R.id.textView14);
        t14.setTypeface(typeface);
        t15 = (TextView) view.findViewById(R.id.textView15);
        t15.setTypeface(typeface);
        t16 = (TextView) view.findViewById(R.id.textView16);
        t16.setTypeface(typeface);
        t17 = (TextView) view.findViewById(R.id.textView17);
        t17.setTypeface(typeface);
        t18 = (TextView) view.findViewById(R.id.textView18);
        t18.setTypeface(typeface);
        t35 = (TextView) view.findViewById(R.id.textView35);
        t35.setTypeface(typeface);
        t36 = (TextView) view.findViewById(R.id.textView36);
        t36.setTypeface(typeface);
        t37 = (TextView) view.findViewById(R.id.textView37);
        t37.setTypeface(typeface);
        t19 = (TextView) view.findViewById(R.id.textView19);
        t19.setTypeface(typeface);
        t20 = (TextView) view.findViewById(R.id.textView20);
        t20.setTypeface(typeface);
        t21 = (TextView) view.findViewById(R.id.textView21);
        t21.setTypeface(typeface);
        t22 = (TextView) view.findViewById(R.id.textView22);
        t22.setTypeface(typeface);
        t38 = (TextView) view.findViewById(R.id.textView38);
        t38.setTypeface(typeface);
        t23 = (TextView) view.findViewById(R.id.textView23);
        t23.setTypeface(typeface);
        t39= (TextView) view.findViewById(R.id.textView39);
        t39.setTypeface(typeface);
        t24 = (TextView) view.findViewById(R.id.textView24);
        t24.setTypeface(typeface);
        t25 = (TextView) view.findViewById(R.id.textView25);
        t25.setTypeface(typeface);
        t28 = (TextView) view.findViewById(R.id.textView28);
        t28.setTypeface(typeface);
        t29 = (TextView) view.findViewById(R.id.textView29);
        t29.setTypeface(typeface);
        t30 = (TextView) view.findViewById(R.id.textView30);
        t30.setTypeface(typeface);
        t40 = (TextView) view.findViewById(R.id.textView40);
        t40.setTypeface(typeface);
        t41 = (TextView) view.findViewById(R.id.textView41);
        t41.setTypeface(typeface);

        return view;
    }
}
