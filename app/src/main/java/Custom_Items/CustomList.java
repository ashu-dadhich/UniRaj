package Custom_Items;

/**
 * Created by Ashu on 05-07-2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniraj.developer.uniraj.R;

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;

    public CustomList(Activity context,
                      String[] web) {
        super(context, R.layout.list_row, web);
        this.context = context;
        this.web = web;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_row, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(web[position]);
        ImageView im=(ImageView) rowView.findViewById(R.id.img);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:123456789");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                //startActivity(callIntent);
            }
        });
        return rowView;
    }

}