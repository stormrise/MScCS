package hk.hku.cs.msccs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class AdmissionFragment extends Fragment implements View.OnClickListener {
    private final static String TAG = "Admission";
    private static ImageView img_card1,img_card2,img_card3,img_card4,img_card5,img_card6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_admission, container, false);
        return view;
    }

    @Override
    public void onClick(View v) {   //点击事件响应
        switch (v.getId()){
            case R.id.admission_1_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_1=new Intent(getContext(),ad_1.class);
                startActivity(intent_1);
                break;
            case R.id.admission_2_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_2=new Intent(getContext(),ad_2.class);
                startActivity(intent_2);
                break;
            case R.id.admission_3_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_3=new Intent(getContext(),ad_3.class);
                startActivity(intent_3);
                break;
            case R.id.admission_4_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_4=new Intent(getContext(),ad_4.class);
                startActivity(intent_4);
                break;
            case R.id.admission_5_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_5=new Intent(getContext(),ad_5.class);
                startActivity(intent_5);
                break;
            case R.id.admission_6_img:
                //Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_6=new Intent(getContext(),ad_6.class);
                startActivity(intent_6);
                break;
            default:
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        img_card1=(ImageView)getActivity().findViewById(R.id.admission_1_img);
        img_card2=(ImageView)getActivity().findViewById(R.id.admission_2_img);
        img_card3=(ImageView)getActivity().findViewById(R.id.admission_3_img);
        img_card4=(ImageView)getActivity().findViewById(R.id.admission_4_img);
        img_card5=(ImageView)getActivity().findViewById(R.id.admission_5_img);
        img_card6=(ImageView)getActivity().findViewById(R.id.admission_6_img);

        //设置图片
        Glide.with(img_card1.getContext()).load(R.drawable.ad_adr).into(img_card1);
        Glide.with(img_card2.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ApplicationDeadlines.jpg").into(img_card2);
        Glide.with(img_card3.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeFees.jpg").into(img_card3);
        Glide.with(img_card4.getContext()).load(R.drawable.ad_words).into(img_card4);
        Glide.with(img_card5.getContext()).load(R.drawable.ad_infosess).into(img_card5);
        Glide.with(img_card6.getContext()).load(R.drawable.ad_faq).into(img_card6);

        //设置监听器
        img_card1.setOnClickListener(this);
        img_card2.setOnClickListener(this);
        img_card3.setOnClickListener(this);
        img_card4.setOnClickListener(this);
        img_card6.setOnClickListener(this);
        img_card5.setOnClickListener(this);



    }

}
