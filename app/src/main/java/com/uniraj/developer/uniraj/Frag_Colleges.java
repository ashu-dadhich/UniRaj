package com.uniraj.developer.uniraj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Custom_Items.Listmodel;

/**
 * Created by happy on 03-07-2016.
 */
public class Frag_Colleges extends BaseAdapter{
    List<Listmodel> list;
    Context context;
    LayoutInflater layoutInflater;
    public Frag_Colleges(Context context, List<Listmodel> list){
        this.context= context;
        this.list = list;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.frag_colleges,null);
        Listmodel listmodel = (Listmodel)list.get(position);
        TextView t1 = (TextView)convertView.findViewById(R.id.textView1);
         t1.setText(listmodel.getName());
        ImageView imgview = (ImageView)convertView.findViewById(R.id.imageView);
        imgview.setImageResource(listmodel.getImgpath());
        return convertView;
    }
}
