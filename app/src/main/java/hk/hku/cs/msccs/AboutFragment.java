package hk.hku.cs.msccs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class AboutFragment extends Fragment implements View.OnClickListener{
    private final static String TAG = "About";
    private static ImageView about_card_view1_image,about_card_view2_image;
    private static TextView about_card_view1_text,about_card_view2_text;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "fragment about create");
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        about_card_view1_image=(ImageView)getActivity().findViewById(R.id.about_card_view1_image);
        about_card_view2_image=(ImageView)getActivity().findViewById(R.id.about_card_view2_image);
        //读取每个图片的text
        about_card_view1_text=(TextView)getActivity().findViewById(R.id.about_card_view1_text);
        about_card_view2_text=(TextView)getActivity().findViewById(R.id.about_card_view2_text);
        //设置监听器
        about_card_view1_image.setOnClickListener(this);
        about_card_view2_image.setOnClickListener(this);
        about_card_view1_text.setOnClickListener(this);
        about_card_view2_text.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {   //点击事件响应
        switch (v.getId()){
            case R.id.about_card_view1_image:
                //Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_1=new Intent(getContext(),ab_mess.class);
                startActivity(intent_1);
                break;
            case R.id.about_card_view1_text:
                //Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_2=new Intent(getContext(),ab_mess.class);
                startActivity(intent_2);
                break;
            case R.id.about_card_view2_image:
                //Toast.makeText(img_card1.getContext(),"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_3=new Intent(getContext(),ab_faculty.class);
                startActivity(intent_3);
                break;
            case R.id.about_card_view2_text:
                //Toast.makeText(img_card1.getContext(),"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_4=new Intent(getContext(),ab_faculty.class);
                startActivity(intent_4);
                break;
            default:
                break;
        }
    }
}
