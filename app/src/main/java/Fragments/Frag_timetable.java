package Fragments;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.uniraj.developer.uniraj.MainActivity;
import com.uniraj.developer.uniraj.R;
import com.uniraj.developer.uniraj.ShowWebView;

import Custom_Items.CustomList1;

/**
 * Created by Ashu on 04-07-2016.
 */
public class Frag_timetable extends Fragment {

    ListView list;
    String[] values =
            {

                    "Master in Journalism & Mass Comm. II Semester Exam, May. 2016",
                    "Revised M.PEd. II Semester Old Scheme Exam May,2016",
                    "Revised B.Ed. Special Education II Semester Exam May,2016",
                    "Revised B.A.,LL.B. Five Year Integrated Course VIII Semester Exam May,2016",
                    "Revised B.A.,LL.B. Five Year Integrated Course VI Semester Exam May,2016",
                    "Revised B.A., LL.B. Hons. Five Year Integrated Course VIII Semester Exam May,2016",
                    "Revised M.A. English II-Semester Exam May 2016",
                    "Revised M.A. Pub. Admn. II-Semester Exam May 2016",
                    "Revised M.A. Sociology II-Semester Exam May 2016",
                    "Revised M.A./M.Sc. Anthropology II-Semester Exam May 2016",
                    "Revised M.A./M.Sc. Psychology II-Semester Exam May 2016",
                    "Revised M.A. Urdu II-Semester Exam May 2016",
                    "Revised M.Com. ABST II-Semester Exam May 2016",
                    "Revised M.Com. EAFM II-Semester Exam May 2016",
                    "Revised M.Com. Bus. Admn. II-Semester Exam May 2016",
                    "Revised MHRM II-Semester Exam May 2016",
                    "Revised MIB II-Semester Exam May 2016",
                    "Revised MCCA II-Semester Exam May 2016",
                    "Revised MFC II-Semester Exam May 2016",
                    "Revised MBA Serv. Mang. II-Semester Exam May 2016",
                    "Revised MBA II-Semester Exam May 2016",
                    "Revised MBA Executive II-Semester Exam May 2016",
                    "Revised M.A. Pol. Science II Semester Exam May,2016",
                    "Revised M.A. MVA II Semester Exam May,2016",
                    "Revised M.A. Music II Semester Exam May,2016",
                    "Revised M.A. Drawing & Painting II Semester Exam May,2016",
                    "Revised M.A. Hindi II Semester Exam May,2016",
                    "Revised M.A. Sanskrit II Semester Exam May,2016",
                    "Revised M.A. Philosophy II Semester Exam May,2016",
                    "Revised M.A. French II Semester Exam May,2016",
                    "Revised M.A. Economics II Semester Exam May,2016",
                    "Revised M.Sc. Biotechnology II Semester Exam May,2016",
                    "Revised M.Sc. IT II Semester Exam May,2016",
                    "Revised Dual Degree B.Tech., M.Tech. CCT II Semester Exam May,2016",
                    "Revised MCA II Semester Exam May,2016",
                    "Revised M.Sc. Botany II Semester Exam May,2016",
                    "Revised M.Sc. Environmental Science II Semester Exam May,2016",
                    "Revised M.Sc. Physics II Semester Exam May,2016",
                    "Revised M.A./M.Sc. Mathematics II Semester Exam May,2016",
                    "Revised M.Sc. Geology II Semester Exam May,2016",
                    "Revised M.A. Pol. Science IV Semester Exam May,2016",
                    "Revised M.A. Drawing & Painting IV Semester Exam May,2016",
                    "Revised M.A. Music IV Semester Exam May,2016",
                    "Revised M.A. MVA IV Semester Exam May,2016",
                    "Revised M.A. English IV Semester Exam May,2016",
                    "Revised M.A. Public Administration IV Semester Exam May,2016",
                    "Revised M.A. Sociology IV Semester Exam May,2016",
                    "Revised M.A. Hindi IV Semester Exam May,2016",
                    "Revised M.A. Sanskrit IV Semester Exam May,2016",
                    "Revised M.Com. ABST IV Semester Exam May,2016",
                    "Revised M.Com. EAFM IV Semester Exam May,2016",
                    "Revised M.Com. Bus. Admn. IV Semester Exam May,2016",
                    "Revised MHRM IV Semester Exam May,2016",
                    "Revised MIB IV Semester Exam May,2016",
                    "Revised MCCA IV Semester Exam May,2016",
                    "Revised MFC IV Semester Exam May,2016",
                    "Revised MBA Services Management IV Semester Exam May,2016",
                    "Revised MBA IV Semester Exam May,2016",
                    "Revised M.Sc. Biotechnology IV Semester Exam May,2016",
                    "Revised Dual Degree B.Tech., M.Tech. CCT IV Semester Exam May,2016",
                    "Revised MCA IV Semester Exam May,2016",
                    "M.Sc. Botany IV Semester Exam May,2016",
                    "Revised M.Sc. Environmental Science IV Semester Exam May,2016",
                    "Revised M.Sc. Physics IV Semester Exam May,2016",
                    "Revised M.A/M.Sc. Mathematics IV Semester Exam May,2016",
                    "Revised M.Sc. Geology IV Semester Exam May,2016",
                    "Revised M.Sc. Home Science IV Semester Exam May,2016",
                    "Revised B.A., LL.B. Hons. Five Year Integrated Course II Semester Exam May,2016",
                    "Revised B.A., LL.B. Hons. Five Year Integrated Course IV Semester Exam May,2016",
                    "Revised B.A., LL.B. Hons. Five Year Integrated Course VI Semester Exam May,2016",
                    "Revised B.A., LL.B. Hons. Five Year Integrated Course X Semester Exam May,2016",
                    "Revised B.PEd. II Semester Exam May,2016",
                    "Revised M.Ed. II Semester Exam May,2016",
                    "Revised Master of Library and Information Science II Semester Exam May,2016",
                    "Revised PG Diploma in Human Ecology II Semester Exam May,2016",
                    "Revised PGDCA II Semester Exam May,2016",
                    "Revised PG Diploma in Environmental Studies II Semester Exam May,2016",
                    "Revised B.Tech./M.Tech. CCT VIII Semester Exam May,2016",
                    "Revised B.Tech./M.Tech. CCT VI Semester Exam May,2016",
                    "Revised M.A. History Alternative Scheme II Semester Exam May,2016",
                    "Revised M.Mus. II Semester Exam May,2016",
                    "Revised M.A. Dramatics II Semester Exam May,2016",
                    "Revised M.A. Rajasthani Language Literature & Culture II Semester Exam May,2016",
                    "Revised M.Museology & Conservation II Semester Exam May,2016",
                    "Revised M.Sc. Home Science II Semester Exam May,2016",
                    "Revised M.A./M.Sc. Geography II Semester Exam May,2016",
                    "Revised M.A./M.Sc. Statistics II Semester Exam May,2016",
                    "Revised M.Sc. Microbiology II Semester Exam May,2016",
                    "Revised M.Sc. Zoology II Semester Exam May,2016",
                    "M.Sc. Chemistry II Semester Exam May,2016",
                    "Revised M.A. Urdu IV Semester Exam May,2016",
                    "Revised M.A. Philosophy IV Semester Exam May,2016",
                    "Revised M.A. French IV Semester Exam May,2016",
                    "Revised M.A. Economics IV Semester Exam May,2016",
                    "Revised M.A. History Alternative IV Semester Exam May,2016",
                    "Revised M.Mus. IV Semester Exam May,2016",
                    "Revised M.A. Dramatics IV Semester Exam May,2016",
                    "Revised M.A. Rajasthani Language Literature & Culture IV Semester Exam May,2016",
                    "Revised M.Museology & Conservation IV Semester Exam May,2016",
                    "Revised M.A./M.Sc. Psychology IV Semester Exam May,2016",
                    "Revised M.A./M.Sc. Anthropology IV Semester Exam May,2016",
                    "Revised MBA Executive IV Semester Exam May,2016",
                    "Revised MBA Executive VI Semester Exam May,2016",
                    "Revised M.A./M.Sc. Geography IV Semester Exam May,2016",
                    "Revised M.A./M.Sc. Statistics IV Semester Exam May,2016",
                    "Revised M.Sc. Microbiology IV Semester Exam May,2016",
                    "Revised M.Sc. Zoology IV Semester Exam May,2016",
                    "Revised M.Sc. Chemistry IV Semester Exam May,2016",
                    "Revised B.A.,LL.B. Five Year Integrated Course IX Semester Exam May,2016",
                    "Revised B.A.,LL.B. Five Year Integrated Course IV Semester Exam May,2016",
                    "Revised B.A.,LL.B. Five Year Integrated Course II Semester Exam May,2016",
                    "Revised M.PEd. II Semester Exam May,2016",
                    "Revised MJMC II Semester Exam May,2016",
                    "Revised M.PEd. IV Semester Exam May,2016",
                    "Revised MJMC IV Semester Exam May,2016",
                    "Revised LL.M. II Semester Exam May,2016",
                    "Revised LL.M. Human Rights and Value Education II Semester Exam May,2016",
                    "Revised LL.M. Human Rights and Value Education IV Semester Exam May,2016",
                    "Revised LL.M. IV Semester Exam May,2016",
                    "B.B.A. Part-I Semester-II Examination June,2016",
                    "B.A. Part-II-Deaf, Dumb & Blind Student Regular Exam-2016",
                    "B.A. Part-I-Deaf, Dumb & Blind Student Regular, Non-Collegiate, Ex-student Exam-2016",
                    "Revised M.Phil. History & Indian Culture II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Jain Studies II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Gender Studies II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. South Asia Studies II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Political Science II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Gandhian Studies II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Philosophy II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Sociology II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Public Admn. II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Mathematics II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Geography II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. ABST II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Hindi II Semester Exam 2015 Held in May, 2016",
                    "M.Phil. Economics II Semester Exam 2015 Held in May, 2016",
                    "LL.B. I Year Exam May 2016-Revised",
                    "LL.B. II Academic Year Exam May 2016-Revised",
                    "LL.B. III Professional Year Exam May 2016-Revised",
                    "PG Diploma in Labour Law, Labour Welfare and Personnal Mang. Exam May 2016-Revised",
                    "PG Diploma in Criminology & Criminal Admn. Exam May 2016-Revised",
                    "PG Diploma in Taxation Laws and Practice Exam May 2016-Revised",
                    "PG Diploma in Environment Protection Laws Exam May 2016",
                    "BCA Par-III Exam 2016",
                    "BCA Par-II Exam 2016",
                    "BCA Par-I Exam 2016",
                    "BBA Par-I Exam 2016 Annual Scheme",
                    "Bachelor of Library & Info. Sc. Exam 2016",
                    "B.P.Ed. Exam 2016",
                    "PG Diploma in Yoga Education Exam 2016",
                    "PG Diploma in Dramatics Bridge Course Exam 2016",
                    "C.Y.Ed. Exam 2016",
                    "MJMC Previous/Final Exam 2016",
                    "B.Sc. Part-II Biotechnology Exam 2016 Integrated Course-Revised",
                    "Revised dates of PG Exam time table for Examination 2016.New",
                    "II-Revised PG Examination time table for Exam 2016.New",
                    "M.A. History Previous and Final Exam 2016",
                    "M.A. Hindi Previous and Final Exam 2016",
                    "M.A./M.Sc. Mathematics Previous and Final Exam 2016",
                    "M.A./M.Sc. Geography Previous and Final Exam 2016",
                    "M.A. English Previous and Final Exam 2016",
                    "M.A. Sanskrit Previous and Final Exam 2016",
                    "M.A. Sociology Previous and Final Exam 2016",
                    "M.A. Public Admn. Previous and Final Exam 2016",
                    "M.Sc. Bio-technology Previous and Final Exam 2016",
                    "M.Sc. Home Sc. Previous and Final Exam 201",
                    "M.Sc. Physics Previous and Final Exam 2016",
                    "M.Sc. Bio-Chemistry Previous and Final Exam 2016",
                    "M.Sc. Botany Previous and Final Exam 2016",
                    "M.Sc. Economics Previous and Final Exam 2016",
                    " M.Sc. Chemistry Previous and Final Exam 2016",
                    "M.Sc. Microbiology Previous and Final Exam 2016",
                    "M.Sc. Geology Previous and Final Exam 2016",
                    "M.Sc. Zoology Previous and Final Exam 2016",
                    "M.Sc. Pharmaceutical Chemistry Previous and Final Exam 2016",
                    "M.Sc. Environment Science Previous and Final Exam 2016",
                    " Revised M.A. Drawing & Painting Previous and Final Exam 2016",
                    "M.A. French Previous and Final Exam 2016",
                    " M.A./M.Sc. Psychology Previous and Final Exam 2016",
                    "M.A. Urdu Previous and Final Exam 2016",
            };

    String[] link = {

            "http://www.uniraj.ac.in/examination/may-sem16/41N.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/710N.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/76R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/616R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/617R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/74R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/11R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/12R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/13R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/14R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/15R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/16R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/17R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/18R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/19R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/110R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/111R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/112R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/113R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/114R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/115R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/116R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/21R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/22R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/23R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/24R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/25R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/26R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/27R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/28R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/29R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/31R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/32R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/33R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/34R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/35R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/36R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/37R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/38R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/39R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/41R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/42R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/43R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/44R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/45R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/46R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/47R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/48R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/49R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/51R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/52R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/53R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/54R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/55R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/56R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/57R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/58R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/59R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/61R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/62R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/63R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/64.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/65R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/66R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/67R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/68R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/69R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/71.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/72.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/73.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/75.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/77R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/78R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/79R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/81R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/82R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/83R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/84R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/85R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/210R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/211R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/212R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/213R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/214R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/310R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/311R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/312R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/313R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/314R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/315.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/410R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/411R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/412R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/413R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/414R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/415R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/416R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/417R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/418R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/419R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/420R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/510R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/511R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/610R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/611R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/612R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/613R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/614R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/615.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/618.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/619.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/710R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/712R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/713R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/714R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/715R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/716R.pdf",
            "http://www.uniraj.ac.in/examination/may-sem16/717R.pdf",
            "http://www.uniraj.ac.in/examination/may2016/401.pdf",
            "http://www.uniraj.ac.in/examination/may2016/346.pdf",
            "http://www.uniraj.ac.in/examination/may2016/345.pdf",
            "http://www.uniraj.ac.in/examination/may2016/309R.pdf",
            "http://www.uniraj.ac.in/examination/may2016/314.pdf",
            "http://www.uniraj.ac.in/examination/may2016/313.pdf",
            "http://www.uniraj.ac.in/examination/may2016/312.pdf",
            "http://www.uniraj.ac.in/examination/may2016/311.pdf",
            "http://www.uniraj.ac.in/examination/may2016/310.pdf",
            "http://www.uniraj.ac.in/examination/may2016/308.pdf",
            "http://www.uniraj.ac.in/examination/may2016/307.pdf",
            "http://www.uniraj.ac.in/examination/may2016/306.pdf",
            "http://www.uniraj.ac.in/examination/may2016/305.pdf",
            "http://www.uniraj.ac.in/examination/may2016/304.pdf",
            "http://www.uniraj.ac.in/examination/may2016/303.pdf",
            "http://www.uniraj.ac.in/examination/may2016/302.pdf",
            "http://www.uniraj.ac.in/examination/may2016/301.pdf",
            "http://www.uniraj.ac.in/examination/may2016/11-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/12-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/13-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/14-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/15-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/16-26april16.pdf",
            "http://www.uniraj.ac.in/examination/may2016/17.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/120.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/119.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/118.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/117.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/116.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/115.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/114.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/113.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/112.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/111.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/BSC-2part-biotech-29march16.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/Revised_TT.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/REV-PGTT2016-14march16.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/1.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/2.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/3.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/4.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/5.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/6.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/7.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/8.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/018.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/017.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/016.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/015.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/014.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/013.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/011.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/010.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/009.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/008.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/007.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/006.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/004R.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/003.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/002.pdf",
            "http://www.uniraj.ac.in/examination/MARCH16/001.pdf",
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (isNetworkAvailable(getActivity())) {
            View v = inflater.inflate(R.layout.fragment_timetable, container, false);
            list = (ListView) v.findViewById(R.id.list_timetable);
            CustomList1 adapter = new CustomList1(getActivity(), values);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String url=link[position].toString();
//        Intent i = new Intent(getActivity(),ShowWebView.class);
//        String custom_url="https://docs.google.com/gview?embedded=true&url=";
//        custom_url+=url;
//        i.putExtra("KeyLink",custom_url);
//        startActivity(i);
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    //i.putExtra("KeyLink",url);
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
                    }).setIcon(android.R.drawable.ic_dialog_alert);
            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            return inflater.inflate(R.layout.fragment_timetable, container, false);
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