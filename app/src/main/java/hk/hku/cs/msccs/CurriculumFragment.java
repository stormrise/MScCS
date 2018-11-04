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


public class CurriculumFragment extends Fragment implements View.OnClickListener{
    private final static String TAG = "Curriculum";
    private static ImageView img_card1,img_card2,img_card3,img_card4;
    private static TextView text_card1,text_card2,text_card3,text_card4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_curriculum, container, false);
        return view;
    }

    @Override
    public void onClick(View v) {   //点击事件响应
        switch (v.getId()){
            case R.id.curr_view1_img:
                Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_1=new Intent(getContext(),ProOverview.class);
                startActivity(intent_1);
                break;
            case R.id.curr_view1_text:
                Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_2=new Intent(getContext(),ProOverview.class);
                startActivity(intent_2);
                break;
            case R.id.curr_view2_img:
                Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_3=new Intent(getContext(),pro_course.class);
                startActivity(intent_3);
                break;
            case R.id.curr_view2_text:
                Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_4=new Intent(getContext(),pro_course.class);
                startActivity(intent_4);
                break;
            case R.id.curr_view3_img:
                Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_5=new Intent(getContext(),duration.class);
                startActivity(intent_5);
                break;
            case R.id.curr_view3_text:
                Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_6=new Intent(getContext(),duration.class);
                startActivity(intent_6);
                break;
            case R.id.curr_view4_img:
                Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                    Intent intent_7=new Intent(getContext(),pro_regulation.class);
                    startActivity(intent_7);
                break;
            case R.id.curr_view4_text:
                Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_8=new Intent(getContext(),pro_regulation.class);
                startActivity(intent_8);
                break;
            default:
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView img_title=(ImageView)getActivity().findViewById(R.id.curr_title);
        //设置title的图片
        Glide.with(img_title.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Curriculum-1.jpg").into(img_title);
       //读取每一个图片
        img_card1=(ImageView)getActivity().findViewById(R.id.curr_view1_img);
        img_card2=(ImageView)getActivity().findViewById(R.id.curr_view2_img);
        img_card3=(ImageView)getActivity().findViewById(R.id.curr_view3_img);
        img_card4=(ImageView)getActivity().findViewById(R.id.curr_view4_img);
        //读取每个图片的text
        text_card1=(TextView)getActivity().findViewById(R.id.curr_view1_text);
        text_card2=(TextView)getActivity().findViewById(R.id.curr_view2_text);
        text_card3=(TextView)getActivity().findViewById(R.id.curr_view3_text);
        text_card4=(TextView)getActivity().findViewById(R.id.curr_view4_text);
        //设置监听器
        img_card1.setOnClickListener(this);
        img_card2.setOnClickListener(this);
        img_card3.setOnClickListener(this);
        img_card4.setOnClickListener(this);
        text_card1.setOnClickListener(this);
        text_card2.setOnClickListener(this);
        text_card3.setOnClickListener(this);
        text_card4.setOnClickListener(this);



    }
}
