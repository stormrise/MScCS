package hk.hku.cs.msccs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.card.MaterialCardView;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;

public class HomeFragment extends Fragment {
    //parameters
    private final static String TAG = "HomeActivity";
    private List<Guide_Content> card = new ArrayList<>();
    ImageView cardimg1, cardimg2, cardimg3, cardimg4;
    ImageView bannerImage;
    //BGABanner bannerImage;


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
        cardimg1 = (ImageView) getActivity().findViewById(R.id.home_card_view1_image);
        cardimg2 = (ImageView) getActivity().findViewById(R.id.home_card_view2_image);
        cardimg3 = (ImageView) getActivity().findViewById(R.id.home_card_view3_image);
        cardimg4 = (ImageView) getActivity().findViewById(R.id.home_card_view4_image);
//        Glide.with(bannerImage.getContext()).load(R.drawable.home_slider1).into(bannerImage);
//        Glide.with(bannerImage.getContext()).load(R.drawable.home_slider_admission).into(bannerImage);
//        Glide.with(cardimg1.getContext()).load(R.drawable.home_brochurelatestfull).into(cardimg1);
//        Glide.with(cardimg2.getContext()).load(R.drawable.home_programme_schedule).into(cardimg2);
//        Glide.with(cardimg3.getContext()).load(R.drawable.home_programme_fees).into(cardimg3);
//        Glide.with(cardimg4.getContext()).load(R.drawable.home_application_deadlines).into(cardimg4);
        //initBanner();

        cardimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

//    void initBanner(){
//        bannerImage.setAdapter(new BGABanner.Adapter<ImageView, String>() {
//            @Override
//            public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
//                Glide.with(bannerImage.getContext())
//                        .load(model)
//                        .into(itemView);
//            }
//        });
//
//        bannerImage.setData(
//                Arrays.asList("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider1.jpg", "https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider_Admission.jpg"),
//                Arrays.asList("Department of Computer Science", "Master of Science in Computer Science"));
//
//    }

}
