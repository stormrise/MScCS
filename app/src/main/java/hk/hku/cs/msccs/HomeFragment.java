package hk.hku.cs.msccs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    //parameters
    private final static String TAG = "HomeActivity";
    private List<Guide_Content> card = new ArrayList<>();
    ImageView bannerImage, cardimg1, cardimg2, cardimg3, cardimg4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "HomeActivity Start");
        //getFlow_text();
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {//equals mainActivity onCreated method
        super.onActivityCreated(savedInstanceState);
        //UI init must below this class
        bannerImage = (ImageView) getActivity().findViewById(R.id.banner);//add getActivity(). before findViewById
        cardimg1 = (ImageView) getActivity().findViewById(R.id.home_card_view1_image);
        cardimg2 = (ImageView) getActivity().findViewById(R.id.home_card_view2_image);
        cardimg3 = (ImageView) getActivity().findViewById(R.id.home_card_view3_image);
        cardimg4 = (ImageView) getActivity().findViewById(R.id.home_card_view4_image);
        Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider1.jpg").into(bannerImage);
        //Glide.with(bannerImage.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/Slider%20Images/Slider_Admission.jpg").into(bannerImage);
        Glide.with(cardimg1.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/brochureLatestFull.jpg").into(cardimg1);
        Glide.with(cardimg2.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeSchedule.jpg").into(cardimg2);
        Glide.with(cardimg3.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeFees.jpg").into(cardimg3);
        Glide.with(cardimg4.getContext()).load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ApplicationDeadlines.jpg").into(cardimg4);


    }

}
