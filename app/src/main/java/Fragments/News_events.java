package Fragments;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.uniraj.developer.uniraj.MainActivity;
import com.uniraj.developer.uniraj.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Custom_Items.CustomList;
import Custom_Items.CustomList1;

/**
 * Created by Ashu on 08-07-2016.
 */
public class News_events extends AppCompatActivity {
    String[] news = {
            "",
            "",
            "",
            "",
            ""
    };
    List<String> news_links = new ArrayList<String>();
    String temp1 = "";
    ListView listView;
    //  ListView listView1;
    Button b;
    String url = "http://www.uniraj.ac.in";
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_events);
        if(isNetworkConnected()){
            new Title().execute();
            b = (Button) findViewById(R.id.news_btn);
            listView = (ListView) findViewById(R.id.news_list);
//        listView1=(ListView) findViewById(R.id.news_list1);


            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new Title().execute();
                }
            });
            //setListAdapter(new ArrayAdapter<List<String>>(this,android.R.layout.simple_list_item_1));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String url = news_links.get(position).toString();
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    //i.putExtra("KeyLink",url);
                    startActivity(i);
                }
            });
        }
        else{
            new AlertDialog.Builder(News_events.this)
                    .setTitle("Connectivity")
                    .setMessage("Internet Connectivity not found.\nClick OK to exit!")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent(News_events.this,MainActivity.class);
                            startActivity(i);
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    // Title AsyncTask
    private class Title extends AsyncTask<Void, Void, Void> {
        String title = "";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(News_events.this);
            mProgressDialog.setTitle("Rajasthan University");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            int start_index, end_index;
            try {
                int counter = 0;
                Document doc = Jsoup.connect(url).get();
                Elements trs = doc.select("table.table tr");

                //remove header row
                trs.remove(0);

                for (Element tr : trs) {
                    if (counter > 4) {
                        break;
                    }
                    Elements tds = tr.getElementsByTag("td");
                    Elements links = tds.select("a[href]");
                    for (Element link : links) {
                        String temp = link.toString();
                        start_index = temp.indexOf('"');
                        end_index = temp.indexOf('>');
                        temp1 = temp.substring(start_index + 1, end_index - 17);
                        news_links.add("http://www.uniraj.ac.in" + temp1);
                    }
                    Element td = tds.first();
                    title = td.text().toString();
                    news[counter] = title;
                    counter++;
                    //System.out.println("Blog: " + td.text());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            CustomList1 adapter=new CustomList1(News_events.this,news);
            listView.setAdapter(adapter);
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(News_events.this,
//                    android.R.layout.simple_list_item_1, android.R.id.text1, news);
//            listView.setAdapter(adapter);
//            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(News_events.this,
//                    android.R.layout.simple_list_item_1, android.R.id.text1, news_links);
//            listView1.setAdapter(adapter1);
            mProgressDialog.dismiss();
        }
    }
}
