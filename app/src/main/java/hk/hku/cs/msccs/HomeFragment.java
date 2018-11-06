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
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;

public class HomeFragment extends Fragment implements View.OnClickListener{
    //parameters
    private final static String TAG = "HomeActivity";
    //private List<Guide_Content> card = new ArrayList<>();//Jsoup 弃用
    TextView bannerText;
    ImageView cardimg1, cardimg2, cardimg3, cardimg4;
    //ImageView bannerImage;
    BGABanner bannerImage;
    int count =0;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "HomeActivity Start");
        //getFlow_text();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {//equals mainActivity onCreated method
        super.onActivityCreated(savedInstanceState);
        //UI init must below this class
        //add getActivity(). before findViewById
        bannerImage = getActivity().findViewById(R.id.banner);
        bannerText = getActivity().findViewById(R.id.banner_text);
        cardimg1 = (ImageView) getActivity().findViewById(R.id.home_card_view1_image);
        cardimg2 = (ImageView) getActivity().findViewById(R.id.home_card_view2_image);
        cardimg3 = (ImageView) getActivity().findViewById(R.id.home_card_view3_image);
        cardimg4 = (ImageView) getActivity().findViewById(R.id.home_card_view4_image);
        //调用网络图片
        //Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider1.jpg").into(bannerImage);
        //Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider_Admission.jpg").into(bannerImage);
        Glide.with(cardimg1.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/brochureLatestFull.jpg").into(cardimg1);
        Glide.with(cardimg2.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeSchedule.jpg").into(cardimg2);
        Glide.with(cardimg3.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeFees.jpg").into(cardimg3);
        Glide.with(cardimg4.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ApplicationDeadlines.jpg").into(cardimg4);
        initBanner();

        //点击事件
        bannerImage.setOnClickListener(this);
        cardimg1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {   //点击事件响应
        switch (v.getId()){
//            case R.id.banner:
//            //点击banner，另一种方法，可重新构造
//                if(count%2==1){
//                    bannerText.setText("Department of Computer Science 香港大學計算機系");
//                    Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider1.jpg").into(bannerImage);
//                    count++;
//                }else {
//                    bannerText.setText("Master of Science in Computer Science 計算機科學理科碩士課程");
//                    Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider_Admission.jpg").into(bannerImage);
//                    count++;
//                }
//
//                break;
            case R.id.home_card_view1_image:
                Intent intent_1=new Intent(getContext(),ProOverview.class);
                startActivity(intent_1);
                break;
            case R.id.home_card_view2_image:

                break;
            case R.id.home_card_view3_image:

                break;
            case R.id.home_card_view4_image:

                break;
        }
    }

    void initBanner(){
        //构造banner
        bannerImage.setAdapter(new BGABanner.Adapter<ImageView, String>() {
            @Override
            public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
                Glide.with(bannerImage.getContext())
                        .load(model)
                        .into(itemView);
            }
        });
        //banner的两张图片和对应的文字
        bannerImage.setData(
                Arrays.asList("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider1.jpg", "https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider_Admission.jpg"),
                Arrays.asList("Department of Computer Science 香港大學計算機系", "Master of Science in Computer Science 計算機科學理科碩士課程"));

    }

}
