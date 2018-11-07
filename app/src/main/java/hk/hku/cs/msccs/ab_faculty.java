package hk.hku.cs.msccs;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ab_faculty extends AppCompatActivity {
    private final static String TAG = "ab_faculty";
   // private List<Guide_Content> card=new ArrayList<>();
 //   ImageView faculty_card_view1_image, cardimg2, cardimg3, cardimg4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ab_faculty);
//        faculty_card_view1_image = (ImageView)findViewById(R.id.faculty_card_view1_image);
//        Glide.with(faculty_card_view1_image.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/brochureLatestFull.jpg").into(faculty_card_view1_image);



    }

}
