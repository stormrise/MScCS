package hk.hku.cs.msccs;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class OtherFragment extends Fragment implements View.OnClickListener {
    private final static String TAG = "other";
    private static ImageView other_title,alumni,news,event,resource,vs;
    private static TextView alumni_text,news_text,event_text,resource_text,vs_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.other_view1_img:
                //Toast.makeText(getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_1=new Intent(getContext(),Alumni.class);
                startActivity(intent_1);
                break;
            case R.id.other_view1_text:
                //Toast.makeText(getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_2=new Intent(getContext(),Alumni.class);
                startActivity(intent_2);
                break;
            case R.id.other_view2_img:
                //Toast.makeText(getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_3=new Intent(getContext(),News.class);
                startActivity(intent_3);
                break;
            case R.id.other_view2_text:
                //Toast.makeText(getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_4=new Intent(getContext(),News.class);
                startActivity(intent_4);
                break;
            case R.id.other_view3_img:
                //Toast.makeText(getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_5=new Intent(getContext(),Event.class);
                startActivity(intent_5);
                break;
            case R.id.other_view3_text:
                //Toast.makeText(getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_6=new Intent(getContext(),Event.class);
                startActivity(intent_6);
                break;
            case R.id.other_view4_img:
                //Toast.makeText(getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_7=new Intent(getContext(),Resource.class);
                startActivity(intent_7);
                break;
            case R.id.other_view4_text:
                //Toast.makeText(getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_8=new Intent(getContext(),Resource.class);
                startActivity(intent_8);
                break;
            case R.id.other_view5_img:
                //Toast.makeText(getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_9=new Intent(getContext(),Vs.class);
                startActivity(intent_9);
                break;
            case R.id.other_view5_text:
                //Toast.makeText(getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_10=new Intent(getContext(),Vs.class);
                startActivity(intent_10);
                break;
            default:
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        other_title=(ImageView)getActivity().findViewById(R.id.other_title);
        Glide.with(other_title.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/StuRes.jpg")
                .into(other_title);

        event=(ImageView)getActivity().findViewById(R.id.other_view3_img);
        Glide.with(event.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2018-19/CareerFair2018Sep-5.jpg")
                .into(event);
        alumni=(ImageView)getActivity().findViewById(R.id.other_view1_img);
        Glide.with(alumni.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/Alumni-SH-Christmas2_s.jpg")
                .into(alumni);
        resource=(ImageView)getActivity().findViewById(R.id.other_view4_img);
        Glide.with(other_title.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/MainLib.jpg")
                .into(resource);
        news=(ImageView)getActivity().findViewById(R.id.other_view2_img);
        Glide.with(news.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2018-19/WelcomingReception2018-1.jpg")
                .into(news);
        vs= (ImageView)getActivity().findViewById(R.id.other_view5_img);
        Glide.with(vs.getContext())
                .load(R.drawable.vs)
                .into(vs);

        alumni_text=(TextView)getActivity().findViewById(R.id.other_view1_text);
        news_text=(TextView)getActivity().findViewById(R.id.other_view2_text);
        event_text=(TextView)getActivity().findViewById(R.id.other_view3_text);
        resource_text=(TextView)getActivity().findViewById(R.id.other_view4_text);
        vs_text=(TextView)getActivity().findViewById(R.id.other_view5_text);

        alumni_text.setOnClickListener(this);
        news_text.setOnClickListener(this);
        event_text.setOnClickListener(this);
        resource_text.setOnClickListener(this);
        vs_text.setOnClickListener(this);

        alumni.setOnClickListener(this);
        news.setOnClickListener(this);
        event.setOnClickListener(this);
        resource.setOnClickListener(this);
        vs.setOnClickListener(this);


    }
}
